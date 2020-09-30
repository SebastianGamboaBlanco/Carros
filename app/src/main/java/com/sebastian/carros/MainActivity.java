package com.sebastian.carros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
   ArrayList<Carros> carros= new ArrayList<Carros>();
    Button agregar;
    EditText marca, modelo, placa;
    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agregar = findViewById(R.id.btnagregar);
        marca = findViewById(R.id.edtmarca);
        modelo = findViewById(R.id.edtmodelo);
        placa = findViewById(R.id.edtplaca);
        lista = findViewById(R.id.lstcarros);
       final AdaptadorCarros adaptadorCarros = new AdaptadorCarros(this,carros);
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!TextUtils.isEmpty(marca.getText()) || !TextUtils.isEmpty(modelo.getText()) || !TextUtils.isEmpty(placa.getText())){
                    Carros p = new Carros(marca.getText().toString(), modelo.getText().toString(), placa.getText().toString());
                    carros.add(p);
                    Toast.makeText(getApplicationContext(),"Carro agregado", Toast.LENGTH_LONG).show();
                    lista.setAdapter(adaptadorCarros);
                }else{
                    Toast.makeText(getApplicationContext(),"No pueden haber campos vacios", Toast.LENGTH_LONG).show();
                }



            }
        });
    }
}
