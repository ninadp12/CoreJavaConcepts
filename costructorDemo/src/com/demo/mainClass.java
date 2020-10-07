package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mainClass {
  public static void main(String[] args) {
	     List<Employee> employeesList = Arrays.asList(
	             new Employee(1, "Alex"),
	             new Employee(2, "Brian"),
	             new Employee(3, "Charles"),
	             new Employee(4, "David"),
	             new Employee(2, "Edward"),
	             new Employee(1, "Frank")
	         );
	     
//	     List<Integer> distinctSalaries = employeesList.stream().map(e->e.getSalary()).distinct().collect(Collectors.toList());
//	     System.out.println(distinctSalaries.toString());
	     
	     
	     employeesList.stream().filter(e->e.getSalary()== 1).collect(Collectors.toList()).forEach(System.out::println);
	     
	     
	     
}
  
  
}
