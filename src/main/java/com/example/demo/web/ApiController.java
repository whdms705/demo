package com.example.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ApiController {
	
	private final Logger log = LoggerFactory.getLogger(ApiController.class);
	
	@GetMapping("/1")
    public String Home1() {
		log.info("ApiController >> /1");
		return "test1";
    }
	
	@GetMapping("/2")
    public String Home2() {
		log.info("ApiController >> /2");
		return "test2";
    }

}
