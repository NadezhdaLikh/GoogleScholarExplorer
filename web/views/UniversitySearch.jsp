<%--
  Created by IntelliJ IDEA.
  User: li_na
  Date: 18.07.2022
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>University search</title>
</head>
<body>
    <h2>Hello again:)
        <br>So which university are you looking for and how many results do you want to see?
        <br>Please write it down.
    </h2>
    <div>
        <form action="">
            <p>
                <label for="u_r">The university is </label>
                <input type="text" name="uni_req" id="u_r">
                <label for="u_p">, the number of results is </label>
                <input type="text" name="uni_pag" id="u_p" placeholder="10, 20 or 30">
                <input type="submit" value="Search">
            </p>
        </form>
    </div>
</body>
</html>
