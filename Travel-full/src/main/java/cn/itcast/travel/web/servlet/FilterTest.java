package cn.itcast.travel.web.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class FilterTest extends BaseServlet {
    public void findOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      request.setCharacterEncoding("utf-8");
        System.out.println("FilterTest在执行");

      request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
