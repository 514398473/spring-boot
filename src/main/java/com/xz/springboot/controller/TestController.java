package com.xz.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
@EnableAutoConfiguration
public class TestController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Word!";
	}

	@RequestMapping("/hello1")
	public String hello1() {
		return "Hello Word1!";
	}

	@RequestMapping("/login")
	public String loginGet() {
		return "a";
	}

}
