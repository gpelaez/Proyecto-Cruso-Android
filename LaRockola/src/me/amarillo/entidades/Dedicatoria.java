package me.amarillo.entidades;

import me.amarillo.utiles.AmarilloResponseHandler;
import android.util.Log;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.async.callback.BackendlessCallback;
import com.backendless.exceptions.BackendlessFault;
import com.backendless.persistence.BackendlessDataQuery;

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

	public void guardar() {
		Backendless.Persistence.save(this,
				new BackendlessCallback<Dedicatoria>() {
					@Override
					public void handleResponse(Dedicatoria oQuestion) {
						Log.i("", Dedicatoria.class.getSimpleName()
								+ " creada " + oQuestion.toString());
					}
				});

	}

	public static void obtener(int id, final AmarilloResponseHandler response) {
		String whereClause = "id = " + id;
		BackendlessDataQuery dataQuery = new BackendlessDataQuery();
		dataQuery.setWhereClause(whereClause);
		Backendless.Persistence.of(Dedicatoria.class).find(dataQuery,
				new AsyncCallback<BackendlessCollection<Dedicatoria>>() {

			@Override
			public void handleFault(BackendlessFault arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void handleResponse(
					BackendlessCollection<Dedicatoria> dedicatorias) {
				response.callbackDedicatorias(dedicatorias.getData());
			}
		});
	}
}
