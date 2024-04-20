package org.springframework.debug.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yohong
 * @date 2024/4/20 23:35
 * @description desc
 */
public class BeanTest {
	
	
	/**
	 * 重复的bean 注入问题
	 */
	@Test
	public void repeatBeanInjectTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("inject-value.xml");
		
		Student student = ctx.getBean(Student.class);
		System.out.println("student : " + student);
	}
}
