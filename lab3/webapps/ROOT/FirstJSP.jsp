<!DOCTYPE html>
    <head>
        <title>First JSP</title>
        <%! public java.util.Date PrintDate()
            {
                return (new java.util.Date());
            } %>

            <% String name = request.getParameter("name"); %>
    </head>
    <body>
        <% double num = Math.random(); %>
        <% if (num > 0.5) { %>
            <h2> <%= name %> have a lucky day!</h2> 
            <p> (<%= num %>)</p>
        <% } else { %>
            <h2> <%= name %> will have a great day! </h2> 
            <p> (<%= num %>)</p>
        <% } %>
        <h1>
            Current date: <%= PrintDate() %>
        </h1>
    </body>
</html>