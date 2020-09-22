package com.oup.nrdemo.controller;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

	@GetMapping("/test")
	public String test() throws Exception {
		logger.info("-------");
		if (true) {
			throw new Exception("Crapped");
		} else {
			return "Hello!!!";
		}

	}
}
