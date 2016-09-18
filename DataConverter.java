package com.reports;

import java.util.List;


import com.fileReader.FlatFileReader;
import com.datacontainers.Customer;
import com.datacontainers.Person;
import com.fileWriter.JsonWriter;

public class DataConverter {
	
	public static void main(String[] args) {
		// Create a FlatFileReader
		FlatFileReader fr = new FlatFileReader();
		
		/* fr Reads data from the flat file;
		 * Creates Name objects; and
		 * Stores Name objects in a Person ArrayList
		 */
		List<Person> personList = fr.readPersons();
		List<Customer> customerList = fr.readCustomers();
		
		// Write Name ArrayList into a Json file
		JsonWriter wr = new JsonWriter(); 
		wr.jsonConverterPerson(personList);
		wr.jsonConverterCustomer(customerList);
	}

}
