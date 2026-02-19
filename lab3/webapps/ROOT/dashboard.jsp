<%@ page import="seng2050.SemesterBean" %>

<html>
<head>
<title>Dashboard</title>
</head>
<body>

<h2>Welcome</h2>

<%
String username = (String) session.getAttribute("username");
SemesterBean semester = (SemesterBean) request.getAttribute("semester");
%>

<p>Logged in as: <%= username %></p>

<p>Available Semester: <%= semester.getSemesterName() %></p>

</body>
</html>
