<%@include file="includes/header.jsp"%>
<%@include file="includes/navigation.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<main>

	<div class="container  mt-5">

		<div class="row justify-content-center">
		
		<div class="col-lg-6 mt-5">
		
		<form action="login" method="post">

			<div class="form group my-3">
				<label for="nombre" class="control-label">Nombre</label> <input
					type="text" name="nombre" id="nombre" class="form-control" autofocus required>
			</div>
			
			<div class="form group mb-3">
				<label for="nombre" class="control-label">Contraseña</label> <input
					type="password" name="pass" id="pass" class="form-control" required>
			</div>
			
			<br />
			
			<div class="form group">
				<input type="submit" class="btn btn-primary btn-block" value="Login" />
			</div>


		</form>
		</div>
		
		
		</div>


		

	</div>

</main>


<%@include file="includes/footer.jsp"%>

