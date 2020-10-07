package com.demo;

public class Employee {
	String name;
	int salary;
	//default constructor
//	public Employee() {
//		System.out.println("Calling no args Costructor");
//	}
	public Employee(String name ,int salary) {
		System.out.println("Call parametrize constructor");
		this.name=name;
		this.salary=salary;
		
	}
	public Employee(int i, String string) {
		super();
		this.salary = i;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
//    public static void main(String[] args) {
//		Employee e = new Employee("ninad",2000);
////		e.setName("Ninad");
////		e.setSalary(200000);
//		System.out.println(e.getName());
//		System.out.println(e.getSalary());
//		
//		
//		
//	}
	
}
