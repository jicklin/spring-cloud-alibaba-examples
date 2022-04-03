package com.marry.sentinel.config;

import javax.annotation.PostConstruct;

/**
 * @author mal
 * @date 2022-03-31 18:07
 */
public class YourBean {
    public MyBean myBean;

    public YourBean(MyBean myBean){
        System.out.println("YourBean construct...");
        this.myBean=myBean;
    }
    @PostConstruct
    public void init(){
        System.out.println("YourBean PostConstruct...");
    }
    public void sayHello(){
        System.out.println("Hi YourBean ,hello world!");
    }
}
