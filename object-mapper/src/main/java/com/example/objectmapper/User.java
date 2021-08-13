package com.example.objectmapper;

public class User {

	private String name;
	private int age;
	
	public User() {
		this.name = null;
		this.age = 0;
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}
