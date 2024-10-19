package ge.tsu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "registrationServlet", value = "/registration")
public class registrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();


        String email = req.getParameter("exampleInputEmail1");
        String password1 = req.getParameter("exampleInputPassword1");
        String password2 = req.getParameter("exampleInputPassword2");
        //TODO check in databse if this email exists!
//        out.println(email);
//        out.println(password1);
//        out.println(password2);
        if(!password1.equals(password2)) {
            out.println("Passwords do not match! Please go back and try again.");
        }else if(password1.length()<8){
            out.println("Password must be at least 8 characters long! Please go back and try again.");
        }else{
            User ss=new User(email,password1);
            out.println("Registration successful!<br>");
            out.println("Email: " + email);
        }

        //TODO navigation in central page after successfull sign up
    }
}