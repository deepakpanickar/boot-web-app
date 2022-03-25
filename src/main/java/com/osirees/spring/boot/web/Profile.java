package com.osirees.spring.boot.web;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Profile {

	private final String name;
	private final String title;
	private final String location;
}
