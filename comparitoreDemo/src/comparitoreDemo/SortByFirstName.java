package comparitoreDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByFirstName {
  public static void main(String[] args) {

      List<Employee> employees  = new ArrayList<>();
      employees.add(new Employee(6,"Yash", "Chopra", 25));
      employees.add(new Employee(2,"Aman", "Sharma", 28));
      employees.add(new Employee(3,"Aakash", "Yaadav", 52));
      employees.add(new Employee(5,"David", "Kameron", 19));
      employees.add(new Employee(4,"James", "Hedge", 72));
      employees.add(new Employee(8,"Balaji", "Subbu", 88));
      employees.add(new Employee(7,"Karan", "Johar", 59));
      employees.add(new Employee(1,"Lokesh", "Gupta", 32));
      employees.add(new Employee(9,"Vishu", "Bissi", 33));
      employees.add(new Employee(10,"Lokesh", "Ramachandran", 60));
  
	  
//      employees.sort(Comparator.comparing(e -> e.getFirstName()));
//      
//      employees.sort(Comparator.comparing(Employee::getFirstName));
      
      Comparator<Employee> comparator = Comparator.comparing(Employee::getFirstName);
      employees.sort(comparator.reversed());
      
      System.out.println(employees);
}
}
