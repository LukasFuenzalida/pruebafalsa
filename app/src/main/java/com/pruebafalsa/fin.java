package com.pruebafalsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fin extends AppCompatActivity {
    TextView ori;
    TextView des;
    TextView tot;
    TextView asi;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin);
        ori = (TextView) findViewById(R.id.txt_ori);
        des = (TextView) findViewById(R.id.txt_des);
        tot = (TextView) findViewById(R.id.txt_tot);
        asi = (TextView) findViewById(R.id.txt_asien);
        btn2 = (Button) findViewById(R.id.button2);

        Bundle b = getIntent().getExtras();
        String origen = b.getString("SuOrigen");
        String destino = b.getString("SuDestino");
        Integer precio = b.getInt("SuPrecio");
        Integer contador= b.getInt("CONTADOR");

        ori.setText("Origen: "+origen);
        des.setText("Destino: "+destino);
        tot.setText("Total final: $"+precio);
        asi.setText("Seleccionados: " + contador);
    }
}