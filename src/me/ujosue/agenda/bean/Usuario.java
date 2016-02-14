package me.ujosue.agenda.bean;

public class Usuario {
	private Integer idUsuario;
	private String nombre;
	private String correo;
	private String nick;
	private String contrasena;
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public Usuario(Integer idUsuario, String nombre, String correo, String nick,
			String contrasena){
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.correo = correo;
		this.nick = nick;
		this.contrasena = contrasena;
	}
	
	public Usuario(){
		super();
	}
}
