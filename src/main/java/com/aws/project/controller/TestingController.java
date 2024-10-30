package com.aws.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

	@GetMapping("/")
	public ResponseEntity<?> testing()
	{
		return ResponseEntity.status(HttpStatus.OK).body("Hello World");
	}
}
