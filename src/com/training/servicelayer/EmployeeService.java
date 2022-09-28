package com.training.servicelayer;

import java.util.List;

import com.training.model.Employee;

public interface EmployeeService {
	public String insertEmployee(Employee emp);
    public List<Employee> getAllEmployees();

}
