package com.majov.brainsduel.interfaz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.majov.brainsduel.R;
import com.majov.brainsduel.mundo.ThreadIniciarSesion;
import com.majov.brainsduel.mundo.ThreadRegistrar;

/**
 * Created by majoc on 12/12/2017.
 */

public class InicioActivity extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        //Relaciona la clase con el layout.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        setTitle("Inicio");
    }

    //Cuando se hace click en el botón Iniciar Sesión.
    public void iniciarSesion(View v)
    {
        //Se va a la página de iniciar sesión.
        Intent intent = new Intent(this, IniciarSesionActivity.class);
        startActivity(intent);
        finish();
    }

    //Cuando se hace click en el botón Registrar.
    public void registrar(View v)
    {
        //Se va a la página de registrar.
        Intent intent = new Intent(this, RegistrarActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
