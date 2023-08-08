package com.epaylatertask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class EPayLaterTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(EPayLaterTaskApplication.class, args);
		System.out.println("good");
	}

}
