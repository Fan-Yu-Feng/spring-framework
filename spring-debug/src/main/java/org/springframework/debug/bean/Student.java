package org.springframework.debug.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Scope;
import org.springframework.debug.condition.MyContition;
import org.springframework.stereotype.Component;


/**
 * @author yohong
 * @date 2024/4/20 23:32
 * @description 学生bean 提供测试使用
 * <p>
 */


@Data
@Component("student")
@Conditional(MyContition.class)
@Scope("singleton")
public class Student {
	

	@Value("Bean李四")
	private String name;

	@Value("18")
	private Integer age;
	
	
	// @Override
	// public String toString() {
	// 	return "Student{" +
	// 			       "name='" + name + '\'' +
	// 			       ", age=" + age +
	// 			       '}';
	// }
	
}


