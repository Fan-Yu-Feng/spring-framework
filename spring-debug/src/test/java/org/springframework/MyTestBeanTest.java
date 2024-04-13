package org.springframework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author yohong
 * @date 2024/4/13 15:46
 * @description desc
 */
class MyTestBeanTest {

  @Test
  void testSimpleLoad() {
    Resource resource = new ClassPathResource("beanFactoryTest.xml");
    GenericXmlApplicationContext genericXmlApplicationContext =
        new GenericXmlApplicationContext(resource);

    // BeanFactory factory = (BeanFactory) new
    // XmlBeanDefinitionReader(genericXmlApplicationContext);
    BeanFactory factory = genericXmlApplicationContext.getBeanFactory();

    MyTestBean myTestBean = (MyTestBean) factory.getBean("myTestBean");
    System.out.println("myTestBean = " + myTestBean);

    System.out.println("myTestBean = " + myTestBean);
  }

  @BeforeEach
  void setUp() {}

  @AfterEach
  void tearDown() {}

  @Test
  void getTestStr() {}

  @Test
  void setTestStr() {}
}
