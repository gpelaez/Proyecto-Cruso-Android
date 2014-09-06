package me.amarillo.entidades;

import me.amarillo.utiles.AmarilloResponseHandler;
import android.util.Log;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.async.callback.BackendlessCallback;
import com.backendless.exceptions.BackendlessFault;
import com.backendless.persistence.BackendlessDataQuery;

public class Establecimiento {
	
	public static int DISCOTECA = 1;
	public static int BAR = 2;
	public static int RESTAURANTE = 3;
	
	long id;
	String nombre;
	String Direccion;
	String Telefono;
	int tipo;
	double latitud;
	double longitud;
	String codigo;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void guardar() {
		Backendless.Persistence.save(this,
				new BackendlessCallback<Establecimiento>() {
					@Override
					public void handleResponse(Establecimiento oQuestion) {
						Log.i("", Establecimiento.class.getSimpleName()
								+ " creada " + oQuestion.toString());
					}
				});

	}

	public static void obtener(int id, final AmarilloResponseHandler response) {
		String whereClause = "id = " + id;
		BackendlessDataQuery dataQuery = new BackendlessDataQuery();
		dataQuery.setWhereClause(whereClause);
		Backendless.Persistence.of(Establecimiento.class).find(dataQuery,
				new AsyncCallback<BackendlessCollection<Establecimiento>>() {

			@Override
			public void handleFault(BackendlessFault arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void handleResponse(
					BackendlessCollection<Establecimiento> respuesta) {
				response.callbackEstablecimientos(respuesta.getData());
			}
		});
	}
	
}
