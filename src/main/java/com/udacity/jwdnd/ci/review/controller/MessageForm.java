package com.udacity.jwdnd.ci.review.controller;

public class MessageForm {
    private String text;

    private String animalName;
    private String adjective;

    public String getText() {
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }
}
