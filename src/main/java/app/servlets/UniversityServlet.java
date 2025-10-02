package app.servlets;

import app.service.UniversitySearch;

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
public class UniversityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/UniversitySearch.jsp");
        requestDispatcher.forward(req, resp);

        String university_request = req.getParameter("university_request");
        System.out.println(university_request);
        String paramForUrl = URLEncoder.encode(university_request, StandardCharsets.UTF_8.toString());
        String temp = req.getParameter("university_pagination");
        int pagination = Integer.parseInt(temp);
        System.out.println(pagination);

        UniversitySearch universitySearch = new UniversitySearch();
        universitySearch.setParamForUrl(paramForUrl);
        universitySearch.setPagination(pagination);

        universitySearch.DoUSearch();
    }
}
