package com.udacity.jwdnd.ci.review.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    private MessageListService messageListService;

    public AnimalController(MessageListService messageListService){
        this.messageListService = messageListService;
    }

    @GetMapping()
    public String initialAnimal(MessageForm messageForm, Model model) {
        messageListService.addMessage("");
        model.addAttribute("greetings", messageListService.getMessages());
        return "animal";
    }

    @PostMapping()
    public String returnAnimal(MessageForm messageForm, Model model){
        messageListService.addMessage(""+messageForm.getAnimalName()+" : "+messageForm.getAdjective());
        model.addAttribute("greetings", messageListService.getMessages());
        return "animal";
    }


}
