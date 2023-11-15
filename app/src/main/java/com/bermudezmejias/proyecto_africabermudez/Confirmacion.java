package com.bermudezmejias.proyecto_africabermudez;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Confirmacion  extends AppCompatActivity {

    //Boton utilizado parar volver a la primera activity
    Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmacion);

        //Se vuelven a recoger los datos con getIntent()
        String n1 = getIntent().getStringExtra("edad");
        String genero = getIntent().getStringExtra("genero");
        String provincia = getIntent().getStringExtra("provincia");


        //TextView en los que se enseñaran los datos
        TextView resultEdad = (TextView) findViewById(R.id.resultEdad);
        TextView resultGenero = (TextView) findViewById(R.id.resultGenero);
        TextView resultProvincia = (TextView) findViewById(R.id.resultProv);

        //Se ponen los resultados
        resultEdad.setText(n1);
        resultGenero.setText(genero);
        resultProvincia.setText(provincia);

        //Inicializacion del boton para volver
        volver = findViewById(R.id.repetir);

        //Acción que con un intent vuelve la pantalla principal
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Confirmacion.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

    /*Metodo que devuelve (enseña) el menú en el ActionBar
    @Param Menu
    @Return Menu
     */
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    /*Método que dependiendo de el item seleccionado manda a un activity u otra
      @Param MenuItem
      @Return Item seleccionado
     */
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.item1){
            Intent i = new Intent(this, AcercaDe.class);
            startActivity(i);
        }else if(id == R.id.item2){
            Intent i = new Intent(this, Ayuda.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
