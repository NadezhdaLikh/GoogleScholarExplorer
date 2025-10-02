package app.servlets;

import app.service.ProfileSearch;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet
    public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/ProfileSearch.jsp");
        requestDispatcher.forward(req, resp);

        String profile_request = req.getParameter("profile_request");
        System.out.println(profile_request);
        String paramForUrl = URLEncoder.encode(profile_request, StandardCharsets.UTF_8.toString());

        ProfileSearch profileSearch = new ProfileSearch();
        profileSearch.setParamForUrl(paramForUrl);

        profileSearch.DoPSearch();
    }
}
