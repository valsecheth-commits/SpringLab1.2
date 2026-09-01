package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        classPathXmlApplicationContext.getBean("point", Point.class).draw();

        classPathXmlApplicationContext.getBean("circle", Circle.class).draw();

        classPathXmlApplicationContext.getBean("scene", Scene.class).draw();


    }
}