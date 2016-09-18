package com.datacontainers;

import org.joda.time.DateTime;

public class Product {
	private Address address;
	private Name name;
	private String code;
	private Type type;
	private DateTime dateTime;
	
	public Product(Address address, Name name, String emailAddress, String code, Type type){
		this.address = address;
		this.name = name;
		this.code = code;
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}
	public Name getName() {
		return name;
	}
	public String getCode() {
		return code;
	}
    public String getdateTime() {
    	return this.dateTime.toString("YYYY-dd-MM kk:mm");
    }
    
    public void setdateTime(String date) {
    	this.dateTime = DateTime.parse(date);
    }
	
}
