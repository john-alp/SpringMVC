<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<body>
<h2>Dear Employee, Please enter your details</h2>
<br><br>

<form:form action = "showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surName"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
<%--здесь сработают сеттеры--%>
    <input type="submit" value="OK!">

</form:form>


</body>

</html>