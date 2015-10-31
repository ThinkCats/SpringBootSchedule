package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Wanglei on 15/10/31.
 */
@ComponentScan
@EnableAutoConfiguration
public class TestMain {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(TestMain.class);
        application.run(args);
    }
}
