package com.pplenty.studytoby.chapter01.step01.sample;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class A implements InitializingBean, BeanFactoryAware {

    final B b;

    public A(B b) {
        System.out.println("A 생성자");
        this.b = b;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("A afterPropertiesSet()");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("A setBeanFactory() " + beanFactory);
    }
}