package com.springcore.constructorInjection;

public class Person {

	private String name;
	private static int personId;
	
	public Person(String name, int personId) {
		this.name = name;
		this.personId = personId;
		
	}

	@Override
	public String toString() {
		return this.name+" : "+this.personId;
	}
	
}
