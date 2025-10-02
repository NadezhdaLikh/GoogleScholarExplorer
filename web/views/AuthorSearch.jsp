<%--
  Created by IntelliJ IDEA.
  User: li_na
  Date: 19.12.2022
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Author search</title>
</head>
<body>
    <h2>Hello again:) You chose A!
        <br>So which author are you looking for?
    </h2>
    <div>
        <form action="/author_search">
            <p>
                <label for="a_r">Please write down this author's ID: </label>
                <input type="text" name="author_request" id="a_r">
                <input type="submit" value="Search">
            </p>
        </form>
    </div>
</body>
</html>
