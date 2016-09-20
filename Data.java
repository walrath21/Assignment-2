package com.datacontainers;

public class Data {
	private Customer customer;
	private Person person;
	
	public Data(Customer customer, Person person) {
		super();
		this.customer = customer;
		this.person = person;
	}	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

}
