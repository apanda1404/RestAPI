package com.resource.operations;

import java.util.List;
import com.resource.employee.Employee;

public interface EmployeeOpearations {
	public List<Employee> getEmployee();
	public void createEmployee();
	public List<Employee> getAllEmployee();
	public void updateEmployee();
	
}
