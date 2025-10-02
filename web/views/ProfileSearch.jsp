<%--
  Created by IntelliJ IDEA.
  User: li_na
  Date: 19.12.2022
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile search</title>
</head>
<body>
    <h2>Hello again:)
        <br>So which profile are you looking for?
    </h2>
    <div>
        <form action="/profile_search">
            <p>
                <label for="p_r">Please write it down: </label>
                <input type="text" name="profile_request" id="p_r">
                <input type="submit" value="Search">
            </p>
        </form>
    </div>
</body>
</html>
