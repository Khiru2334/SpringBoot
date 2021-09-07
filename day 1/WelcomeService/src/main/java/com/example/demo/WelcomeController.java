package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

public WelcomeController() {
System.out.println("GreetController created...");
}

@GetMapping("/welcome")
public String hello(){
return "Welcome To Welcome  Service";
}

}
