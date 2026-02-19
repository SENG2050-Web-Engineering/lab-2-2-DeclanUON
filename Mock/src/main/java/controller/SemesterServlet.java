package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class SemesterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String semester = request.getParameter("semester");

        if (semester == null || semester.isEmpty()) {
            request.setAttribute("error", "?");
            request.getRequestDispatcher("semester.jsp")
                    .forward(request, response);
            return;
        }

        HttpSession session = request.getSession();
        session.setAttribute("semester", semester);

        response.sendRedirect("courses.jsp");
    }
}
