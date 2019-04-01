package com.wcg.webone.sencond.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcg.webone.first.controller.FirstController;
import com.wcg.webone.first.service.FirstService;


@Controller
public class SecondController {
	private final static Logger logger = LoggerFactory.getLogger(SecondController.class); 
	
	@GetMapping("test")
	public String test() {
		logger.debug("wcg-----------testr");
		System.out.println("wcg-----------test");
		return "html/test";
	}
	
}
