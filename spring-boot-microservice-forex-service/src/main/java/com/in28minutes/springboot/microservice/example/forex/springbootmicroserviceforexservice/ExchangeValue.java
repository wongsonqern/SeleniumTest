package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	  
	  @Id
	  private Long id;
	  
	  @Column(name="currency_from")
	  private String from;
	  
	  @Column(name="currency_to")
	  private String to;
	  
	  private BigDecimal conversionMultiple;
	  private int port;
	  
	  
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	  
}
