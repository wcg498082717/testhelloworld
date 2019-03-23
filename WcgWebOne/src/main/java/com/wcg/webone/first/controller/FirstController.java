package com.wcg.webone.first.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcg.webone.first.service.FirstService;


@RestController
public class FirstController {
	@Resource
	FirstService firstservice;
	
	private final static Logger logger = LoggerFactory.getLogger(FirstController.class); 

	@GetMapping("index")
	public String index() {
		logger.debug("wcg-----------getindex");
		return "wcg love jiajia";
	}
	@GetMapping("getuser")
	public Object post() {
		logger.debug("wcg-----------postgetuser");
		HashMap map = new HashMap<>();
		map.put("date", firstservice.getall());
		return map;
	}
	
}
