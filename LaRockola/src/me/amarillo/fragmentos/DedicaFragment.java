package me.amarillo.fragmentos;

import com.amarillo.larockola.R;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;


public class DedicaFragment extends Fragment {
	
	EditText etDedica;
	EditText etPara;
	EditText etCancion;
	EditText etArtista;
	Spinner spGenero;
	View viewDedicala;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater
				.inflate(R.layout.fragment_dedica, container, false);
		
		
		viewDedicala = rootView.findViewById(R.id.sw_dedicala);
		etDedica = (EditText) rootView.findViewById(R.id.et_dedicatoria);
		etPara = (EditText) rootView.findViewById(R.id.et_para);
		etCancion = (EditText) rootView.findViewById(R.id.et_cancion);
		etArtista = (EditText) rootView.findViewById(R.id.et_artista);
		spGenero = (Spinner) rootView.findViewById(R.id.sp_genero);
		
    	etDedica.setVisibility(View.INVISIBLE);  
    	etPara.setVisibility(View.INVISIBLE);
		
//		if(viewDedicala instanceof CheckBox) {
//			CheckBox cbDedicala = (CheckBox) viewDedicala;
			viewDedicala.setOnClickListener(new OnClickListener() {  // checkbox listener
			    @SuppressLint("NewApi")
				public void onClick(View v) {
			        // Perform action on clicks, depending on whether it's now checked
			    	if (v instanceof CheckBox) {
			    		CheckBox c = (CheckBox) v;
						if (c.isChecked()) {
				        	etDedica.setVisibility(View.VISIBLE);
				        	etPara.setVisibility(View.VISIBLE);
				        } else if (c.isChecked() == false) {
				        	etDedica.setVisibility(View.INVISIBLE); //gone=2  
				        	etPara.setVisibility(View.INVISIBLE);
				        }
					} else if(v instanceof Switch) {
						Switch s = (Switch) v;
						if (s.isChecked()) {
				        	etDedica.setVisibility(View.VISIBLE);
				        	etPara.setVisibility(View.VISIBLE);
				        } else if (s.isChecked() == false) {
				        	etDedica.setVisibility(View.INVISIBLE); //gone=2  
				        	etPara.setVisibility(View.INVISIBLE);
				        }
					}
			        
			    }
			});

			
//		} else if (viewDedicala instanceof Switch) {
//			Switch swDedicala = (Switch) viewDedicala;
//		} 
			
		
		return rootView;
	}

}
