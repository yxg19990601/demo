package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/get")
	public String getHello () {
		return "hello get  56";
	}
	
	
	
	
	
	
	
	@GetMapping("/set")
	public String getHello2 () {
		return "hello2  exec set ";
	}
}
