package com.tribudiyono39.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping(path="/hello-world", produces = "application/json")
	public String helloWorld() {
		return "Hello World !!!";
	}
}
