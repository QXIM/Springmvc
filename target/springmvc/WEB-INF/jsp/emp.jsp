<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/13
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>员工编号</td>
        <td>员工姓名</td>
        <td>员工岗位</td>
        <td>领导编号</td>
        <td>入职日期</td>
        <td>工资</td>
        <td>奖金</td>
        <td>部门编号</td>
        <td>操作</td>

    </tr>
    <c:forEach items="${emps}" var="emp">
    <tr>

            <td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td>${emp.job}</td>
            <td>${emp.mgr}</td>
            <td>${emp.hiredate}</td>
            <td>${emp.sal}</td>
            <td>${emp.comm}</td>
            <td>${emp.deptno}</td>
            <td>
                <a href="/emp/update/${emp.empno}">修改</a>
                <a href="/emp/delete/${emp.empno}">删除</a>
            </td>



    </tr>

    </c:forEach>


</table>




</body>
</html>
