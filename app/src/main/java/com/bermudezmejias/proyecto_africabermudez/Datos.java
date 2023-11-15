package com.bermudezmejias.proyecto_africabermudez;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class Datos extends AppCompatActivity {

    //Declaración de las variables a utilizar
    public EditText inputedad;
    public Button comenzar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos);

        //Inizialización de las variables anteriores
        inputedad = findViewById(R.id.inputEdad);
        comenzar = findViewById(R.id.btnComenzar);

        //Al pulsar el botón comprueba si hay campos vacios y lo enseña mediante un toast, si no se ejecuta el método para ir al test
        comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputedad.getText().toString().trim().equalsIgnoreCase("")) {
                    Toast.makeText(Datos.this, "ERROR, hay campos vacíos.", Toast.LENGTH_SHORT).show();

                } else {
                    ir_a_test(comenzar);

                }
            }
        });


    }

    //Meºtodo que recoge los datos de la activity y manda a la actividad de test.
    public void ir_a_test(View view){

        Intent i = new Intent(Datos.this, Test.class);
        EditText edad = (EditText)findViewById(R.id.inputEdad);
        Spinner genero = (Spinner)findViewById(R.id.spinnerGenero);
        Spinner provincia = (Spinner)findViewById(R.id.spinnerProvincia);

        String n1 =edad.getText().toString();
        String g = genero.getSelectedItem().toString();
        String p = provincia.getSelectedItem().toString();

        i.putExtra("edad",n1);
        i.putExtra("genero", g);
        i.putExtra("provincia", p);

        startActivity(i);

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
