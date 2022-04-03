package com.marry.sentinel.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author mal
 * @date 2022-03-30 16:16
 */
@FeignClient(name = "nacos-provider",fallback = HelloServiceFallBack.class)
public interface HelloService {

    @GetMapping(value = "/hello/{name}")
    String sayHello(@PathVariable("name") String name);



}
