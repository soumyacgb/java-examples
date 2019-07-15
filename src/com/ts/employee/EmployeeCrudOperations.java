package com.ts.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.ts.dto.Employee;

/**
 * This class is used to perform the CRUD operations in employee object
 * 
 * @author soumya
 *
 */

public class EmployeeCrudOperations {

	public static void main(String a[]) {
		List<Employee> employeesList = new ArrayList<>();
		createEmployeeDetails(employeesList);
		fetchEmployeeDetails(employeesList);
		updateEmployeeDetails(employeesList);
		deleteEmployeeDetails(employeesList);

	}

	/**
	 * This method is used to create the employee details
	 * 
	 * @param employeeSet
	 */
	public static void createEmployeeDetails(List<Employee> employeesList) {

		employeesList.add(new Employee(1001, "Adam", "Williams", 21, "Software Engineer"));
		employeesList.add(new Employee(1002, "Henry", "James", 20, "Junior Tester"));
		employeesList.add(new Employee(1003, "Jack", "Jonnathon", 30, "Technical Lead"));
		employeesList.add(new Employee(1004, "Jim", "Luce", 25, "Technology Analyst"));
		employeesList.add(new Employee(1005, "Jeff", "Archer", 28, "Technology Analyst"));
		employeesList.add(new Employee(1006, "Ann", "Wilson", 35, "Technical Architect"));
		employeesList.add(new Employee(1007, "Lori", "Torell", 35, "Project Manager"));
		employeesList.add(new Employee(1008, "Tracy", "Susanne", 39, "Project Lead"));
		employeesList.add(new Employee(1009, "Tom", "Hue", 32, "Scrum Master"));
		employeesList.add(new Employee(1010, "Nancy", "Taylor", 45, "Product Owner"));

	}

	/**
	 * This method is used to retrieve the employee details
	 * 
	 * @param employeeSet
	 */
	public static void fetchEmployeeDetails(List<Employee> employeesList) {
		Iterator<Employee> employeeIterator = employeesList.iterator();
		while (employeeIterator.hasNext()) {
			System.out.println("Employee Records:" + employeeIterator.next());
		}

	}

	/**
	 * This method is used to update the existing employee map
	 * 
	 * @param employeesList
	 */
	public static void updateEmployeeDetails(List<Employee> employeesList) {

		for (Employee emp : employeesList) {	
				emp.setAge(55);

		}

		System.out.println("Update Employee List:" + employeesList.toString());

	}

	/**
	 * This method is used to delete an existing employee details
	 * 
	 * @param employeesList
	 */
	public static void deleteEmployeeDetails(List<Employee> employeesList) {

		Iterator<Employee> empIterator = employeesList.iterator();
		while(empIterator.hasNext()) {
			if(empIterator.next().getEmployeeId() == 1001) {
				empIterator.remove();
			}
		}

		System.out.println("Updated Employee List after delete operation success :" + employeesList.toString());

	}

}
