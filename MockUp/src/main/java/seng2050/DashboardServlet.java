package seng2050;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("username") == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        Semester semester = new Semester();
        semester.setSemesterName("Semester 1, 2026");

        request.setAttribute("semester", semester);

        request.getRequestDispatcher("dashboard.jsp").forward(request, response);
    }
}
