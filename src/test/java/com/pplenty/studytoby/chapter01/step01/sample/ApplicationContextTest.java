package com.pplenty.studytoby.chapter01.step01.sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;


/**
 * Created by yusik on 2020/03/14.
 */
@DisplayName("Bean Factory VS Application Context")
public class ApplicationContextTest {

    /**
     *
     */
    @DisplayName("어플리케이션 콘텍스트")
    @Test
    void AnnotationConfigApplicationContext() {

        // given
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // scan
        context.scan("com/pplenty/studytoby/chapter01/step01/sample");
        context.refresh();

        System.out.println("getBean :: A");
        A a = context.getBean("a", A.class);
        System.out.println(a);
        System.out.println(context.getBeanFactory());

    }

    /**
     *
     */
    @DisplayName("빈 팩토리")
    @Test
    void XmlBeanFactoryPreLoad() {

        // given
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("sample/test-sample.xml"));

        // get bean
        System.out.println("getBean :: A");
        A a = beanFactory.getBean("a", A.class);
        System.out.println(a);
        System.out.println(a.b.c.d);
        System.out.println(beanFactory);

    }
}
