package com.day2.Day2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise1 {
	@Value("${var}")
	private String name;

	@GetMapping("name")
	public String display() {
		return "Hi Everyone ,I am " + name;
	}
}