<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <%@ page isELIgnored="false" %>
    </head>
    <h1>Welcome to Spring 4 and Servlet 3 Based Application</h1>
    <h2>${greet}</h2>
    <body>
	<c:if test="${resp ne null and resp.statusCode eq '200'}">
			     <table border="2" width="70%" cellpadding="2">  
					<tr><th>EMPLOYEE ID</th><th>EMPLOYEE NAME</th></tr>  
						   <c:forEach var="emp" items="${resp.response}">   
						   <tr>  
								   <td>${emp.employeeId}</td>  
								   <td>${emp.employeeName}</td>  
						   </tr>  
						   </c:forEach>  
			   	  </table>  
	   </c:if>
	   <c:if test="${resp ne null and resp.statusCode ne '200'}">
	   			<p style="color: red;">${resp.statusMessage}</p>
	   </c:if>
	   
	   <c:if test="${resp eq null}">
	   			<p style="color: red;">Something went wrong,please try-again after some time</p>
	   </c:if>
	   
      
    </body>
</html>