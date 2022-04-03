package com.marry.sentinel;

import com.marry.sentinel.config.MyBean;
import com.marry.sentinel.config.YourBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SentinelApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;


    @Test
    void contextLoads() {

        MyBean bean = applicationContext.getBean(MyBean.class);
        YourBean yourBean = applicationContext.getBean(YourBean.class);

    }

}
