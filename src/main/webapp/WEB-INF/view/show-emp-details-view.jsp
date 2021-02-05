<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Friend, your wishes will be fulfilled very soon!</h2>
<br><br><br>
Your name: ${friend.name}
<br>
Your surname: ${friend.surName}
<br>
Your salary: ${friend.salary}
<br>
Your department: ${friend.department}
<br>
Your car: ${friend.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${friend.languages}">
        <li> ${lang} </li>
    </c:forEach>
    <br>
</ul>
<br>
Phone number: ${friend.phoneNumber}
<br>
</body>
</html>