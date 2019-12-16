package com.ipartek.formacion.supermercado.controller.seguridad;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.supermercado.modelo.dao.ProductoDAO;

/**
 * Servlet implementation class ProductosController
 */
@WebServlet("/seguridad/productos")
public class ProductosController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String VIEW_TABLA = "productos/index.jsp";
	private static final String VIEW_FORM = "formulario.jsp";
	private static ProductoDAO dao;

	// Acciones
	public final static String ACCION_LISTAR = "listar";
	public final static String ACCION_IR_FORMULARIO = "formulario";
	public final static String ACCION_GUARDAR = "guardar";
	public final static String ACCION_ELIMINAR = "eliminar";

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		dao = ProductoDAO.getInstance();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);
	}

	private void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Recoger parámetros
		String pAccion = request.getParameter("accion");

		String pId = request.getParameter("id");
		String pNombre = request.getParameter("nombre");
		String pPrecio = request.getParameter("precio");
		String pImagen = request.getParameter("imagen");
		String pDescripcion = request.getParameter("descipcion");
		String pDescuento = request.getParameter("decuento");

		try {

			request.setAttribute("productos", dao.getAll());
		} catch (Exception e) {
			// TODO: LOG
			e.printStackTrace();
		} finally {

			request.getRequestDispatcher(request.getContextPath() + "/" + VIEW_TABLA).forward(request, response);
		}
	}

}
