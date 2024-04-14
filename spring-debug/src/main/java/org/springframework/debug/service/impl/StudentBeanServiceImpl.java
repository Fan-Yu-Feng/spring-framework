package org.springframework.debug.service.impl;

import org.springframework.debug.service.BeanService;
import org.springframework.stereotype.Service;

/**
 * @author fanyufeng
 * @date 2024/2/1 16:56
 * @description
 */
@Service("studentBeanServiceImpl")
public class StudentBeanServiceImpl implements BeanService {
	@Override
	public void printName(String name) {
		System.out.println(name);
	}
}
