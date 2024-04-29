package org.springframework.debug.bean;

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


// @Data
@Component
@Conditional(MyContition.class)
@Scope("prototype")
public class LookUpBean {
}


