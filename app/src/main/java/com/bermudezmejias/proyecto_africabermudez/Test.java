package com.bermudezmejias.proyecto_africabermudez;

import android.content.Intent;
import android.os.Bundle;
//import android.support.v4.app.FragmentPagerAdapter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Test  extends AppCompatActivity implements botoncito{

    //Esta clase implementa una interfaz del boton de los fragments

    //Variables a utilizar
    String n1;
    String genero;
    String provincia;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        //Se recogen los datos obtenidos de la clase de Datos mediante un bundle y su key
        Bundle datos = getIntent().getExtras();
        n1 = datos.getString("edad");
        genero = datos.getString("genero");
        provincia = datos.getString("provincia");

    }


    /*
    * Método que dependiendo del boton pulsado en los fragments se hace visible/invisible un fragmento u otro
    * @Param Button
    * En el ultimo boton se vuelve a recoger los datos obtenidos en el onCreate y para pasarlos a la pantalla de confirmación
    * */
    @Override
    public void test(Button boton){

        if(boton.getId()==R.id.volver2){
            View p1 = findViewById(R.id.fragmentContainerView1);
            p1.setVisibility(View.VISIBLE);
            View p2 = findViewById(R.id.fragmentContainerView2);
            p2.setVisibility(View.INVISIBLE);
        }
        if(boton.getId()==R.id.volver3){
            View p2 = findViewById(R.id.fragmentContainerView2);
            p2.setVisibility(View.VISIBLE);
            View p3 = findViewById(R.id.fragmentContainerView3);
            p3.setVisibility(View.INVISIBLE);
        }
        if(boton.getId()==R.id.volver4){
            View p3 = findViewById(R.id.fragmentContainerView3);
            p3.setVisibility(View.VISIBLE);
            View p4 = findViewById(R.id.fragmentContainerView4);
            p4.setVisibility(View.INVISIBLE);
        }
        if(boton.getId()==R.id.volver5){
            View p4 = findViewById(R.id.fragmentContainerView4);
            p4.setVisibility(View.VISIBLE);
            View p5 = findViewById(R.id.fragmentContainerView5);
            p5.setVisibility(View.INVISIBLE);
        }
        if(boton.getId()==R.id.volver6){
            View p5 = findViewById(R.id.fragmentContainerView5);
            p5.setVisibility(View.VISIBLE);
            View p6 = findViewById(R.id.fragmentContainerView6);
            p6.setVisibility(View.INVISIBLE);
        }
        if(boton.getId()==R.id.volver7){
            View p6 = findViewById(R.id.fragmentContainerView6);
            p6.setVisibility(View.VISIBLE);
            View p7 = findViewById(R.id.fragmentContainerView7);
            p7.setVisibility(View.INVISIBLE);
        }
        if(boton.getId()==R.id.volver8){
            View p7 = findViewById(R.id.fragmentContainerView7);
            p7.setVisibility(View.VISIBLE);
            View p8 = findViewById(R.id.fragmentContainerView8);
            p8.setVisibility(View.INVISIBLE);
        }



        if(boton.getId()==R.id.btnsp1){
            View p1 = findViewById(R.id.fragmentContainerView1);
            p1.setVisibility(View.INVISIBLE);
            View p2 = findViewById(R.id.fragmentContainerView2);
            p2.setVisibility(View.VISIBLE);
        }
        if(boton.getId()==R.id.btnsp2){
            View p2 = findViewById(R.id.fragmentContainerView2);
            p2.setVisibility(View.INVISIBLE);
            View p3 = findViewById(R.id.fragmentContainerView3);
            p3.setVisibility(View.VISIBLE);
        }
        if(boton.getId()==R.id.btnsp3){
            View p3 = findViewById(R.id.fragmentContainerView3);
            p3.setVisibility(View.INVISIBLE);
            View p4 = findViewById(R.id.fragmentContainerView4);
            p4.setVisibility(View.VISIBLE);
        }
        if(boton.getId()==R.id.btnsp4){
            View p4 = findViewById(R.id.fragmentContainerView4);
            p4.setVisibility(View.INVISIBLE);
            View p5 = findViewById(R.id.fragmentContainerView5);
            p5.setVisibility(View.VISIBLE);
        }
        if(boton.getId()==R.id.btnsp5){
            View p5 = findViewById(R.id.fragmentContainerView5);
            p5.setVisibility(View.INVISIBLE);
            View p6 = findViewById(R.id.fragmentContainerView6);
            p6.setVisibility(View.VISIBLE);
        }
        if(boton.getId()==R.id.btnsp6){
            View p6 = findViewById(R.id.fragmentContainerView6);
            p6.setVisibility(View.INVISIBLE);
            View p7 = findViewById(R.id.fragmentContainerView7);
            p7.setVisibility(View.VISIBLE);
        }
        if(boton.getId()==R.id.btnsp7){
            View p7 = findViewById(R.id.fragmentContainerView7);
            p7.setVisibility(View.INVISIBLE);
            View p8 = findViewById(R.id.fragmentContainerView8);
            p8.setVisibility(View.VISIBLE);
        }
        if(boton.getId()==R.id.btnsp8){
            View p8 = findViewById(R.id.fragmentContainerView8);
            p8.setVisibility(View.INVISIBLE);
            //Intent para cambiar de activity
            Intent i = new Intent(Test.this,Confirmacion.class);

            String uno = n1;
            String dos = genero;
            String tres = provincia;

            i.putExtra("edad",uno);
            i.putExtra("genero", dos);
            i.putExtra("provincia",tres);
            startActivity(i);
        }
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
