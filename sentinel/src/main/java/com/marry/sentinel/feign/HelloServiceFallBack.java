package com.marry.sentinel.feign;

import org.springframework.stereotype.Component;

/**
 * @author mal
 * @date 2022-03-30 16:33
 */
@Component
public class HelloServiceFallBack implements HelloService{
    @Override
    public String sayHello(String name) {
        return "error:" + name;
    }
}
