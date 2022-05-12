package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}
public class Demo4_Filter_Map {

	public static void main(String[] args) {
//		List<Employee> employeeList=new ArrayList<>();
//		employeeList.add(new Employee(101,"tony",1000));
//		employeeList.add(new Employee(102,"mark",1001));
//		employeeList.add(new Employee(103,"jon",1002));
		
		List<Employee> employeeList=Arrays.asList(new Employee(101,"tony",1000),new Employee(102,"mark",1001),new Employee(103,"jon",1002));
	
		List<Integer> data=employeeList.stream().filter(e ->e.salary>1000).map(e ->e.salary+20000).collect(Collectors.toList());
	
	System.out.println(data);
	
	
	
	
	
	
	
	}

}
