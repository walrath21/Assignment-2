package com.datacontainers;

public class PrimaryContact {
	private String type, personCode, name;
	private Address address;
	
	public PrimaryContact(String type, String personCode, String name, Address address) {
		this.type = type;
		this.personCode = personCode;
		this.name = name;
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getpersonCode() {
		return personCode;
	}

	public void setpersonCode(String personCode) {
		this.personCode = personCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
}
