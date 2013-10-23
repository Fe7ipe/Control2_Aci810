package com.control22;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RatingBar;
import android.view.View;
import android.view.View.OnClickListener;


public class PrimerActivity extends Activity {
	
	private EditText EditNombre, EditCorreo;
	private Button miBoton;
	private RatingBar Barra;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_primer);
		
		EditNombre = (EditText) findViewById(R.id.Editnombre);
		EditCorreo = (EditText) findViewById(R.id.Editcorreo);
		miBoton = (Button) findViewById(R.id.Buttonenviar);
		Barra = (RatingBar) findViewById(R.id.RatingBar);
		
		miBoton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(PrimerActivity.this, SegundoActivity.class);
				i.putExtra("nombre", EditNombre.getText()+""); // +"" truco para pasar String //
				i.putExtra("correo", EditCorreo.getText()+"");
				i.putExtra("rating", Barra.getRating());
				startActivity(i);
				
			   }
		});	
		
}
}





