<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear friend, please enter your details</h2>
<br><br>
<form:form action="showDetails" modelAttribute="employee">
    Name <br><form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <br><form:input path="surName"/>
    <form:errors path="surName"/>
    <br><br>
    Salary do you want <br><form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Phone number<br><form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Scope of work <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select>
    <br><br><br>
    Which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>
    What languages do you want to know?
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br><br>
    <%--setters will work here--%>
    <input type="submit" value="OK!">
</form:form>
</body>
</html>