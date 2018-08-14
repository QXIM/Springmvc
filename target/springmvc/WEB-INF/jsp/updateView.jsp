<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/13
  Time: 16:50
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

<form action="" method="post" >
        <tr>员工编号:<input type="text" name="empno" value="${emp.empno}"/></tr><br>
        <tr>员工姓名:<input type="text" name="ename" value="${emp.ename}"/></tr><br>
        <tr>员工岗位: <input type="text" name="job" value="${emp.job}"/></tr><br>
        <tr>领导编号
                <select name="mgr">
                        <c:forEach items="${emps}" var="emps">
                                <c:choose>
                                        <c:when test="${emp.mgr==emps.mgr}">
        <option value="${emps.mgr}" selected="selected">${emps.mgr}</option>
                                        </c:when>
                                        <c:otherwise>
        <option value="${emps.mgr}">${emps.mgr}</option>
                                        </c:otherwise>
                        </c:choose>
               </c:forEach>

                </select>


        </tr><br>
        <tr>入职日期<input type="date" name="hiredate" value="2018-10-10"/></tr><br>
        <tr>工资<input type="text" name="sal" value="${emp.sal}"/></tr><br>
        <tr>奖金<input type="text" name="comm" value="${emp.comm}"/></tr><br>
        <tr>部门编号
        <select name="deptno">
                <c:forEach items="${depts}" var="dept">


         <c:choose>
          <c:when test="${dept.deptno==emp.deptno}">
                  <option value="${dept.deptno}" selected="selected">${dept.deptno}</option>
          </c:when>
         <c:otherwise>
                 <option value="${dept.deptno}">${dept.deptno}</option>
         </c:otherwise>


         </c:choose>


                </c:forEach>




        </select>

        </tr><br>
<input type="submit" value="添加" />
</form>




</table>



</body>
</html>
