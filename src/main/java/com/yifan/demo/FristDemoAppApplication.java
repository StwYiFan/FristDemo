package com.yifan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 */

@SpringBootApplication
public class FristDemoAppApplication {
    public static void main(String[] args) {
        ApplicationContext act = SpringApplication.run(FristDemoAppApplication.class,args);
    }
}
