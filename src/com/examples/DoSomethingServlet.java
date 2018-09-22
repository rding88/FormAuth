package com.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoSomethingServlet
 */
@WebServlet("/DoSomething")
public class DoSomethingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
     * @see HttpServlet#HttpServlet()
     */
    public DoSomethingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    static String PAGE_HEADER = "<html><head><title>helloworld</title></head><body>";

    static String PAGE_FOOTER = "</body></html>";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println(PAGE_HEADER);
        writer.println("<h1>" + "Success" + "</h1>");
        writer.println(PAGE_FOOTER);
        writer.close();
	}

}
