<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Agenda</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main-two.css" />
</head>
<body>
	<!-- Page Wrapper -->
			<div id="page-wrapper">
			
				<!-- Header -->
					<header id="header">
						<h1><a href="index.html">Agenda</a></h1>
						<nav>
							<a href="#menu">Menu</a>
						</nav>
					</header>

				<!-- Menu -->
					<nav id="menu">
						<div class="inner">
							<h2>Menu</h2>
							<ul class="links">
								<li><a action="#">Contactos</a></li>
								<li><a href="#">Agregar Contacto</a></li>
								<li><a href="#">Configuración</a></li>
								<li><a href="CerrarSesion.do">Sign Out</a></li>
							</ul>
							<a href="#" class="close">Close</a>
						</div>
					</nav>

				<!-- Wrapper -->
					<section id="wrapper">
						<header>
							<div class="inner">
								<h2>Contactos</h2>
								<p>Todos tus amigos en un sólo lugar</p>
							</div>
						</header>

						<!-- Content -->
							<div class="wrapper">
								<div class="inner">
									<section>
										<h3 class="major" id="EditarContacto">Editar Contacto</h3>
										<form action="EditarContacto.do" method="post">
											<div class="row uniform">
												<div class="6u 12u$(xsmall)">
													<label>Nombre</label>
													<input type="text" required name="txtNombre" value="${contacto.getNombre()}"/>
												</div>
												<div class="6u$ 12u$(xsmall)">
													<label>Correo</label>
													<input type="email" name="txtCorreo" value="${contacto.getCorreo()}"/>
												</div>
												<div class="6u 12u$(xsmall)">
													<label>Teléfono de Casa</label>
													<input type="text" name="txtTelCasa" value="${contacto.getTelCasa()}"/>
												</div>
												<div class="6u$ 12u$(xsmall)">
													<label>Teléfono Móvil</label>
													<input type="text" name="txtTelMovil" value="${contacto.getTelMovil()}"/>
												</div>
												<div class="12u$">
													<label>Direccion</label>
													<input type="text" name="txtDireccion" value="${contacto.getDireccion()}"/>
												</div>
												<div class="12u$">
													<input type="hidden" name="txtIdContacto" value="${contacto.getIdContacto()}"/>
												</div>
												<div class="12u$">
													<ul class="actions">
														<li><input type="submit" value="Actualizar" class="special" /></li>
													</ul>
												</div>
											</div>
										</form>
									</section>
								</div>
							</div>

					</section>

				<!-- Footer -->
					<section id="footer">
						<div class="inner">
							<ul class="copyright">
								<li>&copy; UJosue. All rights reserved.</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
							</ul>
						</div>
					</section>

			</div>

		<!-- Scripts -->
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main-two.js"></script>

</body>
</html>