/**
 * 
 */
package com.learning.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservices.limitsservice.bean.LimitConfiguration;
import com.learning.microservices.limitsservice.configuration.Configuration;

/**
 * @author PRASADBolla
 *
 */
@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	@GetMapping(value="/limits")
public LimitConfiguration retrieveLimitsFromConfigurations(){
	return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
}
}
