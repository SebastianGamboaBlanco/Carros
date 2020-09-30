package com.sebastian.carros;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptadorCarros extends ArrayAdapter<Carros>{

    private Context context;
    private ArrayList<Carros> carro;
    private LayoutInflater inflater;
    public AdaptadorCarros(@NonNull Context context, ArrayList<Carros> carro) {
        super(context,0,carro);
        this.context = context;
        this.carro = carro;
        inflater= LayoutInflater.from(context);
    }


    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Nullable
    @Override
    public Carros getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            convertView = inflater.inflate(R.layout.fila_carros,null);

        }
        Carros p = getItem(position);
        TextView modelo = convertView.findViewById(R.id.txtmodelo);
        TextView marca = convertView.findViewById(R.id.txtmarca);
        TextView placa = convertView.findViewById(R.id.txtplaca);
        modelo.setText(p.getModelo());
        marca.setText(p.getMarca());
        placa.setText(p.getPlaca());
        return convertView;
    }
}
