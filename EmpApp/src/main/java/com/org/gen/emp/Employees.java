package com.org.gen.emp;

import java.util.ArrayList;
import java.util.List;

public class Employees {
	private List<Employee> employeeList;
	
	//return the list
	public List<Employee> getEmployeeList(){
		if(employeeList==null) {
			employeeList = new ArrayList<>();
		}
	return employeeList;
	
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList=employeeList;
	}
	

}
