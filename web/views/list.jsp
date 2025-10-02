<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: li_na
  Date: 18.07.2022
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List users</title>
</head>
<body>
    <div>Hello!</div>
    <div>
        <div>
            <div>
                <h2>Users</h2>
            </div>
            <%
                List<String> names = (List<String>) request.getAttribute("userNames");

                if (names != null && !names.isEmpty()) {
                    out.println("<ui>");
                    for (String s : names) {
                        out.println("<li>" + s + "</li>");
                    }
                    out.println("</ui>");
                } else out.println("<p>There are no users yet!</p>");
            %>
        </div>
    </div>

    <div>
        <button onclick="location.href='/'">Back to main</button>
    </div>
</body>
</html>
