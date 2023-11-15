package com.bermudezmejias.proyecto_africabermudez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*
    * Esta activity será la pantalla de bienvenida.
    * Implementa una Imagen, un texto y un botón.
    * */

    //Declaración del boton con el que se podrá acceder a la aplicación
    Button empezar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Oculta el ActionBar
        getSupportActionBar().hide();

        //Inicialización del boton
        empezar = findViewById(R.id.btnEmpezar);


    }

    //Metodo que con un Intent pasa de la activity actual a la clase Datos
    public void ir_a_datos(View view){
        Intent i = new Intent(this, Datos.class);
        startActivity(i);
    }


}