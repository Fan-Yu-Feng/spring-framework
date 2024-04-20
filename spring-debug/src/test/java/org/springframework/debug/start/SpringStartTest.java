package org.springframework.debug.start;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.debug.MyTestBean;
import org.springframework.debug.config.AppConfig;
import org.springframework.debug.service.BeanService;
import org.testng.annotations.Test;

/**
 * @author yohong
 * @date 2024/4/14 10:54
 * @description Spring debug 测试
 */
public class SpringStartTest {
	
	@Test
	public void springStartTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(context);
		int i = xmlBeanDefinitionReader.loadBeanDefinitions("spring.xml");
		MyTestBean myTestBean = (MyTestBean) context.getBean("myTestBean");
		System.out.println("myTestBean = " + myTestBean);
		BeanService beanService = (BeanService) context.getBean("studentBeanServiceImpl");
		beanService.printName("student");
	}
}
