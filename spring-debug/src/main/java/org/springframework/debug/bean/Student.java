package org.springframework.debug.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @author yohong
 * @date 2024/4/20 23:32
 * @description 学生bean 提供测试使用
 * <p>
 * TODO 这个地方有问题 Spring 启动运行时，@Data 没有运行，需要排查。只能手动设置 get、set方法运行
 */


@Data
@Component("student")
public class Student {
	
	
	@Value("Bean李四")
	private String name;
	
	@Value("18")
	private Integer age;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student{" +
				       "name='" + name + '\'' +
				       ", age=" + age +
				       '}';
	}
}


