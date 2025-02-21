package com.capgemint_training.springconcept.component;

import org.springframework.stereotype.Component;

import static java.lang.System.out;

@Component
public class First {
    //constructor
    public First(){
    }
    //method
    public void hello(){
        out.println("inside first class method");
    }
}
