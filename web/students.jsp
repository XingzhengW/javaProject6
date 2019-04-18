<%@ page import="java.util.List" %>
<%@ page import="com.xzwang.javaWeb.Student" %><%--
  Created by IntelliJ IDEA.
  User: Xingzheng Wang
  Date: 4/18/2019
  Time: 10:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
</head>
<body>
<%
    List<Student> stus = (List<Student>) request.getAttribute("students");
%>
<table>
    <tr>
        <th>FlowId</th>
        <th>type</th>
        <th>IdCard</th>
        <th>ExamCard</th>
        <th>StudentName</th>
        <th>Location</th>
        <th>Grade</th>
    </tr>
    <%
        for (Student student : stus) {
    %>
    <td><%= student.getFlow_id() %></td>
    <td><%= student.getType() %></td>
    <td><%= student.getIdCard() %></td>
    <td><%= student.getExamcard() %></td>
    <td><%= student.getStudentName() %></td>
    <td><%= student.getLocation() %></td>
    <td><%= student.getGrade() %></td>
    <%
        }
    %>
</table>
</body>
</html>
