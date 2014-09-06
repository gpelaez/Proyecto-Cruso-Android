package me.amarillo.utiles;

import java.util.List;

import me.amarillo.entidades.*;

public interface AmarilloResponseHandler {

	public void callbackDedicatorias(List<Dedicatoria> dedicatorias);

	public void callbackDJs(List<DJ> djs);

	public void callbackEstablecimientos(List<Establecimiento> establecimientos);
	
	public void callback(List<Object> objetos);

}
