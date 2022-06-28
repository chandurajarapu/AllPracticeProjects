package com.app.spring.jdbc.dao;

import java.util.List;

import com.app.spring.jdbc.entity.Employee;

public interface EmployeeDAO {
		Employee getEmployeeByEmployeeId(Integer employeeId);
		List<Employee> getAllEmployee();
		Employee saveEmployee(Employee employee);
		Employee saveOrUpdateEmployee(Employee employee);
}
