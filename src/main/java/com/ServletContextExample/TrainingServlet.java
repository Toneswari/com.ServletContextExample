package com.ServletContextExample;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TrainingServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		ServletContext context=getServletContext();
		String str=context.getInitParameter("Mission");
		res.getWriter().println("Training mission is "+str);
	}

}
