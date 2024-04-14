package org.springframework.debug;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.debug.service.impl.StudentBeanServiceImpl;

/**
 * @author fanyufeng
 * @date 2024/2/1 16:45
 * @description
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext("org.springframework.service.*");
		StudentBeanServiceImpl studentBeanServiceImpl = (StudentBeanServiceImpl) annotationConfigApplicationContext.getBean("studentBeanService");
		studentBeanServiceImpl.printName("asd");
		System.out.println("----"+ studentBeanServiceImpl);
	}
}