/**
 * 
 */
package com.learning.microservices.limitsservice.bean;

/**
 * @author PRASADBolla
 *
 */
public class LimitConfiguration {
	int maximum;
	int minimum;

	/**
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * @param maximum
	 *            the maximum to set
	 */
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	/**
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}

	/**
	 * @param minimum
	 *            the minimum to set
	 */
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public LimitConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
}
