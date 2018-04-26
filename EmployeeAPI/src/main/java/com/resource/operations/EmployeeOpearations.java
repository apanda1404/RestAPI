package com.resource.operations;

import java.util.List;
import com.resource.employee.Employee;

public interface EmployeeOpearations {
	public List<Employee> getEmployee();
	public void createEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	public void updateEmployee(Employee emp);
	
}
