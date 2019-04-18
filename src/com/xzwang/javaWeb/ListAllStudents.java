package com.xzwang.javaWeb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Auther: Xingzheng Wang
 * @Date: 4/18/2019 9:56 AM
 * @Description: com.xzwang.javaWeb
 * @Version: 1.0
 */
public class ListAllStudents extends HttpServlet {
    public static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StudentDdao studentDdao = new StudentDdao();
        List<Student> students = studentDdao.getAll();
        req.setAttribute("students", students);
        req.getRequestDispatcher("/students.jsp").forward(req,resp);
    }
}
