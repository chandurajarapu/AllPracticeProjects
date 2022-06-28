package com.app.spring.mvc.model;

import java.io.Serializable;

public class Employee implements Serializable {
		public Integer employeeId;
		private String employeeName;
		public Integer getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
}
