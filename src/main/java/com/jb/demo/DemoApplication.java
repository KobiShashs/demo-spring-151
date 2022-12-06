package com.jb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

enum ClientType{
	Administrator,
	Company,
	Customer
}
@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Thread t1 = new Thread(()-> {System.out.println("Moshe");});
		Thread t2 = new Thread(()-> System.out.println("Moshe"));

	}

	@GetMapping("api/login")
	public String login(@RequestParam String email,@RequestParam String password,@RequestParam ClientType type){
		return "sababa!";
	}
}
