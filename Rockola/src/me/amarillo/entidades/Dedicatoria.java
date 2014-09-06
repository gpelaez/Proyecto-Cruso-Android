package me.amarillo.entidades;

public class Dedicatoria {

	long id;
	Establecimiento establecimiento;
	String cancion;
	String artista;
	String de;
	String para;
	String mensaje;	
	Boolean enCola;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Establecimiento getEstablecimiento() {
		return establecimiento;
	}

	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Boolean getEnCola() {
		return enCola;
	}

	public void setEnCola(Boolean enCola) {
		this.enCola = enCola;
	}
	
}
