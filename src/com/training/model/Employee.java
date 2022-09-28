package com.training.model;

public class Employee {
	
	private int empId;
	private String empFirstName;
	private String empLastName;
	private String empEmailAddress;
	private int empSalary;

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public void setEmpEmailAddress(String empEmailAddress) {
		this.empEmailAddress = empEmailAddress;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empEmailAddress=" + empEmailAddress + ", empSalary=" + empSalary + "]";
	}
     
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
