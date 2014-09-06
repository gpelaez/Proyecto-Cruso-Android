package me.amarillo.rockola;

import java.util.List;

import me.amarillo.entidades.DJ;
import me.amarillo.entidades.Dedicatoria;
import me.amarillo.entidades.Establecimiento;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import me.amarillo.utiles.*;

public class MainActivity extends ActionBarActivity implements AmarilloResponseHandler{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Dedicatoria.obtener(1, this);
    }

	@Override
	public void callbackDedicatorias(List<Dedicatoria> dedicatorias) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callbackDJs(List<DJ> djs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callbackEstablecimientos(List<Establecimiento> establecimientos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callback(List<Object> objetos) {
		// TODO Auto-generated method stub
		
	}


   
}
