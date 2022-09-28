package com.training.serviceimplement;

import java.util.*;

import com.training.model.Employee;
import com.training.servicelayer.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	
	@Override
	public void checkgit() {
		// TODO Auto-generated method stub
		
	}

	List<Employee> e  = new ArrayList<Employee>();


	@Override
	public String insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		e.add(emp);
		return "Employee Record Inserted";
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return e;
	}

}
