package com.example.lesson_9;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "product", value = "/product")
public class product extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     float price=Float.parseFloat(request.getParameter("price"));
     float discount=Float.parseFloat(request.getParameter("discount"));
     String nameProduct=request.getParameter("productname");
     float totalDiscount= (float) (price*discount*0.01);
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<p productName: >"+nameProduct+"</p>");
        writer.println("<p price: >"+price+"</p>");
        writer.println("<p discount: >"+discount+"</p>");
        writer.println("<p totalDiscount: >"+totalDiscount+"</p>");
        writer.println("</html>");


    }
}
