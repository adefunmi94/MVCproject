<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>


	<title>Customer Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="customer">
	
		<br><br>
		
		First name: <form:input path="firstName"/>
		<br><br>
		Last name: <form:input path="lastName"/>
		
		<br><br>
		User name: <form:input path="userName"/>
		
		<br><br>
		password: <form:input path="password"/>
		
		<br><br>
		State :
		 <form:select path="state">
		 
		 	<form:option value="Lagos" label="Lagos"/>
		 	<form:option value="Kwara" label="Kwara"/>
		 	<form:option value="Ogun" label="Ogun"/>
		 	<form:option value="Anambra" label="Anambra"/>
		 	<form:option value="Oyo" label="Oyo"/>
		 	<form:option value="Imo" label="Imo"/>
		 	<form:option value="Osun" label="Osun"/>
		 	
		  </form:select>
		<br><br>
		<input type="submit" value="Submit"/>
	
	</form:form>

</body>

</html>