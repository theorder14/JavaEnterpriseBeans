Frågor/områden att undersöka under veckan i era grupper:

Vad är EJB? När introducerades det till Java EE?
Teknik för att hantera transaktioner, databasoperationer och centrala tjänster i mjukvara för affärssystem.

Det finns några olika sorters bönor i EJB, vilka då? Vad har man dem till?
stateful, stateless, and singleton.
Stateless bean kan implentera en webservice medans en stateful kan inte göra det.
En stateless sessionsböna behåller inget tillstånd mellan sig själv och klienten mellan anrop av olika metoder. Detta innebär att bönorna är delade mellan olika klienter, viket i sin tur betyder att man skall inte spara tillstånd i instansvariabler när man använder sig utav Statless EJB.

Bygg ngt enkelt exempel som visar upp de olika sorternas bönorna

Vad är "session"?
Mängd program,inställningar och resurser som visas på skrivbordet. Gör att en användarsession kan sparas och återställas.
En användare kan logga in i systemet och ta del av samma program, inställningar och resurser som fanns när användaren loggade ut.

Projekt här
****************************************
package server;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Bean
 */
@Stateless
@LocalBean
public class Bean {

    /**
     * Default constructor. 
     */
    public Bean() {
        // TODO Auto-generated constructor stub
    }
    
    public String sayHello(String name){
    	return "Hello " + name;
    }

}
*********************************************
package server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @EJB  Bean bean;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		out.print("<html><body>");
		out.print("<h1>Request served at: " + request.getServletPath() +"</h1>");
		out.println("<h2>" + bean.sayHello("SJK")+ "</h2>");
		out.print("<html><body>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
***************************************************
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Hello everyone</h1>


</body>
</html>
*********************************************

