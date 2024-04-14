package org.springframework.debug.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author yohong
 * @date 2024/4/14 10:58
 * @description desc
 */
@Configuration
@ComponentScan("org.springframework.debug")
@EnableScheduling
@PropertySource("classpath:spring.properties")
public class AppConfig {
}
