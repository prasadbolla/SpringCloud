/**
 * 
 */
package com.learning.microservices.currencyexhange.controller;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author PRASADBolla
 *
 */
@Entity
public class ExchangeValue {
	@Id
	private Long id;
	@Column(name = "currency_from")
	private String from;
	@Column(name = "currency_to")
	private String to;
	private BigDecimal conversionMultiple;
	private int port;

	/**
 * 
 */
	public ExchangeValue() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param from
	 * @param to
	 * @param bigDecimal
	 */
	public ExchangeValue(Long id, String from, String to, BigDecimal bigDecimal) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = bigDecimal;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from
	 *            the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to
	 *            the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port
	 *            the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * @return the conversionMultiple
	 */
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	/**
	 * @param conversionMultiple
	 *            the conversionMultiple to set
	 */
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
}
