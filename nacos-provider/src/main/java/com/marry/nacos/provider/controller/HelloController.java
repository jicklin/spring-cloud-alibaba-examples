package com.marry.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mal
 * @date 2022-03-24 17:22
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable String name) {
        System.out.println(1/0);
        return "Hello :" + name;

    }
}
