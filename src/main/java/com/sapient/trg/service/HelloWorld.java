package com.sapient.trg.service;

public class HelloWorld {
	private String firstName;
	private String LastName;
	
	public HelloWorld() {
	
	}

	public HelloWorld(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		LastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	
}
