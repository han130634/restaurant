package com.netease;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;


public class NoodlesServlet extends HttpServlet {
	//Get a logger instance with Logger's getLogger method.
	public static Logger logger = Logger.getLogger(Kitchen.class);
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//init writer
		PrintWriter writer = response.getWriter();
		//get param
		String vegetable = request.getParameter("vegetable");
		if (vegetable == null) {
			vegetable = "Tomato";
		}
		//Kitchen make noodles
		String noodles = Kitchen.makeNoodles(vegetable);
		//Logger.getLogger(Kitchen.class).info("Noodles with " + noodles);
		logger.info("Noodles with " + vegetable);
		//writer print
		writer.println(noodles);
		/*
		if(vegetable == null){
			vegetable = "Tomato";
		}
		
		writer.println("<html><body>");
		writer.println("<h1> Noodles with " + vegetable + " </h1>");
		writer.println("</body></html>");
		*/
	}
	
}
