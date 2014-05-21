package com.webservice.json.service;

import java.util.Collection;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webservice.json.entity.Employee;


@Service("EmployeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public Collection<Employee> listCollEmployee() {
		return sessionFactory.getCurrentSession()
				.createQuery("FROM Employee m WHERE m.image=null").list();
	}
	
	public Employee findEmployeeById(Long id) {
		
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	public void saveEmployee(Employee employee) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(employee);	
	}

}
