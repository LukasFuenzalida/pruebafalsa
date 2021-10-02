package com.pruebafalsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner origen;
    Spinner destino;
    Button btn;
    ArrayList<String> valores = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        origen = (Spinner) findViewById(R.id.sp_origen);
        destino = (Spinner) findViewById(R.id.sp_destino);
        btn = (Button) findViewById(R.id.button2);

        valores.add("...");
        valores.add("Talca");
        valores.add("Linares");
        valores.add("Cauquenes");
        valores.add("Teno");
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,valores);
        origen.setAdapter(adaptador);
        destino.setAdapter(adaptador);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(origen.getSelectedItem()=="..."){
                    Toast.makeText(getApplicationContext(), "Debe seleccionar un origen",Toast.LENGTH_LONG).show();
                 }
                if(destino.getSelectedItem()=="..."){
                    Toast.makeText(getApplicationContext(), "Debe seleccionar destino",Toast.LENGTH_LONG).show();
                }
                if(origen.getSelectedItem()==destino.getSelectedItem()){
                    Toast.makeText(getApplicationContext(), "Origen y destino iguales",Toast.LENGTH_LONG).show();
                }

                String or = origen.getSelectedItem().toString();
                String des = destino.getSelectedItem().toString();
                int precio;
                if(or.equals("Talca") & des.equals("Linares")){
                    precio = 2000;
                    Intent I = new Intent(getApplicationContext(),asientos.class);
                    I.putExtra("SOrigen", or);
                    I.putExtra("SPrecio", precio);
                    I.putExtra("SDestino", des);
                    startActivity(I);
                }
                if(or.equals("Talca") & des.equals("Cauquenes")){
                    precio = 4000;
                    Intent I = new Intent(getApplicationContext(),asientos.class);
                    I.putExtra("SOrigen", or);
                    I.putExtra("SPrecio", precio);
                    I.putExtra("SDestino", des);
                    startActivity(I);
                }
                if(or.equals("Talca") & des.equals("Teno")){
                    precio = 5000;
                    Intent I = new Intent(getApplicationContext(),asientos.class);
                    I.putExtra("SOrigen", or);
                    I.putExtra("SPrecio", precio);
                    I.putExtra("SDestino", des);
                    startActivity(I);
                }

            if(or.equals("Linares") & des.equals("Talca")){
                precio = 2000;
                Intent I = new Intent(getApplicationContext(),asientos.class);
                I.putExtra("SOrigen", or);
                I.putExtra("SPrecio", precio);
                I.putExtra("SDestino", des);
                startActivity(I);
            }
                if(or.equals("Linares") & des.equals("Cauquenes")){
                precio = 3000;
                Intent I = new Intent(getApplicationContext(),asientos.class);
                I.putExtra("SOrigen", or);
                I.putExtra("SPrecio", precio);
                I.putExtra("SDestino", des);
                startActivity(I);
            }
                if(or.equals("Linares") & des.equals("Teno")){
                precio = 4000;
                Intent I = new Intent(getApplicationContext(),asientos.class);
                I.putExtra("SOrigen", or);
                I.putExtra("SPrecio", precio);
                I.putExtra("SDestino", des);
                startActivity(I);
            }
                if(or.equals("Cauquenes") & des.equals("Talca")){
                    precio = 4000;
                    Intent I = new Intent(getApplicationContext(),asientos.class);
                    I.putExtra("SOrigen", or);
                    I.putExtra("SPrecio", precio);
                    I.putExtra("SDestino", des);
                    startActivity(I);
                }
                if(or.equals("Cauquenes") & des.equals("Linares")){
                    precio = 3000;
                    Intent I = new Intent(getApplicationContext(),asientos.class);
                    I.putExtra("SOrigen", or);
                    I.putExtra("SPrecio", precio);
                    I.putExtra("SDestino", des);
                    startActivity(I);
                }
                if(or.equals("Cauquenes") & des.equals("Teno")){
                    precio = 3000;
                    Intent I = new Intent(getApplicationContext(),asientos.class);
                    I.putExtra("SOrigen", or);
                    I.putExtra("SPrecio", precio);
                    I.putExtra("SDestino", des);
                    startActivity(I);
                }
                if(or.equals("Teno") & des.equals("Talca")){
                    precio = 5000;
                    Intent I = new Intent(getApplicationContext(),asientos.class);
                    I.putExtra("SOrigen", or);
                    I.putExtra("SPrecio", precio);
                    I.putExtra("SDestino", des);
                    startActivity(I);
                }
                if(or.equals("Teno") & des.equals("Linares")){
                    precio = 4000;
                    Intent I = new Intent(getApplicationContext(),asientos.class);
                    I.putExtra("SOrigen", or);
                    I.putExtra("SPrecio", precio);
                    I.putExtra("SDestino", des);
                    startActivity(I);
                }
                if(or.equals("Teno") & des.equals("Cauquenes")){
                    precio = 3000;
                    Intent I = new Intent(getApplicationContext(),asientos.class);
                    I.putExtra("SOrigen", or);
                    I.putExtra("SPrecio", precio);
                    I.putExtra("SDestino", des);
                    startActivity(I);
                }
        }
        }) ;
    }
}