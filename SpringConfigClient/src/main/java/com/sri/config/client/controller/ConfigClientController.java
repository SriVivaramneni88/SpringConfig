package com.sri.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {
	@Value("${com.sri.testConfigvalue:defaultValue}")
	String value;
	
	@RequestMapping(value="/test",produces = "application/json")
	public String testClientConfig() {
		System.out.println("Config Value read from config server is "+ value);
		return value;
		
	}

}
