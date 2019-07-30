package com.epam.springbootstarterdemo;

import com.epam.customspringbootstarter.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootStarterDemoApplication implements CommandLineRunner {

    @Autowired
    private MyBean myBean;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        myBean.sayGreetings();
    }
}
