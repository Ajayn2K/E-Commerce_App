 package com.demo.demo.entity;

 public class Customer {
 	private String id;
 	private String name;
 	private String email;
 	private String phone;
 	private String street;
 	private String place;
 	private String city;
 	private String zip;
 	public String getId() {
 		return id;
 	}
 	public void setId(String id) {
 		this.id = id;
 	}
 	public String getName() {
 		return name;
 	}
 	public void setName(String name) {
 		this.name = name;
 	}
 	public String getEmail() {
 		return email;
 	}
 	public void setEmail(String email) {
 		this.email = email;
 	}
 	public String getPhone() {
 		return phone;
 	}
 	public void setPhone(String phone) {
 		this.phone = phone;
 	}
 	public String getStreet() {
 		return street;
 	}
 	public void setStreet(String street) {
 		this.street = street;
 	}
 	public String getPlace() {
 		return place;
 	}
 	public void setPlace(String place) {
 		this.place = place;
 	}
 	public String getCity() {
 		return city;
 	}
 	public void setCity(String city) {
 		this.city = city;
 	}
 	public String getZip() {
 		return zip;
 	}
 	public void setZip(String zip) {
 		this.zip = zip;
 	}
 	
 	
 	public Customer() {
 		super();
 	}
 	public Customer(String id, String name, String email, String phone, String street, String place, String city,
 			String zip) {
 		super();
 		this.id = id;
 		this.name = name;
 		this.email = email;
 		this.phone = phone;
 		this.street = street;
 		this.place = place;
 		this.city = city;
 		this.zip = zip;
 	}
 	@Override
 	public String toString() {
 		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", street=" + street
 				+ ", place=" + place + ", city=" + city + ", zip=" + zip + "]";
 	}
 	
 	
 	
 	
 }	