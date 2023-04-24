package com.bosonit.training.springinjection;

import org.springframework.stereotype.Component;

@Component
public class Component1 {
    public  String name = "NO NAME";
    public Component1(){
        System.out.println("Hi from component 1");
    }
    public String hello(){
        return " Hello!! from component one. Name: "+ name;
    }
}
