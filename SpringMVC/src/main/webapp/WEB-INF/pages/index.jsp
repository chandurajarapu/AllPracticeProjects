<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    


<form:form  modelAttribute="employee"  action="root/register" method="POST" >
		<table  align='center'>
				<tr><td>Employee Id</td><td><form:input path="employeeId" /> </td></tr>
				<tr><td>Employee Name</td><td><form:input path="employeeName" /></td></tr>
				<tr><td></td><td><input value="Register" type="submit"/></td></tr>
		</table>
</form:form>
