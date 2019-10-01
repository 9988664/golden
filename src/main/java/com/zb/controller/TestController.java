package com.zb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class TestController {
	@RequestMapping("hello")
	public String start() {
		System.out.println("进来了");
		return "hello";
	}
}
