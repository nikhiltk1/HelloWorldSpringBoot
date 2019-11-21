package com.capillary.demo.SampleApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldController {
    private static final Logger logger= LoggerFactory.getLogger(HelloWorldController.class);
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HelloWorldController.class, args);
        logger.info("Application initialized with name {}",context.getApplicationName());
    }
}
