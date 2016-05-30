package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		String v1 = req.getParameter("v1");
		double a = Double.valueOf(v1);            
		String v2 = req.getParameter("v2");
		double b = Double.valueOf(v2);            
		String v3 = req.getParameter("v3");
		double c = Double.valueOf(v3);
		double x1, x2;
		
		double d = (b*b-4*a*c);	
		if (d < 0) 
			resp.getWriter().println("no solutions");
		else if (d == 0) {
		x1 = -b/(2*a);
		resp.getWriter().println(x1);
		}
		else {
			x1 = (-b + Math.sqrt(d))/(2*a);
			x2 = (-b - Math.sqrt(d))/(2*a);
			
		resp.getWriter().println(x1);
		resp.getWriter().println(x2);
		}
	}

}
