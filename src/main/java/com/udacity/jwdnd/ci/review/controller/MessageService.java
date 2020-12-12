package com.udacity.jwdnd.ci.review.controller;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    List<ChatMessage> chatMessages;

    @PostConstruct
    public void postConstruct(){
        this.chatMessages = new ArrayList<>();
    }

    public void addMessages(String userName, String msg){
        System.out.println(" >> "+userName+" | "+msg);
        this.chatMessages.add(new ChatMessage(userName, msg));
        System.out.println("<<>>"+this.chatMessages.get(0).getUserName());
    }

    public List<ChatMessage> getMessages() {
        return new ArrayList<>(this.chatMessages);
    }
}
