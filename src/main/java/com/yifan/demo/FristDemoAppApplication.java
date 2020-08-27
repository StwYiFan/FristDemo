package com.yifan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

/**
 *
 */

@SpringBootApplication
public class FristDemoAppApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(FristDemoAppApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FristDemoAppApplication.class);
    }
}
