package com.jonasbernardino.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/books")
public class Controller {
	
	@GetMapping
	public String hello() {
		return "Deu certo !!!!";
	}

}
