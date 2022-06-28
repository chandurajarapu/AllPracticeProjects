package com.app.spring.jdbc.test;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.spring.jdbc.config.AppConfig;
import com.app.spring.jdbc.dao.EmployeeDAO;
import com.app.spring.jdbc.entity.Employee;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

		List<Employee> allEmployee = employeeDAO.getAllEmployee();

		for (Employee employee : allEmployee) {
			System.out.println("Employee Id : "+employee.getEmployeeId());
			System.out.println("Employee Name : "+employee.getEmployeeName());
			System.out.println("Employee Desig : "+employee.getEmployeeDesignation());
			System.out.println("Employee Sal : "+employee.getEmployeeSalary());
		}
		System.out.println("==========================================================");
		Employee employee = employeeDAO.getEmployeeByEmployeeId(1);
		System.out.println("Employee Id : "+employee.getEmployeeId());
		System.out.println("Employee Name : "+employee.getEmployeeName());
		System.out.println("Employee Desig : "+employee.getEmployeeDesignation());
		System.out.println("Employee Sal : "+employee.getEmployeeSalary());
		
		context.close();
	}
}
