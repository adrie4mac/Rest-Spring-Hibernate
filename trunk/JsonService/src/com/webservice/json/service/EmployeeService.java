package com.webservice.json.service;

import java.util.Collection;

import com.webservice.json.entity.Employee;

public interface EmployeeService {
	
	public Employee findEmployeeById(Long id);
	public void saveEmployee(Employee employee);
	public Collection<Employee> listCollEmployee();
	
}
