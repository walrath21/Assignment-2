package com.datacontainers;

public class Customer {
	private String customerCode, type;
	private PrimaryContact primaryContact;
	private String customerName;
	private Address customerAddress;
	
	public Customer(String customerCode, PrimaryContact primaryContact, String type, String customerName, Address customerAddress) {
		this.customerCode = customerCode;
		this.primaryContact = primaryContact;
		this.type = type;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAddress() {
		return customerAddress;
	}
	public void setAddress(Address address) {
		this.customerAddress = address;
	}
	
}
