package com.marry.nacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author mal
 * @date 2022-03-24 18:04
 */

@RestController
public class ConsumerController {

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/sayHello")
    public String sayHello() {
        ServiceInstance choose = loadBalancerClient.choose("nacos-provider");
        String url = String.format("http://%s:%s/hello/%s", choose.getHost(), choose.getPort(), appName);
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }

}
