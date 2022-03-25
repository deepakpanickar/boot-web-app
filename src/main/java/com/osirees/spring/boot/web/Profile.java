package com.osirees.spring.boot.web;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Profile {

	private final String name;
	@JsonIgnore final String title;
	private final String location;
}
