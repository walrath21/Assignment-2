package com.datacontainers;

import java.util.ArrayList;

public class Person {
	private String personCode;
	private String name;
	private String firstName;
	private String lastName;
	private Address address;
	private ArrayList<String> emailList;
	
	public Person(String personCode, String name, Address address, ArrayList<String> emailList){
		this.personCode = personCode;
		this.name = name;
		this.address = address;
		this.emailList = emailList;
	}
	
	public Person(String personCode, String firstName, String lastName, Address address, ArrayList<String> emailList) {
		this.personCode = personCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.emailList = emailList;
	}
	
	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String fName) {
		this.firstName = fName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getemailAdress() {
		return emailList;
	}
	public Address getAddress() {
		return address;
	}

	public String getPersonCode() {
		return personCode;
	}
	
}
