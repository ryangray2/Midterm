package com.cisc181.core;

public class PersonException extends Exception {
	
	public Person person;
	

	public PersonException(Person person) {
		super();
		this.person = person;
		System.out.println("Try Again");
	}


	public Person getPerson() {
		return person;
	}
}
