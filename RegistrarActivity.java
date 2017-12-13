package com.majov.brainsduel.interfaz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.majov.brainsduel.R;
import com.majov.brainsduel.mundo.BrainsDuelException;
import com.majov.brainsduel.mundo.Duelo;

/**
 * Created by majoc on 12/12/2017.
 */

public class RegistrarActivity extends AppCompatActivity
{
    //Relación con el mundo.
    private Duelo duelo;

    protected void onCreate(Bundle savedInstanceState)
    {
        //Relaciona la clase con el layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        setTitle("Registrar");
    }

    public void registrar(View v)
    {
        //Cuadros de texto de la intefaz.
        EditText txtServidor = (EditText) findViewById(R.id.txtServidor);
        EditText txtPuerto = (EditText) findViewById(R.id.txtPuerto);
        EditText txtNombre = (EditText) findViewById(R.id.txtNombre);
        EditText txtApellido = (EditText) findViewById(R.id.txtApellido);
        EditText txtAlias = (EditText) findViewById(R.id.txtAlias);
        EditText txtContra = (EditText) findViewById(R.id.txtContra);
        EditText txtContraConfir = (EditText) findViewById(R.id.txtContraConfirm);

        //Saca la información de los cuadros de texto.
        String servidor = txtServidor.getText().toString();
        int puerto = Integer.parseInt(txtPuerto.getText().toString());
        String nombre = txtNombre.getText().toString();
        String apellido = txtApellido.getText().toString();
        String alias = txtAlias.getText().toString();
        String contra = txtContra.getText().toString();
        String confirmContra = txtContraConfir.getText().toString();

        //Puro java.
        if(puerto == 9999 && servidor != null && !servidor.equals("") && nombre != null && !nombre.equals("")&& alias != null && !alias.equals("")&& apellido != null && !apellido.equals("")&& contra != null && !contra.equals("") && confirmContra != null && !confirmContra.equals(""))
        {
            if(contra.equals(confirmContra))
            {
                try
                {
                    duelo = new Duelo();
                    duelo.registrar(servidor,puerto,alias,nombre,apellido,contra);
                }

                catch (BrainsDuelException e)
                {
                    //Mensajito
                    Snackbar.make(v, e.getMessage(), Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }

            else
            {
                //Mensajito
                Snackbar.make(v, "Las contraseñas no coinciden.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }

        else
        {
            //Mensajito
            Snackbar.make(v, "Los campos no pueden estar vacíos.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
    }

    //Se devuelve a la página anterior.
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
