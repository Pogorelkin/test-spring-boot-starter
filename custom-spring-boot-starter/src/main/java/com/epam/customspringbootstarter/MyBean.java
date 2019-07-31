package com.epam.customspringbootstarter;

public class MyBean {
    private String greetings;

    public MyBean(String greetings) {
        this.greetings = greetings;
    }

    public void sayGreetings(){
        System.out.println(greetings);
    }
}
