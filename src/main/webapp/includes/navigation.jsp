<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<nav class="site-header sticky-top py-1 mb-5">
	<div
		class="container d-flex flex-column flex-md-row justify-content-between">
		<a class="py-2" href="inicio"> <svg
				xmlns="http://www.w3.org/2000/svg" width="24" height="24"
				fill="none" stroke="currentColor" stroke-linecap="round"
				stroke-linejoin="round" stroke-width="2" class="d-block mx-auto"
				role="img" viewBox="0 0 24 24" focusable="false">
					<title>Product</title><circle cx="12" cy="12" r="10" />
					<path
					d="M14.31 8l5.74 9.94M9.69 8h11.48M7.38 12l5.74-9.94M9.69 16L3.95 6.06M14.31 16H2.83m13.79-4l-5.74 9.94" /></svg>


			<c:if test="${empty usuarioLogeado}"></a> <a
			class="py-2 d-none d-md-inline-block" href="login.jsp">Login</a>
		</c:if>


		<c:if test="${not empty usuarioLogeado}"></c:if>
		<a class="py-2 d-none d-md-inline-block"
			href="seguridad/productos?accion=listar">Tabla</a> <a
			class="py-2 d-none d-md-inline-block"
			href="seguridad/productos?accion=formulariol">Formulario</a> <a
			class="py-2 d-none d-md-inline-block" href="logout">Cerrar
			sesión</a>

	</div>
</nav>

<c:if test="${not empty mensajeAlerta }">

	<div
		class="text-center alert alert-${mensajeAlerta.tipo } alert-dismissible fade show"
		role="alert">
		${mensajeAlerta.texto}
		<button type="button" class="close" data-dismiss="alert"
			aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
	</div>


</c:if>

