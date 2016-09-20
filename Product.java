package com.datacontainers;


public class Product {
	private String name;
	private Double cost;
	private String seasonStartDate;
	private String seasonEndDate;
	private String productCode;
	private Address address;
	private String movieName;
	

	
	private String dateTime;
	private String movieDateTime;

	private Double parkingFee;
	private String screenNo;
	private Double pricePerUnit;
	

	public Product(String productCode, String name, Double cost, String seasonStartDate, String seasonEndDate) {
		this.name = name;
		this.cost = cost;
		this.seasonStartDate = seasonStartDate;
		this.seasonEndDate = seasonEndDate;
		this.productCode = productCode;
	}
	
	public Product(String productCode, String movieDateTime, String movieName, Address address, String screenNo, Double pricePerUnit) {
		this.movieDateTime = movieDateTime;
		this.movieName = movieName;
		this.address = address;
		this.productCode = productCode;
		this.screenNo = screenNo;
		this.pricePerUnit = pricePerUnit;
	}
	
	public Product(String productCode, Double parkingFee){
		this.productCode = productCode;
		this.parkingFee = parkingFee;
	}
	
	
	public Product(String name, String productCode, Double cost) {
		this.name = name;
		this.productCode = productCode;
		this.cost = cost;
	}

    
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public String getMovieName() {
		return movieName;
	}



	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getProductCode() {
		return productCode;
	}



	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}




	public Double getCost() {
		return cost;
	}



	public void setCost(Double cost) {
		this.cost = cost;
	}



	public Double getParkingFee() {
		return parkingFee;
	}



	public void setParkingFee(Double parkingFee) {
		this.parkingFee = parkingFee;
	}



	public String getScreenNo() {
		return screenNo;
	}



	public void setScreenNo(String screenNo) {
		this.screenNo = screenNo;
	}



	public Double getPricePerUnit() {
		return pricePerUnit;
	}



	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}


}
