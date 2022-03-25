package com.osirees.spring.boot.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value="/hi/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Profile greetings(@PathVariable String name, @RequestParam String location) {
		return new Profile(name, "mr", location);
	}
}
