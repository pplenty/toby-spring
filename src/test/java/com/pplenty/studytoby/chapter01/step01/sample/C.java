package com.pplenty.studytoby.chapter01.step01.sample;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class C implements ApplicationContextAware {

    private ApplicationContext ac;

    @Autowired
    D d;

    public C() {
        System.out.println("C 생성자");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("C setApplicationContext");
        ac = applicationContext;
    }
}