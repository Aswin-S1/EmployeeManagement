package com.training.employeemanage;

import java.util.*;

import com.training.model.Employee;
import com.training.serviceimplement.EmployeeServiceImpl;
//import com.training.servicelayer.EmployeeService;

public class EmployeeRecordManage {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		boolean stat = true;
        
		EmployeeServiceImpl empService = new EmployeeServiceImpl();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to Insert Employees and Enter 2 to show employees");
        //System.out.println("");
        
        do {
            
            x = sc.nextInt();
        
        switch(x) {
        
        case 1:
            Employee emp = new Employee();
            emp.setEmpId(10);
            emp.setEmpFirstName("Aswin");
            emp.setEmpLastName("S");
            emp.setEmpEmailAddress("aswin@java.com");
            emp.setEmpSalary(1000000);
            String insertEmployee = empService.insertEmployee(emp);
            System.out.println(insertEmployee);
            break;
            
        case 2:
            List<Employee> allEmp = empService.getAllEmployees();
            System.out.println(allEmp);
            break;  
        }
        }
        while(stat);
        sc.close();
    }


}
