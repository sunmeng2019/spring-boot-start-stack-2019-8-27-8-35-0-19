package com.tw.apistackbase.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")

public class employee {
	private String ID;
	private String Name;
	private int Age;
	
	public Employee(String ID,String Name,int Age) {
		this.ID = ID;
		this.Name = Name;
		this.Age = Age;
	}
	public int getAge() {
		return Age;
	}
	
	public String getID() {
		return ID;
	}
	public string getName{
		return Name;
	}
	
}
	
			
