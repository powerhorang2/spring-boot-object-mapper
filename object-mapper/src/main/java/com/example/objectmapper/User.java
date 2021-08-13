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
	
	// Object Mapper가 해당 클래스에 대해서 serializer 할 때
	// field get 메소드 제외한 다른 get Method를 생성할 시 오류가 남
	public User getDefaultUser() {
		return new User("default", 0);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}
