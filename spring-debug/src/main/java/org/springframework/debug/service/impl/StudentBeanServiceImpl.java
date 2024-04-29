package org.springframework.debug.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.debug.bean.LookUpBean;
import org.springframework.debug.bean.Student;
import org.springframework.debug.service.BeanService;
import org.springframework.stereotype.Service;

/**
 * @author fanyufeng
 * @date 2024/2/1 16:56
 * @description
 */
@Service("studentBeanServiceImpl")
public class StudentBeanServiceImpl implements BeanService {
	
	@Autowired
	private Student student;
	@Autowired
	private LookUpBean lookUpBean;
	
	
	@Override
	public void printName(String name) {
		System.out.println(name);
	}
	
	
	@Lookup("lookUpBean")
	public LookUpBean lookUpMethod() {
		return null;
	}
	
	public void testLookUp() {
		// 需要将 student 改成多例 bean
		System.out.println("testLookUp lookUpBean  = " + lookUpMethod());
	}
}
