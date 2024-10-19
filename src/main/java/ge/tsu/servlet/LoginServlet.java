package ge.tsu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = {"","/Login"})
public class LoginServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/pages/Login.jsp").forward(req,resp);
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String inputEmail = req.getParameter("inputEmail");
        String password = req.getParameter("inputPassword");
//        PrintWriter out = resp.getWriter();
//        out.println(password);

        if (password.length() < 8 || password.isBlank() || password.isEmpty()) {
            // Password length is less than 8 characters
            resp.sendRedirect(req.getContextPath() + "/Login");
        }else {
            // Password is valid, proceed with your logic
            // For demonstration, redirect to a central page
            resp.sendRedirect(req.getContextPath() + "/central");
        }

    }

}










//        //Cookie cookie = new Cookie(inputEmail,password);
//        //TODO  Connect to database
//        //TODO Send user email and password to database
//        //TODO check if this user exist
//        //TODO if user exist we must allow him to the website and redirect to the centralServlet page
//        req = new HttpServletRequestWrapper(req){
//            @Override
//            public String getMethod(){
//                return "GET";
//            }
//        };
