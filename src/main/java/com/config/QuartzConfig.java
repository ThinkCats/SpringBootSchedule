package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;



@Configuration
@ComponentScan("com.concrete")
@EnableScheduling
public class QuartzConfig {

}
