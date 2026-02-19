package seng2050;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Create or get the existing session
        HttpSession session = request.getSession();
        
        // Store data in the session
        session.setAttribute("username", "Rukshan");

        response.getWriter().println("Session created. User: " + session.getAttribute("username"));
        response.getWriter().println("Session created. Session ID: " + session.getId());
    }
}


