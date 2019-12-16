package com.ipartek.formacion.supermercado.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ipartek.formacion.supermercado.modelo.pojo.Alerta;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final String USUARIO = "admin";
	private static final String PASS = "admin";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Pillar parámetros
		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("pass");

		String view = "login.jsp";

		try {
			if (USUARIO.equals(nombre) && PASS.equals(pass)) {

				HttpSession session = request.getSession();
				session.setAttribute("usuarioLogeado", nombre);
				session.setMaxInactiveInterval(60 * 3);

				view = "seguridad/index.jsp";

			}

			else {
				request.setAttribute("mensajeAlerta", new Alerta(Alerta.TIPO_DANGER, "Credenciales Incorrectas"));
				view = "login.jsp";
			}

		} catch (Exception e) {
			// TODO: log de trazas
			e.printStackTrace();
		} finally {

			request.getRequestDispatcher(view).forward(request, response);

		}

	}

}
