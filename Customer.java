package com.datacontainers;

public class Customer {
	private String customerCode;
	private PrimaryContact primaryContact;
	
	public Customer(String customerCode, PrimaryContact primaryContact) {
		this.customerCode = customerCode;
		this.primaryContact = primaryContact;
	}
	
	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public PrimaryContact getprimaryContact() {
		return primaryContact;
	}

	public void setprimaryContact(PrimaryContact primaryContact) {
		this.primaryContact = primaryContact;
	}

	
	
}
