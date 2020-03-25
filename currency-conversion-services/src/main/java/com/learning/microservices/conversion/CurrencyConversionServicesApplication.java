package com.learning.microservices.conversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients("com.learning.microservices.conversion")
@EnableDiscoveryClient
public class CurrencyConversionServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServicesApplication.class, args);
	}
	 @Bean
	 public Sampler defaultSampler(){
		 return Sampler.ALWAYS_SAMPLE;
	 }
}
