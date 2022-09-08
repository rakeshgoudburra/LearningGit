package com.git.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHello {
	@GetMapping("/")
  public String hello() {
		System.out.println("hello");
	  return "hello world";
  }
}
