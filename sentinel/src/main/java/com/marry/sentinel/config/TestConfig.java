package com.marry.sentinel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mal
 * @date 2022-03-31 18:06
 */
@Configuration(proxyBeanMethods = false)
public class TestConfig {

    @Bean
    public MyBean myBean(){
        return new MyBean();
    }
    @Bean
    public YourBean yourBean(MyBean myBean){
        return new YourBean(myBean);
    }

}
