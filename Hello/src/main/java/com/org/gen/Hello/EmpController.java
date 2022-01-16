package com.org.gen.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@RequestMapping("/empinfo")
	public Employee EmpInfo(@RequestParam(value="empName") String empName) {
		Employee e1 =new Employee();
		e1.setEmpName("Hello"+empName);
		e1.setEmpid(101);
		e1.setAddress("Mumbai");
				return e1;
				
				
	}
	
	
	
	

}
