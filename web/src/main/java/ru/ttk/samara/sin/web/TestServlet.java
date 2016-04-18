package ru.ttk.samara.sin.web;

import ru.ttk.samara.sin.ejb.TestService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

/**
 * Created by 1 on 09.04.2016.
 */
@WebServlet("/servlet")
public class TestServlet extends HttpServlet{

    @EJB
    private TestService testService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer writer = resp.getWriter();
        writer.write("Test message "+ (new Date()) + " test date "+testService.getDate());
    }
}
