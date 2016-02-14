package me.ujosue.agenda.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import me.ujosue.agenda.bean.Usuario;
import me.ujosue.agenda.db.Conexion;
import me.ujosue.agenda.db.Encriptar;

public class Registrar extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	System.out.println("Registrando");
	RequestDispatcher despachador = null;
	Encriptar.getInstancia();
	Usuario usuario = new Usuario(
			null,
			req.getParameter("txtUsuario"),
			"N/D",
			req.getParameter("txtUsuario"),
			Encriptar.getMD5(req.getParameter("txtContrasena"))
			);
	Conexion.getInstancia().agregar(usuario);
	HttpSession sesion = req.getSession(true);
	sesion.setAttribute("usuario", usuario);
	despachador=req.getRequestDispatcher("agenda/inicio.jsp");
	despachador.forward(req, resp);
	System.out.println("Usuario agregado");
}
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	doPost(req, resp);
}
}
