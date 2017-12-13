package com.majov.brainsduel.interfaz;

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

public class IniciarSesionActivity extends AppCompatActivity
{
    private Duelo duelo;

    protected void onCreate(Bundle savedInstanceState)
    {
        //Relaciona la clase con el layout.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
        setTitle("IniciarSesión");
    }

    public void iniciarSesion(View v)
    {
        //Guarda los cuadros de texto del layout.
        EditText txtServidor = (EditText) findViewById(R.id.txtServidor);
        EditText txtPuerto = (EditText) findViewById(R.id.txtPuerto);
        EditText txtAlias = (EditText) findViewById(R.id.txtAlias);
        EditText txtContra = (EditText) findViewById(R.id.txtContrasenia);

        //Saca la información de los cuadros de texto.
        String servidor = txtServidor.getText().toString();
        int puerto = Integer.parseInt(txtPuerto.getText().toString());
        String alias = txtAlias.getText().toString();
        String contra = txtContra.getText().toString();

        //Esto es puro java, sino entiendes paila xD
        if(servidor != null && !servidor.equals("") && puerto == 9999 && alias != null && !alias.equals("")&& contra != null && !contra.equals(""))
        {
            try
            {
                duelo = new Duelo();
                duelo.iniciarSesion(servidor,puerto,alias,contra);
            }
            catch (BrainsDuelException e)
            {
                //Mensajito de la parte de abajo
                Snackbar.make(v, e.getMessage(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }

        else
        {
            //Mensajito de la parte de abajo
            Snackbar.make(v, "Los campos no pueden estar vacíos.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }


    }

    //Método que se devuelve.
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
