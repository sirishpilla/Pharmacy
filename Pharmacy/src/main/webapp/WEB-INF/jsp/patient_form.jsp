<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Patients</title>
 <link href="http://localhost:8080/webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="http://localhost:8080/webjars/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
 <script src="http://localhost:8080/webjars/jquery/3.0.0/js/jquery.min.js" ></script>
</head>
<body>
 <div class="container">
  <spring:url value="/patient/save" var="saveURL" />
  <h2>Patient</h2>
  <form:form modelAttribute="patientForm" method="post" action="${saveURL }" cssClass="form">
   <div class="form-group">
    <label for="ssn">SSN</label>
    <form:input path="ssn" cssClass="form-control" id="ssn" />
   </div>
   <div class="form-group">
    <label for="name">Name</label>
    <form:input path="name" cssClass="form-control" id="name" />
   </div>
   <div class="form-group">
    <label for="birth_date">Birth Date</label>
    <form:input type="date" path="birth_date" cssClass="form-control" id="birth_date" />
   </div>
   <div class="form-group">
    <label for="address">Address</label>
    <form:input path="address" cssClass="form-control" id="address" />
   </div>
    <div class="form-group">
    <label for="phy_ssn">Doctor SSN</label>
    <form:input path="phy_ssn" cssClass="form-control" id="phy_ssn" />
   </div>

   <button type="submit" class="btn btn-primary">Save</button>
  </form:form>
 </div>
</body>
</html>