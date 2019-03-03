package com.wcg.webone.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping("index")
	public String index() {
		return "wcg love jiajia";
	}
	
}
