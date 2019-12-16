<%@include file="includes/header.jsp"%>
<%@include file="includes/navigation.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

	<main class="container">

		<div class="row contenedor-productos">
	
		<c:forEach items="${productos}" var="product">
		
			<div class="col mb-5">

				<!-- producto -->
				<div class="producto">
					<span class="descuento">${product.decuento} %</span> 
					<img src="${product.imagen }"alt="imagen ${product.nombre }">

					<div class="body">
						<p>
							<span class="precio-descuento">
							<fmt:formatNumber type="currency" currencySymbol="€" maxFractionDigits="2" value="${product.precio}"></fmt:formatNumber>
							</span>
							<span class="precio-original">
							
							<fmt:formatNumber   currencySymbol="€"  value = "${product.precioDecuento }" type = "currency" maxFractionDigits = "2"
        /></span>
						</p>
						<p class="text-muted precio-unidad">( 
						<fmt:formatNumber   currencySymbol="€"  value = "${product.precioDecuento }" type = "currency" maxFractionDigits = "2"
        />
						/ unidad)</p>
						<p class="descripcion">${product.descripcion}</p>
					</div>

					<div class="botones">
						<button class="minus">-</button>
						<input type="text" value="1">
						<button class="plus">+</button>
					</div>

					<button class="carro">Añadir al carro</button>

				</div>
				<!-- /.producto -->
		
			</div>
		</c:forEach>

			


			

		</div>

	</main>
<%@include file="includes/footer.jsp"%>
	