package com.demo.demo.entity;

public class LoginCustomer {
	
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginCustomer() {
		super();
	}
	public LoginCustomer(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginCustomer [email=" + email + ", password=" + password + "]";
	}
	
	

}