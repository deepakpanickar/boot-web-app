package com.osirees.spring.boot.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value="/hi", produces = MediaType.APPLICATION_JSON_VALUE)
	public Profile greetings() {
		return new Profile("Deepak", "mr", "Mumbai");
	}
}
