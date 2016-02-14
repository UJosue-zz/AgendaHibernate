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

public class CargarContacto extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
	RequestDispatcher despachador=null;
	Integer idContacto = new Integer(req.getParameter("idContacto"));
	Contacto contacto = (Contacto) Conexion.getInstancia().buscar(Contacto.class, idContacto);
	req.setAttribute("contacto", contacto);
	HttpSession sesion= (HttpSession) req.getSession();
	sesion.setAttribute("contacto", contacto);
	System.out.println("Se encontro el contacto " + idContacto);
	despachador=req.getRequestDispatcher("agenda/editar.jsp");
	despachador.forward(req, res);
}
public void doGet(HttpServletRequest req, 
		HttpServletResponse res)throws IOException,ServletException{
	doPost(req,res);
}
}