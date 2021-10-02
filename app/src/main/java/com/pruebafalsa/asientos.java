package com.pruebafalsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class asientos extends AppCompatActivity {
    TextView total;
    CheckBox a;
    CheckBox b;
    CheckBox c;
    CheckBox d;
    CheckBox e;
    CheckBox f;
    CheckBox g;
    CheckBox h;
    CheckBox i;
    CheckBox j;
    CheckBox k;
    CheckBox l;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asientos);
        total = (TextView) findViewById(R.id.txt_total);
        a = (CheckBox) findViewById(R.id.a);
        b = (CheckBox) findViewById(R.id.b);
        c = (CheckBox) findViewById(R.id.c);
        d = (CheckBox) findViewById(R.id.d);
        e = (CheckBox) findViewById(R.id.e);
        f = (CheckBox) findViewById(R.id.f);
        g = (CheckBox) findViewById(R.id.g);
        h = (CheckBox) findViewById(R.id.h);
        i = (CheckBox) findViewById(R.id.i);
        j = (CheckBox) findViewById(R.id.j);
        k = (CheckBox) findViewById(R.id.k);
        l = (CheckBox) findViewById(R.id.l);
        btn = (Button) findViewById(R.id.button);

        Bundle b = getIntent().getExtras();
        String origen = b.getString("SOrigen");
        String destino = b.getString("SDestino");
        Integer precio = b.getInt("SPrecio");

        total.setText(": "+precio);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalprecio;
                Integer Asiento=0,contador=0;
                if (a.isChecked()==true){
                    contador++;
                    totalprecio= precio + 300;
                    Intent I = new Intent(getApplicationContext(),fin.class);
                    I.putExtra("SuOrigen", origen);
                    I.putExtra("SuPrecio", totalprecio);
                    I.putExtra("SuDestino", destino);
                    I.putExtra("CONTADOR", contador);
                }
                if (c.isChecked()==true){
                    contador++;
                    totalprecio= precio + 300;
                    Intent I = new Intent(getApplicationContext(),fin.class);
                    I.putExtra("SuOrigen", origen);
                    I.putExtra("SuPrecio", totalprecio);
                    I.putExtra("SuDestino", destino);
                    I.putExtra("CONTADOR", contador);
                    startActivity(I);
                }
                if (d.isChecked()==true){
                    contador++;
                    totalprecio= precio + 300;
                    Intent I = new Intent(getApplicationContext(),fin.class);
                    I.putExtra("SuOrigen", origen);
                    I.putExtra("SuPrecio", totalprecio);
                    I.putExtra("SuDestino", destino);
                    I.putExtra("CONTADOR", contador);
                    startActivity(I);
                }
                if (e.isChecked()==true){
                    contador++;
                    totalprecio= precio + 300;
                    Intent I = new Intent(getApplicationContext(),fin.class);
                    I.putExtra("SuOrigen", origen);
                    I.putExtra("SuPrecio", totalprecio);
                    I.putExtra("SuDestino", destino);
                    I.putExtra("CONTADOR", contador);
                    startActivity(I);
                }
                if (f.isChecked()==true){
                    contador++;
                    totalprecio= precio + 300;
                    Intent I = new Intent(getApplicationContext(),fin.class);
                    I.putExtra("SuOrigen", origen);
                    I.putExtra("SuPrecio", totalprecio);
                    I.putExtra("SuDestino", destino);
                    startActivity(I);
                }
                if (g.isChecked()==true){
                    contador++;
                    totalprecio= precio + 300;
                    Intent I = new Intent(getApplicationContext(),fin.class);
                    I.putExtra("SuOrigen", origen);
                    I.putExtra("SuPrecio", totalprecio);
                    I.putExtra("SuDestino", destino);
                    I.putExtra("CONTADOR", contador);
                    startActivity(I);
                }
                if (h.isChecked()==true){
                    contador++;
                    totalprecio= precio + 300;
                    Intent I = new Intent(getApplicationContext(),fin.class);
                    I.putExtra("SuOrigen", origen);
                    I.putExtra("SuPrecio", totalprecio);
                    I.putExtra("SuDestino", destino);
                    I.putExtra("CONTADOR", contador);
                    startActivity(I);
                }
                if (i.isChecked()==true){
                    contador++;
                    totalprecio= precio + 300;
                    Intent I = new Intent(getApplicationContext(),fin.class);
                    I.putExtra("SuOrigen", origen);
                    I.putExtra("SuPrecio", totalprecio);
                    I.putExtra("SuDestino", destino);
                    I.putExtra("CONTADOR", contador);
                    startActivity(I);
                }
                if (j.isChecked()){
                    contador++;
                    totalprecio= precio + 300;
                    Intent I = new Intent(getApplicationContext(),fin.class);
                    I.putExtra("SuOrigen", origen);
                    I.putExtra("SuPrecio", totalprecio);
                    I.putExtra("SuDestino", destino);
                    startActivity(I);
                }
                if (k.isChecked()==true){
                    contador++;
                    totalprecio= precio + 300;
                    Intent I = new Intent(getApplicationContext(),fin.class);
                    I.putExtra("SuOrigen", origen);
                    I.putExtra("SuPrecio", totalprecio);
                    I.putExtra("SuDestino", destino);
                    I.putExtra("CONTADOR", contador);
                    startActivity(I);
                }
                if (l.isChecked()==true){
                    contador++;
                    totalprecio= precio + 300;
                    Intent I = new Intent(getApplicationContext(),fin.class);
                    I.putExtra("SuOrigen", origen);
                    I.putExtra("SuPrecio", totalprecio);
                    I.putExtra("SuDestino", destino);
                    I.putExtra("CONTADOR", contador);
                    startActivity(I);
                }
                }
        }) ;
    }
}