package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

public GreetController() {
System.out.println("GreetController created...");
}

@GetMapping("/greet")
public String hello(){
return "Welcome To Greet  Service";
}

}
