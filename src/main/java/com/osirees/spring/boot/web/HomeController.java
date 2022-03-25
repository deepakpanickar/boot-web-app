package com.osirees.spring.boot.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value="/hi/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Profile greetings(@PathVariable String name, @RequestParam String location) {
		return new Profile(name, "mr", location);
	}
	
	/**
	 * Test PowerShell command
	 * PS C:\..> Invoke-WebRequest -URI 'http://localhost:8080/hi/deepak?location=Powai' -Method 'Put'
	 * @param name
	 * @param location
	 * @return
	 */
	@ResponseStatus(code = HttpStatus.CREATED)
	@PutMapping(value="/hi/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Profile updateProfile(@PathVariable String name, @RequestParam String location) {
		return new Profile(name, "mr", location);
	}
	
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping(value="/hi/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Profile saveProfile(@RequestBody Profile profile, @PathVariable String name, @RequestParam String location) {
		return new Profile(profile.getName(), "mr", profile.getLocation()!=null?profile.getLocation():location);
	}
}
