package com.microservices.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@GetMapping("limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(100, 1);
	}

}
