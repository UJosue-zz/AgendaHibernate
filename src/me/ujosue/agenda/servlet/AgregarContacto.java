package me.ujosue.agenda.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import me.ujosue.agenda.bean.Contacto;
import me.ujosue.agenda.bean.Usuario;
import me.ujosue.agenda.db.Conexion;

public class AgregarContacto extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		HttpSession sesion= (HttpSession) req.getSession();
		Usuario user = (Usuario) sesion.getAttribute("usuario");
		Contacto nuevoContacto = new Contacto(0,
				req.getParameter("txtNombre"),
				Integer.parseInt(req.getParameter("txtTelCasa")),
				Integer.parseInt(req.getParameter("txtTelMovil")),
				req.getParameter("txtCorreo"),
				req.getParameter("txtDireccion"),
				user
				);	
		Conexion.getInstancia().agregar(nuevoContacto);
		
		RequestDispatcher despachador=null;
		despachador=req.getRequestDispatcher("agenda/inicio.jsp");
		despachador.forward(req, res);
}
public void doGet(HttpServletRequest req, 
		HttpServletResponse res)throws IOException,ServletException{
	doPost(req,res);
}
}
