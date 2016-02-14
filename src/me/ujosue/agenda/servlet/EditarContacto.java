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


public class EditarContacto extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		RequestDispatcher despachador=null;
		HttpSession sesion= (HttpSession) req.getSession();
		Usuario user = (Usuario) sesion.getAttribute("usuario");
		Integer telCasa;
		try{
			telCasa = new Integer(req.getParameter("txtTelCasa"));
		} catch (NumberFormatException e){
			telCasa = 0;
		}
		Integer telMovil;
		try{
			telMovil = new Integer(req.getParameter("txtTelMovil"));					
		} catch (NumberFormatException e){
			telMovil = 0;
		}
		Contacto contacto = (Contacto) sesion.getAttribute("contacto");		
		contacto.setNombre(req.getParameter("txtNombre"));
		contacto.setTelCasa(telCasa);
		contacto.setTelMovil(telMovil);
		contacto.setCorreo(req.getParameter("txtCorreo"));
		contacto.setDireccion(req.getParameter("txtDireccion"));
		sesion.removeAttribute("contacto");
		Conexion.getInstancia().editar(contacto);
		req.setAttribute("listaContacto", Conexion.getInstancia().listar("FROM Contacto c where c.idUsuario='"+user.getIdUsuario()+"'"));
		despachador=req.getRequestDispatcher("agenda/inicio.jsp");
		despachador.forward(req, res);
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		doPost(req,res);
	}
}
