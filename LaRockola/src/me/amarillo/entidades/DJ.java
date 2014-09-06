package me.amarillo.entidades;

import me.amarillo.utiles.AmarilloResponseHandler;
import android.util.Log;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.async.callback.BackendlessCallback;
import com.backendless.exceptions.BackendlessFault;
import com.backendless.persistence.BackendlessDataQuery;

public class DJ {
	
	long id;
	long idEstablecimiento;
	String usuario;
	String contrasena;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdEstablecimiento() {
		return idEstablecimiento;
	}
	public void setIdEstablecimiento(long idEstablecimiento) {
		this.idEstablecimiento = idEstablecimiento;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public void guardar() {
		Backendless.Persistence.save(this,
				new BackendlessCallback<DJ>() {
					@Override
					public void handleResponse(DJ oQuestion) {
						Log.i("", DJ.class.getSimpleName()
								+ " creada " + oQuestion.toString());
					}
				});

	}

	public static void obtener(int id, final AmarilloResponseHandler response) {
		String whereClause = "id = " + id;
		BackendlessDataQuery dataQuery = new BackendlessDataQuery();
		dataQuery.setWhereClause(whereClause);
		Backendless.Persistence.of(DJ.class).find(dataQuery,
				new AsyncCallback<BackendlessCollection<DJ>>() {

			@Override
			public void handleFault(BackendlessFault arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void handleResponse(
					BackendlessCollection<DJ> respuesta) {
				response.callbackDJs(respuesta.getData());
			}
		});
	}
}
