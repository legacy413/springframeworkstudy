package com.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QueueWorker {
    private static final String QUEUE_URL = "...";

    public static void main(String[] args) {
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            SpringQueueWorker main = context.getBean(SpringQueueWorker.class);
            main.execute();
        }
    }
}
