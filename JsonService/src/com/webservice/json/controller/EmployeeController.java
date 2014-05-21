package com.webservice.json.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webservice.json.entity.Employee;
import com.webservice.json.entity.Person;
import com.webservice.json.service.EmployeeService;

@Controller
@RequestMapping(value="/rest/*")
public class EmployeeController {
	
	@Autowired protected EmployeeService employeeService;
	@Autowired private Person person;
	
	@RequestMapping(value="/search", method=(RequestMethod.GET), produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Collection<HashMap<String, Object>> search(){
		Collection<Employee> listEmployee = employeeService.listCollEmployee();
		
		Collection<HashMap<String, Object>> rows = new ArrayList<HashMap<String, Object>>();
		for(Employee items : listEmployee){
			HashMap<String, Object> tempResult = new HashMap<String, Object>();
			tempResult.put("id", items.getId());
			tempResult.put("name", items.getName());
			tempResult.put("birth", items.getBirthday());
			rows.add(tempResult);
		}
		
		return rows;
	}	


	@RequestMapping(value="/all", method=(RequestMethod.GET), produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Map<String, Object>> all(){
		Collection<Employee> listEmployee = employeeService.listCollEmployee();
		
		List<Map<String, Object>> rows = new ArrayList<Map<String,Object>>();
		for(Employee items : listEmployee){
			Map<String, Object> tempResult = new HashMap<String, Object>();
			tempResult.put("id", items.getId());
			tempResult.put("name", items.getName());
			tempResult.put("birth", items.getBirthday());
			rows.add(tempResult);
		}
		
		return rows;
	}
	
	@RequestMapping(value="/{id}")
	public @ResponseBody Employee getEmployeInJSON(@PathVariable Long id) {
 
		Employee employee = employeeService.findEmployeeById(id);
		
		return employee;
	}
	
	
	@RequestMapping(value = "/save/{id}")
    public @ResponseBody Employee save(@PathVariable Long id) {
    	
		Employee xEmploye = employeeService.findEmployeeById(id);
		xEmploye.setImage("image2");
		
		employeeService.saveEmployee(xEmploye);
		
		return xEmploye;
	}
	
	@RequestMapping(value ="/person")
	public @ResponseBody String getnama() {
		
		System.out.println("ketawa "+ person.getName());
		
		Person person1 = new Person();
		
		System.out.println("klo ga ketawa "+ person1.getName());
		
		return person.getName();
		
		
		
	}
	
}
