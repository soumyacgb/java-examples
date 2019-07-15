package com.ts.dto;

/**
 * This class is used to maintain the employee details
 * @author soumya
 *
 */
public class Employee {
	
	private int employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private int age;
	private String designation;
	
	/**
	 * Parameterized Constructor
	 * @param employeeId
	 * @param employeeFirstName
	 * @param employeeLastName
	 * @param age
	 * @param designation
	 */
	
	public Employee(int employeeId, String employeeFirstName, String employeeLastName, int age, String designation) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.age = age;
		this.designation = designation;
	}
	/**
	 * 
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 
	 * @return designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * 
	 * @param designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * 
	 * @return employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * 
	 * @param employeeId
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * 
	 * @return employeeFirstName
	 */
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((employeeFirstName == null) ? 0 : employeeFirstName.hashCode());
		result = prime * result + employeeId;
		result = prime * result + ((employeeLastName == null) ? 0 : employeeLastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (employeeFirstName == null) {
			if (other.employeeFirstName != null)
				return false;
		} else if (!employeeFirstName.equals(other.employeeFirstName))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeLastName == null) {
			if (other.employeeLastName != null)
				return false;
		} else if (!employeeLastName.equals(other.employeeLastName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName + ", employeeLastName="
				+ employeeLastName + ", age=" + age + ", designation=" + designation + "]";
	}
	/**
	 * 
	 * @param employeeFirstName
	 */
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	/**
	 * 
	 * @return employeeLastName
	 */
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	/**
	 * 
	 * @param employeeLastName
	 */
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	
	

}
