package me.amarillo.rockola;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class IngresoCodigo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ingreso_codigo);
	}

	

	
	public void ingresarAEstablecimiento(View v)
	{
		EditText tvCodigo = (EditText)findViewById(R.id.etCodigo);
		Intent principal = new Intent(this, Principal.class);
		startActivity(principal);
	}
	

}
