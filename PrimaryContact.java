package com.datacontainers;

import java.util.ArrayList;

public class PrimaryContact extends Person {
	private PrimaryContact primaryContact;

	public PrimaryContact(String personCode, String fName, String lName, Address address, ArrayList<String> emailList) {
		super(personCode, fName, lName, address, emailList);
		this.primaryContact = primaryContact;
	}
	
	public PrimaryContact getPrimaryContact() {
		return primaryContact;
	}


	public void setPrimaryContact(PrimaryContact primaryContact) {
		this.primaryContact = primaryContact;
	}

}
