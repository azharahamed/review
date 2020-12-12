package com.udacity.jwdnd.ci.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
@Configuration
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@Bean
	@Primary
	public String basicMessage(){
		System.out.println("Inside basic message");
		return "Hello";
	}

	@Bean
	public String compoundMessage(String basicMessage){
		System.out.println("Inside compoundMessage, received : "+basicMessage);
		return basicMessage + ", Spring!";
	}

	@Bean
	public int characterCount(String message){
		System.out.println("Inside the characterCount! ");
		return message.length();
	}

	@Bean
	public String message(){
		System.out.println("Creating the message bean");
		return "Hello, Spring";
	}

}
