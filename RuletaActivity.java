package com.majov.brainsduel.interfaz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.majov.brainsduel.R;
import com.majov.brainsduel.mundo.Duelo;

/**
 * Created by majoc on 12/12/2017.
 */

public class RuletaActivity extends AppCompatActivity
{
    private Duelo duelo;

    protected void onCreate(Bundle savedInstanceState)
    {
        //Relaciona la clase con el layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruleta);
        setTitle("Juego");
    }


}
