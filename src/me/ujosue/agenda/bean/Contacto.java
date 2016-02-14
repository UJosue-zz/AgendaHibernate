package me.ujosue.agenda.bean;

public class Contacto {
	private Integer idContacto;
	private String nombre;
	private Integer telCasa;
	private Integer telMovil;
	private String correo;
	private String direccion;
	private Integer idUsuario;
	public Integer getIdContacto() {
		return idContacto;
	}
	public void setIdContacto(Integer idContacto) {
		this.idContacto = idContacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getTelCasa() {
		return telCasa;
	}
	public void setTelCasa(Integer telCasa) {
		this.telCasa = telCasa;
	}
	public Integer getTelMovil() {
		return telMovil;
	}
	public void setTelMovil(Integer telMovil) {
		this.telMovil = telMovil;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public Contacto(Integer idContacto,String nombre, Integer telCasa, Integer telMovil,
			String correo, String direccion, Integer idUsuario){
		super();
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.telCasa = telCasa;
		this.telMovil = telMovil;
		this.correo = correo;
		this.direccion = direccion;
		this.idUsuario = idUsuario;
	}
	
	public Contacto(){
		super();
	}
}
