<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Patient List</title>
 <link href="../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../webjars/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
 <script src="../webjars/jquery/3.0.0/js/jquery.min.js" ></script>
</head>
<body>
 <div class="container">
  <h2> Patient List</h2>
  <table class="table table-striped">
   <thead>
    <tr>
     <th scope="row">Patient ssn</th>
     <th scope="row">Patient Name</th>
     <th scope="row">Patient Age</th>
     <th scope="row">Patient Address</th>
     <th scope="row">Doctor SSN</th>

   </thead>
   <tbody>
    <c:forEach items="${patient_list }" var="patient" >
     <tr>
      <td>${patient.ssn }</td>
      <td>${patient.name }</td>
      <td>${patient.birth_date}</td>
      <td>${patient.address }</td>
      <td>${patient.phy_ssn }</td>
      <td>
       <spring:url value="/patient/update/${patient.ssn }" var="updateURL" />
       <a class="btn btn-primary" href="${updateURL }" role="button">Update</a>
      </td>
      <td>
       <spring:url value="/patient/delete/${patient.ssn }" var="deleteURL" />
       <a class="btn btn-primary" href="${deleteURL }" role="button">Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <spring:url value="/patient/add" var="addURL" />
  <a class="btn btn-primary" href="${addURL }" role="button">Add New Patient</a>
 </div>
</body>
</html>