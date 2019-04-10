package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnnotationServlet
 */
@WebServlet("/AnnotationServlet")
public class AnnotationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnnotationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("user_password");
		
		String correctPassword = "CapasPassword";
		String correctUsername = "NCapas";
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>");
		if(username == "") {
			out.println("Credenciales inválidas. Usuario no puede ir vacío");
		}else if(password == "") {
			out.println("Credenciales inválidas. Contraseña no puede ir vacía");
		}else if(username == "" && password == "") {
			out.println("Credenciales inválidas. Los campos no pueden ir vacíos");
		}
		
		if(username.equals(correctUsername) && password.equals(correctPassword)) {
			out.println("Credenciales correctas.");
		}else {
			out.println("Credenciales incorrectas.");
		}
		out.println("</h3>");
		out.println("</body>");
		out.println("</html>");
		
		doGet(request, response);
	}

}
