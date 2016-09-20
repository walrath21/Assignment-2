package com.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.datacontainers.Address;
import com.datacontainers.Customer;
import com.datacontainers.Person;
import com.datacontainers.PrimaryContact;
import com.datacontainers.Product;

public class FlatFileReader {
	// This Name ArrayList stores the Name objects
	ArrayList<Person> personList = new ArrayList<Person>();
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	ArrayList<Product> productList = new ArrayList<Product>();
	
	public ArrayList<Person> readPersons() {
	Scanner sc = null;
	
		try {
			sc = new Scanner(new File("data/Persons.dat")); // reads from Persons.dat
			sc.nextLine(); // reads first line which contains number or names
			
			while (sc.hasNextLine()) {
				ArrayList<String> emails = new ArrayList<String>();
				String line = sc.nextLine(); // reads each line starting from the 2nd line
				String data[] = line.split(";"); // calculates size of array by using the delimiter, tokenizes the line and stores in an array
				// Stores the 2 array elements of each line into strings
				String personCode = data[0].trim();
				String nameData[] = data[1].split(",");
				String firstName = nameData[1].trim();
				String lastName = nameData[0].trim();
				String locationData[] = data[2].split(",");
				Address address = new Address(locationData[0].trim(), locationData[1].trim(), locationData[2].trim(), locationData[3].trim(), locationData[4].trim());
				if (data.length == 4) {
					String emailAddress[] = data[3].split(",");
					int size = emailAddress.length;
					for (int x = 0; x < size; x++) {
						emails.add(emailAddress[x]);
					} 
				}
				// Creates a Person object
				Person person = new Person(personCode, firstName, lastName, address, emails);
				
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
			String line = sc.nextLine();
			while (sc.hasNextLine()) {
				line = sc.nextLine();
				String data[] = line.split(";");
				String customerCode = data[0];
				String type = data[1];
				String personContact = data[2];
				String customerName = data[3];
				String locationData[] = data[4].split(",");
				Address address = new Address(locationData[0], locationData[1], locationData[2], locationData[3], locationData[4]);		
				
				for(Person aPerson: personList){
					if (aPerson.getPersonCode().equals(personContact)) {
						PrimaryContact primaryContact = new PrimaryContact(aPerson.getPersonCode(), aPerson.getfirstName(), aPerson.getlastName(), aPerson.getAddress(), aPerson.getemailAdress());
						Customer customer = new Customer(customerCode, primaryContact, type, customerName, address);
						customerList.add(customer);
						break;
					}
				}

			}
			sc.close();
			return customerList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Product> readProducts() {
		try {
			Scanner sc = null;
			sc = new Scanner(new File("data/products.dat"));
			String line = sc.nextLine();
			while (sc.hasNextLine()) {
				line = sc.nextLine();
				String data[] = line.split(";");
				String productCode = data[0];
				String type = data[1];
				String name = null;
				double cost;
				Product product;
				switch (type) {
				case "M":   
					String movieDateTime = data[2];
					String movieName = data[3];
					String locationData[] = data[4].split(",");
					Address address = new Address(locationData[0].trim(), locationData[1].trim(), locationData[2].trim(), locationData[3].trim(), locationData[4].trim());
					String screenNo = data[5];
					double pricePerUnit = Double.parseDouble(data[6]); 
					product = new Product(productCode, movieDateTime, movieName, address, screenNo, pricePerUnit);
					productList.add(product);
					break;
				case "S":
					name = data[2];
					String seasonStartDate = data[3];
					String seasonEndDate = data[4];
					cost = Double.parseDouble(data[5]);
					product = new Product(productCode, name, cost, seasonStartDate, seasonEndDate);
					productList.add(product);
					break;			
				case "P":
					double parkingFee = Double.parseDouble(data[2]);
					product = new Product(productCode, parkingFee);
					productList.add(product);
					break;
				case "R":
					name = data[2];
					cost = Double.parseDouble(data[3]);
					product = new Product(name, productCode, cost);
					productList.add(product);
					break;
				default:
					System.out.println("That is not a valid product type");
					return null; 
				}
				
			}

			
			sc.close();
			return productList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
