package com.pplenty.studytoby.chapter01.step01.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

    C c;

    public B() {
        System.out.println("B 생성자");
    }

    @Autowired
    public void setC(C c) {
        System.out.println("B setC");
        this.c = c;
    }
}