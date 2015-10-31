package com.concrete;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MyJobTwo {
    public static final String COUNT = "count";

    public void printTime(){
        System.out.println("now time:"+(new Date()));
    }

}
