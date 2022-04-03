package com.marry.nacosconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class NacosConfigApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(NacosConfigApplication.class, args);
        ConfigurableEnvironment environment = context.getEnvironment();
        while (true) {
            String name = environment.getProperty("user.name");
            String age = environment.getProperty("user.age");
            String env = environment.getProperty("current.env");
            System.out.println("current:" + env + " username :" + name + " ;age:" + age);
            TimeUnit.SECONDS.sleep(1L);

        }
    }

}
