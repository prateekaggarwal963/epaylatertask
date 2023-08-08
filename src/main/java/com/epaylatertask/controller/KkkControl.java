package com.epaylatertask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KkkControl {

	@GetMapping("/l")
	public String ff() {
		System.out.println("ss");
		return "ll";
	}
}
