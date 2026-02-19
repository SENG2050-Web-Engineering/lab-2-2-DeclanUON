package seng2050;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded authentication check
        if ("admin".equals(username) && "password123".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("DashboardServlet");  // Redirect to dashboard
        } else {
            response.getWriter().println("<h3>Invalid Username or Password</h3>");
            request.getRequestDispatcher("login.html").include(request, response);
        }
    }
}