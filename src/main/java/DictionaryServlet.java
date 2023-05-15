import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", value = "/DictionaryServlet")
public class DictionaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary=new HashMap<>();
        dictionary.put("Cau thang bo","stair");
        dictionary.put("Thang may","elevator");
        dictionary.put("ngu","sleep");
        dictionary.put("giao hang","delivery");
        dictionary.put("Dong goi","package");
        dictionary.put("so luong","quantity");
        dictionary.put("tim kiem","find");
        dictionary.put("ask","hoi");
        dictionary.put("leave","tu bo");
        dictionary.put("nho","miss");
        String words=request.getParameter("English");
        PrintWriter writer=response.getWriter();
        String result=dictionary.get(words);
        if(result!=null){
            writer.println("<html>");
            writer.println("<p> words:"+words+"</p>");
            writer.println("<p> result:"+result+"</p>");
        }
        else {
            writer.println("<p> your please change words");
        }
        writer.println("</html>");
    }
}
