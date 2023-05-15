import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "dictionary", value = "/dictionary")
public class dictionary extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     Map<String,String> dictionary=new HashMap<>();
     dictionary.put("Hello","Xin chao");
     dictionary.put("sleep","Ngu");
     dictionary.put("elevator","Thang may");
     dictionary.put("Stair","Thang bo");
     dictionary.put("quantity","So luong");
     dictionary.put("delivery","Giao hang");
     dictionary.put("ask","Hoi");
     dictionary.put("find","Tim kiem");
     dictionary.put("leave","Roi bo");
     dictionary.put("now","bay gio");
     String search=request.getParameter("textSearch");
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
       String result=dictionary.get(search);
       if(result!=null){
           writer.println("world"+search);
           writer.println("result"+result);
       }else {
           writer.println("Not Found");
       }
       writer.println("</html>");
    }
}
