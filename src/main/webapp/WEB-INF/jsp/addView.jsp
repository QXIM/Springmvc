<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/13
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>

<form action="/emp/addEmp" method="get" >
        <tr>员工编号:<input type="text" name="empno"/></tr><br>
        <tr>员工姓名:<input type="text" name="ename"/></tr><br>
        <tr>员工岗位: <input type="text" name="job"/></tr><br>
        <tr>领导编号<input type="text" name="mgr"/></tr><br>
        <tr>入职日期<input type="text" name="hiredate"/></tr><br>
        <tr>工资<input type="text" name="sal"/></tr><br>
        <tr>奖金<input type="text" name="comm"/></tr><br>
        <tr>部门编号<input type="text" name="deptno"/></tr><br>
<input type="submit" value="添加" />
</form>




</table>



</body>
</html>
