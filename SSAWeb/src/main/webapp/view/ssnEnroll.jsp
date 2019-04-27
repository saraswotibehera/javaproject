<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<head>
<style type="text/css">
	htm,body
	{
		vertical-align:middle;
	}

</style>
<meta charset="ISO-8859-1">
<title>SSN ENROLL</title>
<script src="http://code.jquery.com/jquery-1.8.3.min.js"
	type="text/javascript">
	
</script>

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.10.0/jquery.validate.js"
	type="text/javascript">
	
</script>



<script type="text/javascript">
    $(document).ready(function() {
    	  
      $("#enroll").validate({
      rules: {
        firstName: "required",
        lastName: "required",
        state: "required"
      },
      messages: {
        firstName:  "First Name is a required field!!!",
        lastName:  "Last Name is a required field!!!",
        state:  "state is a required field!"
        },
        
      submitHandler: function(form) {
          form.submit();
      }
      });
      $( "#date" ).datepicker({
	      changeMonth: true,
	      changeYear: true
	 });
     
});
</script>
</head>
<!-- <div class="d"> -->

	<body>
	
		<h1>Welcome to SSN</h1>
		<font color="green">${success}</font>
		<font color="red">${failure}</font>
		<fieldset style="width: 400px">
			<legend>SSN Enroll</legend>
			<form:form action="ssnEnroll" method="post" modelAttribute="ssnModel" enctype="multipart/form-data" id="enroll">

				<table border="1" >
					<tr>
						<td>First Name:</td>
						<td><form:input path="firstName" /></td>
					</tr>

					<tr>
						<td>Last Name:</td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td>Dob:</td>
						<td><form:input path="dob" id="date" /></td>
					</tr>
					<tr>
						<td>Gender:</td>
						<td><form:radiobuttons path="gender" items="${gender}" /></td>
					</tr>
					<tr>
						<td>Mobile No:</td>
						<td><form:input path="phNo" /></td>
					</tr>
					<tr>
						<td>States :</td>
						<td><form:select path="state" items="${state}"></form:select></td>
					</tr>
					<tr>
						<td>Select Photo:</td>
						<td><form:input path="photo" type="file" /></td>
					</tr>
					<tr>
						<td><input type="reset" name="Reset" /></td>
						<td><input type="submit" name="Enroll" /></td>
					</tr>
				</table>
			</form:form>
			<a href="enrolldata"> enrolldata details</a>
		</fieldset>
	
	</body>
</html>