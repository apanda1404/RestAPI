package com.resource.implementation;

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

	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public void createEmployee() {
		// TODO Auto-generated method stub
		
	}

	@GET
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEmployee() {
		// TODO Auto-generated method stub

	}

}
