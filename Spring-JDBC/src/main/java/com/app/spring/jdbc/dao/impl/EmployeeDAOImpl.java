package com.app.spring.jdbc.dao.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.app.spring.jdbc.dao.EmployeeDAO;
import com.app.spring.jdbc.entity.Employee;
import com.app.spring.jdbc.entity.mapper.EmployeeMapper;


@Component
public class EmployeeDAOImpl extends BaseDAO implements EmployeeDAO {
	
	
	private final String SQL_FIND_EMPLOYEE = "select * from tbl_employee where employee_id = ?";
	private final String SQL_INSERT_EMPLOYEE = "insert into tbl_employee(  employee_id,employee_name,employee_designation,employee_sal) values(?,?,?,?)";
	private final String SQL_DELETE_EMPLOYEE = "delete from tbl_employee  where employee_id = ?";
	
	private final String SQL_ALL_EMPLOYYES = "select * from tbl_employee";
	

	public Employee getEmployeeByEmployeeId(Integer employeeId) {
		System.out.println("getEmployeeByEmployeeId() :  "+employeeId);
		return jdbcTemplate.queryForObject(SQL_FIND_EMPLOYEE, new Object[] { employeeId }, new EmployeeMapper());
	}

	public List<Employee> getAllEmployee() {
		System.out.println("getAllEmployee() ");
		return jdbcTemplate.query(SQL_ALL_EMPLOYYES, new EmployeeMapper());
	}

	public Employee saveEmployee(Employee employee) {
		System.out.println("saveEmployee()");
		int value =  jdbcTemplate.update(SQL_INSERT_EMPLOYEE, new Object[] { employee.getEmployeeId(),employee.getEmployeeName(),employee.getEmployeeDesignation(),employee.getEmployeeSalary() } );
		System.out.println("value is : "+value);
		return employee;
	}

	public Employee saveOrUpdateEmployee(Employee employee) {
		return null;
	}

}
