package com.udacity.jwdnd.ci.review.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {
    private MessageService messageService;

    public ChatController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public String getRequest(ChatForm chatForm, Model model){
        model.addAttribute("chatMessages", this.messageService.getMessages());
        return "chat";
    }

    @PostMapping
    public String postRequest(ChatForm chatForm, Model model){
        this.messageService.addMessages(chatForm.getUsername(),chatForm.getMessageText());
        System.out.println(this.messageService.getMessages().size() +" " +this.messageService.getMessages().get(0).getUserName());
        model.addAttribute("chatMessages", this.messageService.getMessages());
        return "chat";
    }

}
