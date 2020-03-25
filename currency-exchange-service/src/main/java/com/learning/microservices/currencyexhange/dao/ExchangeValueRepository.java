package com.learning.microservices.currencyexhange.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.microservices.currencyexhange.controller.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
ExchangeValue findByFromAndTo(String from, String to);
}
