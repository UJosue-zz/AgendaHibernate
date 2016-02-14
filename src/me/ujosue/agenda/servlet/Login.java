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


public class Login extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		RequestDispatcher despachador = null;
		List<Object> usuarios = Conexion.getInstancia().autenticar(req.getParameter("txtUsuario"), Encriptar.getInstancia().getMD5(req.getParameter("txtContrasena")));
		if(usuarios!=null && usuarios.size()>0){
			HttpSession sesion = req.getSession(true);
			sesion.setAttribute("usuario", (Usuario)usuarios.get(0));
			despachador=req.getRequestDispatcher("agenda/inicio.jsp");
			System.out.println("Sesion iniciada");
		}else{
			req.setAttribute("error", "verifica tus credenciales");
			despachador=req.getRequestDispatcher("index.jsp");
			System.out.println("Sesion no iniciada");
		}
		despachador.forward(req, resp);
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		doPost(req, resp);
	}
}