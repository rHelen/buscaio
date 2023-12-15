package com.store.store.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloWorldController {

	@GetMapping("/")
	public String helloMessage() {
		return "Hello world";
	}
	
	@GetMapping("/idUser/{id}")
	public String idDoUser() {
		return "Não sei teu id";
	}
	
	@GetMapping("/profile/{idUser}")
	public String profile() {
		return "This is your profile BRO";
	}
}
