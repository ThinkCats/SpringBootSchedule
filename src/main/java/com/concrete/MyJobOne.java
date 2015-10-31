package com.concrete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyJobOne {

    @Autowired
    private MyJobTwo jobTwo;

    @Scheduled(fixedDelay = 5000)
    protected void myTask(){
        System.out.println((new Date())+",This is my job");
    }

    @Scheduled(fixedDelay = 3000)
    protected void myTask2(){
        jobTwo.printTime();
    }
}
