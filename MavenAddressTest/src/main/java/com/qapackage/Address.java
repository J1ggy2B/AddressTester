package com.qapackage;

import java.util.List;

public class Address {


	//Address Fields
	private String houseNo;
	private String street;
	private String postcode;
	private String city;
    private IUserAccountDb db;
	//Constructor
    public Address(String houseNo, String street, String postcode, String city, IUserAccountDb db) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.postcode = postcode;
		this.city = city;
		this.db = db;
	}
    //Methods
    public boolean isValidCity(String cityToCheck) {
        if (db == null) {
            return false; // Or throw an exception, depending on your design
        }
        List<String> validCities = db.getCityNames();
        return validCities != null && validCities.contains(cityToCheck);
    }
    //Getters & Setters
	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
