package com.control22;

import android.os.Bundle;
import android.app.Activity;
import android.widget.RatingBar;
import android.widget.TextView;


public class SegundoActivity extends Activity {
	
	private TextView textNombre, textCorreo;
	private RatingBar resultRatingBar;
	String nombre,correo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segundo);
		
		
		textNombre = (TextView) findViewById(R.id.textNombre);
		textCorreo = (TextView) findViewById(R.id.textApellido);
		resultRatingBar = (RatingBar) findViewById(R.id.resultRatingBar);
		
		nombre = getIntent().getStringExtra("nombre");
		correo = getIntent().getStringExtra("correo");
		Float rating = getIntent().getFloatExtra("rating", 0);

		textNombre.setText(nombre);
		textCorreo.setText(correo);
		resultRatingBar.setRating(rating);
		
		
		
		
		
		
		
		
		
	}

	

}
