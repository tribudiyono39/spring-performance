package com.tribudiyono39.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping(path="/hello-world", produces = "application/json")
	public ResponseEntity<String> helloWorld() {
		return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	}
}
