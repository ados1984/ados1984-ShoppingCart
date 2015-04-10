package com.mycart.controllers.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;

	public void init() throws ServletException {
		//message = "Hello World";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Request Scheme: "+request.getScheme());
		System.out.println("Request ServerName: "+request.getServerName());
		System.out.println("Request ServerPort: "+request.getServerPort());
		System.out.println("Request URI: "+request.getRequestURI());
		System.out.println("Request QueryString: "+request.getQueryString());
		request.getQueryString();
		
	}
	

	public void destory() {

	}
}
