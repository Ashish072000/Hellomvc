package com.org.gen.emp;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	private static Employees list = new Employees();
	static {
		list.getEmployeeList().add(new Employee(1,"a","b","xyz"));
		list.getEmployeeList().add(new Employee(2,"p","q","pqr"));
	}
	public Employees getAllEmployess() {
		return list;
	}
	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);
	}

}
