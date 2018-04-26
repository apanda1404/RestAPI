package com.resource.implementation;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.resource.employee.Employee;
import com.resource.operations.EmployeeOpearations;

@Path("/employee")
public class EmployeeImplementation implements EmployeeOpearations {
	public static List<Employee> myemp = new ArrayList<Employee>();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return myemp;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Employee newemp = new Employee();
		newemp.setFname(emp.getFname());
		
	}

	@GET
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return myemp;
	}

	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}

}
