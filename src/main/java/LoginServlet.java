import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String userName=request.getParameter("username");
      String password=request.getParameter("password");
        PrintWriter writer=response.getWriter();
      if(userName.equals("Tom")&&password.equals("06042001")){
          writer.println("<html>");
          writer.println("<p>Welcome you go to school</p>");
      }
      else {
          writer.println("<p>please your change login</p>");
      }
      writer.println("</html>");
    }
}
