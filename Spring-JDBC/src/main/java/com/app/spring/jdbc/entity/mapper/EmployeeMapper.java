package com.app.spring.jdbc.entity.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.spring.jdbc.entity.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int i) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
		employee.setEmployeeName(rs.getString("EMPLOYEE_NAME"));
		employee.setEmployeeDesignation(rs.getString("EMPLOYEE_DESIGNATION"));
		employee.setEmployeeSalary(rs.getInt("EMPLOYEE_SAL"));
		return employee;
	}

}
