import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Change_money_Servlet", value = "/Change_money_Servlet")
public class Change_money_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      float rex=Float.parseFloat(request.getParameter("change"));
      float usd=Float.parseFloat(request.getParameter("usd"));
      float total=rex*usd;
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<p>rex:"+rex+"</p>");
        writer.println("<p>usd:"+usd+"</p>");
        writer.println("<p>total:"+total+"</p>");
        writer.println("</html>");
    }
}
