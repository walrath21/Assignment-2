package com.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.datacontainers.Address;
import com.datacontainers.Customer;
import com.datacontainers.Name;
import com.datacontainers.Person;
import com.datacontainers.PrimaryContact;

public class FlatFileReader {

	public ArrayList<Person> readPersons() {
	Scanner sc = null;
	
		try {
			sc = new Scanner(new File("data/Persons.dat")); // reads from Persons.dat
			sc.nextLine(); // reads first line which contains number or names
			
			// This Name ArrayList stores the Name objects
			ArrayList<Person> personList = new ArrayList<Person>();
			
			while (sc.hasNextLine()) {
				ArrayList<String> emails = new ArrayList<String>();
				String line = sc.nextLine(); // reads each line starting from the 2nd line
				String data[] = line.split(";"); // calculates size of array by using the delimiter, tokenizes the line and stores in an array
				// Stores the 2 array elements of each line into strings
				String personCode = data[0];
				String nameData[] = data[1].split(",");
				Name name = new Name(nameData[1], nameData[0]);
				String locationData[] = data[2].split(",");
				Address address = new Address(locationData[0], locationData[1], locationData[2], locationData[3], locationData[4]);
				if (data.length == 4) {
					String emailAddress[] = data[3].split(",");
					int size = emailAddress.length;
					for (int x = 0; x < size; x++) {
						emails.add(emailAddress[x]);
					} 
				}
				// Creates a Person object
				Person person = new Person(address, name, emails, personCode);
				
				// Adds the Name object into Name ArrayList
				personList.add(person);	
				
			}
			sc.close();
			return personList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	public ArrayList<Customer> readCustomers(){
		try {
			Scanner sc = null;
			sc = new Scanner(new File("data/Customers.dat"));
			ArrayList<Customer> customerList = new ArrayList<Customer>();
			String line = sc.nextLine();
			while (sc.hasNextLine()) {
				line = sc.nextLine();
				String data[] = line.split(";");
				String customerCode = data[0];
				String type = data[1];
				String personContact = data[2];
				String name = data[3];
				String locationData[] = data[4].split(",");
				Address address = new Address(locationData[0], locationData[1], locationData[2], locationData[3], locationData[4]);		
				
				PrimaryContact primaryContact = new PrimaryContact(type, personContact, name, address);
				Customer customer = new Customer(customerCode, primaryContact);
				customerList.add(customer);
			}
			
			sc.close();
			return customerList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
