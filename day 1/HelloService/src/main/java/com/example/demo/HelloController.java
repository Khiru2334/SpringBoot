package com.example.demo;

import java.lang.String;
import java.lang.System;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	public HelloController() {
		System.out.println("HelloController created...");
		}

		
		
		@GetMapping("/hello")
		public String hello(){
		return "Welcome To hello Service";
		}
}
