package org.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Wanglei on 15/11/2.
 */
public class TestSchedule {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-quartz.xml");
    }
}
