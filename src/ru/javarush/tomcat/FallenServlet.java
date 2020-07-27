package ru.javarush.tomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FallenServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(408);
        resp.setStatus(HttpServletResponse.SC_REQUEST_TIMEOUT);
//        resp.setContentType("text/html");
//        PrintWriter printWriter = resp.getWriter();
//        printWriter.write("Hello!");
//        printWriter.close();
    }
}
