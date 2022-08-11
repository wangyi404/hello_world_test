package com.example.hello_world_test.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class component implements InitializingBean {
    private static String name = "lucy";

    @Override
    public void afterPropertiesSet() {
        System.out.println("hi" + name);
    }
}
