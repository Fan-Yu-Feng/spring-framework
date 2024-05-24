package org.springframework.debug.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.debug.bean.LookUpBean;
import org.springframework.debug.bean.Student;
import org.springframework.debug.service.BeanService;
import org.springframework.stereotype.Service;

/**
 * @author fanyufeng
 * @date 2024/2/1 16:56
 * @description
 */

@Slf4j
@Service("studentBeanServiceImpl")
public class StudentBeanServiceImpl implements BeanService , BeanPostProcessor,
		                                               InitializingBean, BeanNameAware , BeanFactoryAware {
	
	@Autowired
	private Student student;
	@Autowired
	private LookUpBean lookUpBean;
	
	public StudentBeanServiceImpl(){
		log.info("StudentBeanServiceImpl construct init");
	}
	
	public void initBean(){
		log.info("init method");
	}
	public void destroy(){
		log.info("destroy");
	}
	
	
	
	@Override
	public void printName(String name) {
		log.info(name);
	}
	
	
	@Lookup("lookUpBean")
	public LookUpBean lookUpMethod() {
		return null;
	}
	
	public void testLookUp() {
		// 需要将 student 改成多例 bean
		log.info("testLookUp lookUpBean  = " + lookUpMethod());
	}
	
	public void setStudent(Student student) {
		log.info("step set attribute");
		this.student = student;
	}
	
	
	@Override
	public Object postProcessBeforeInitialization(@NotNull Object bean, @NotNull String beanName) throws BeansException {
		log.info("before step:  BeanPostProcessor before running");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(@NotNull Object bean, @NotNull String beanName) throws BeansException {
		log.info("after step:  BeanPostProcessor after running");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("InitializingBean's method afterPropertiesSet running");
		
	}
	
	@Override
	public void setBeanName(@NotNull String name) {
		log.info("BeanNameAware: 这个bean的名字是"+name);
		
	}
	
	@Override
	public void setBeanFactory(@NotNull BeanFactory beanFactory) throws BeansException {
		log.info("这个Bean的beanFactory是"+beanFactory);
		
	}
}
