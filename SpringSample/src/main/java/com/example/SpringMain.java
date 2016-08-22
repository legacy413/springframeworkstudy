package com.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            SpringMain main = context.getBean(SpringMain.class);
            main.execute();
        }
    }

    private void execute() {
        System.out.println("foo");
    }
}
