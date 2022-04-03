package com.marry.sentinel.config;

import javax.annotation.PostConstruct;

/**
 * @author mal
 * @date 2022-03-31 18:06
 */
public class MyBean {

    public MyBean() {
        System.out.println("MyBean construct......");
    }

    @PostConstruct
    public void init(){
        System.out.println("MyBean PostConstruct ....");
    }
    public void sayHello(){
        System.out.println("Hi MyBean ,hello world!");
    }


}
