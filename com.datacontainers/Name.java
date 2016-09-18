package com.datacontainers;

public class Name {
	private String firstName;
	private String lastName;
	
	
	public Name(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
	}
	
	public String getName(){
		String fullName = lastName.concat(", " + firstName);
		return fullName;
	}

	public void setName(String fName, String lName){
		this.firstName = fName;
		this.lastName = lName;
	}
}
