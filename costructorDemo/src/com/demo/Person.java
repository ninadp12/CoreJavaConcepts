package com.demo;

public class Person {
 String name;
 
public Person(String name) {
 this.name = name;
   System.out.println("Calling person constrctor");
  }
}
 
class Employes extends  Person 
{
	int age;
	
	public Employes(String name) {
		super(name);
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
  
}

