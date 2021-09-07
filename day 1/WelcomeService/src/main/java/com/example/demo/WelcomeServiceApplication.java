package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication


public class WelcomeServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WelcomeServiceApplication.class, args);
	}

WelcomeServiceApplication()
{
	System.out.println("----inside welcome ---------");
}

}


