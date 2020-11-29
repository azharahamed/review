package com.udacity.jwdnd.ci.review;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MessageService {

    private String message;

    public MessageService(String message){
        this.message = message;
    }

    public String upperCase(){
        System.out.println("Inside Upper Case Function");
        return this.message.toUpperCase();
    }

    public String lowerCase(){
        System.out.println("Inside Lower Case Function");
        return  this.message.toLowerCase();
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Creating MessageService bean");
    }
}
