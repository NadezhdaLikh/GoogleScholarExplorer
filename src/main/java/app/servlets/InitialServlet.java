package app.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class InitialServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String initial_request = req.getParameter("initial_request");
        System.out.println(initial_request);

        switch(initial_request) {
            case("U"):
                String path = req.getContextPath() + "/university_search";
                resp.sendRedirect(path);
                break;
            case("P"):
                path = req.getContextPath() + "/profile_search";
                resp.sendRedirect(path);
                break;
            case("A"):
                path = req.getContextPath() + "/author_search";
                resp.sendRedirect(path);
                break;
        }
    }
}
