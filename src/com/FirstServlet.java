package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		String v1 = req.getParameter("v1");
		double s = Double.valueOf(v1);            
		String v2 = req.getParameter("v2");
		double t = Double.valueOf(v2);             
		Object result; 
		
		double dis1 = Math.abs(10-s);
		double dis2 = Math.abs(10-t);
		
		if (dis1 > dis2) {
			result = t;
		}
		else if (dis1 == dis2){
			result = null;
		}
		else result = s;
		
		if (result == null){	       
		resp.getWriter().println("The numbers are equals or equidistant");
		}
		else {
			resp.getWriter().println(result);
		}
	}

}
