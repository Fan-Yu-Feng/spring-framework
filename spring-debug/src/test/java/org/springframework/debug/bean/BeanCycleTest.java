package org.springframework.debug.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.debug.config.AppConfig;
import org.springframework.debug.service.impl.StudentBeanServiceImpl;

/**
 * @author yohong
 * @date 2024/4/29 23:34
 * @description desc
 */
public class BeanCycleTest {
	
	@Test
	public void beanCycleTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// context.refresh();
		StudentBeanServiceImpl student = context.getBean(StudentBeanServiceImpl.class);
		student.testLookUp();
		System.out.println("student : " + student);
	}
	
	@Test
	public void lookUpTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// context.refresh();
		StudentBeanServiceImpl student = context.getBean(StudentBeanServiceImpl.class);
		student.testLookUp();
		student.testLookUp();
		student.testLookUp();
		student.testLookUp();
		System.out.println("student : " + student);
	}
	
	
	
	
}
