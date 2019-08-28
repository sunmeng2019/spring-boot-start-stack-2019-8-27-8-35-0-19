package com.tw.apistackbase.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")

public class employeeResource {
	list<Employee> employees=new ArrayList<Employee>();
	@GetMapping(path="/")
	@ResponseStatus(HttpStatus.OK)
	public list<Employee> getEmployees(){
		employees.add(new Employee("1","lisi","23","男"))
		employees.add(new Employee("2","jhh","21","男")) 
		return employees; 
	}
}
	
	@PostMapping(path = "/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Employee createEmployees(@RequestBody Employee employee) {
		employee.add(employee);
		return employee;
	}
	
@PutMapping(path = "/ID")
public ResponseEntity<Employee> getOneEmployee(@PathVariable int ID){
	for(employee.getID()==ID) {
		return ResponseEntity.ok(empolyee);
	}
		
}
return new ResponseEntity(HttpStatus.NOT_FOUND);
@PutMapping(path = "/{ID}")
public ResponseEntity<Employee> updateEmployee(@ResquestBody Employee updateEmployee){
	for (Employee employee :employees) {
		return ResponseEntity.ok(employee);
	}
}
return null;















