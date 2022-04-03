package com.marry.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.marry.sentinel.feign.HelloService;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.ZoneAwareLoadBalancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.cloud.openfeign.FeignContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author mal
 * @date 2022-03-30 15:25
 */
@RestController
public class TestController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private FeignContext feignContext;


    @Autowired
    private SpringClientFactory springClientFactory;

    @GetMapping(value = "/hello/{name}")
    @SentinelResource("hello")
    public Object hello(@PathVariable("name") String name) {
        helloService.sayHello(name);
        //ILoadBalancer instance = feignContext.getInstance("nacos-provider", ILoadBalancer.class);
        Set<String> contextNames = feignContext.getContextNames();
        Set<String> contextNames1 = springClientFactory.getContextNames();
        ILoadBalancer instance = springClientFactory.getInstance("nacos-provider", ILoadBalancer.class);
        //instance.getAllServers()
        return "s";
    }

}
