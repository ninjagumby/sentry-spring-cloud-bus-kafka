package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestApp.class);
    public static void main(String[] args) {
        LOGGER.info("Test app starting");
        SpringApplication.run(TestApp.class,args);
    }
}
