package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("add bug");
		System.out.println("DemoApplication.main");
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/get")
	public String getHello () {
		return "hjelasdflo yun  50966";
	}
	
	
	
	
	
	
	
	@GetMapping("/set")
	public String getHello2 () {
		return "hgetello290  exec set ";
	}


	@GetMapping("/javaadd")
	public  String add() {
		return "add";
	}


	@GetMapping("/save")
	public  String save() {
		return "add save";
	}


	@GetMapping("/savea")
	public  String savea() {
		return "add savecd";
	}



}
