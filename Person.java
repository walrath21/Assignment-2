package com.datacontainers;

import java.util.ArrayList;

public class Person {
	private Address address;
	private Name name;
	private ArrayList<String> emailList;
	private String personCode;
	
	public Person(Address address, Name name, ArrayList<String> emailList, String personCode){
		this.address = address;
		this.name = name;
		this.emailList = emailList;
		this.personCode = personCode;
	}
	
	
	public ArrayList<String> getemailAdress() {
		return emailList;
	}
	public Address getAddress() {
		return address;
	}
	public Name getName() {
		return name;
	}
	public String getCode() {
		return personCode;
	}
	
}
