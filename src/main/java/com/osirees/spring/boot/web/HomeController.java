package com.osirees.spring.boot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/hi")
	public String greetings() {
		return "Hello World";
	}
}
