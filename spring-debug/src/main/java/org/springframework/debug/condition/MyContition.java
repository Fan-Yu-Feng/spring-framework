package org.springframework.debug.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.debug.bean.Student;

/**
 * @author yohong
 * @date 2024/4/29 23:12
 * @description desc
 */

public class MyContition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		try {
			context.getClassLoader().loadClass("org.springframework.debug.bean.Student");
			return true;
		}catch (Exception e){
			return false;
		}
	}
}
