package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDemo {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot";

	}

	@RequestMapping("/Hello")
	public String sample() {
		return "Hey Spring";
	}

}
