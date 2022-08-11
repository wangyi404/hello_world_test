package com.example.hello_world_test.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class AnyComponent implements InitializingBean {

    Logger logger = LoggerFactory.getLogger(AnyComponent.class);

    private static String name = "lucy";

    @Override
    public void afterPropertiesSet() {
        logger.info("hi" + name);
    }
}
