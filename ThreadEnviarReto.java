package com.majov.brainsduel.mundo;

/**
 * Created by majoc on 12/12/2017.
 */

public class ThreadEnviarReto extends Thread
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Duelo actual
     */
    private Duelo duelo;


    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el nuevo hilo y lo deja listo para conectarse al servidor.
     * @param pDuelo Batalla actual. pBatalla != null.
     */
    public ThreadEnviarReto( Duelo pDuelo )
    {
        duelo = pDuelo;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicia la ejecución del hilo que verifica los cambios en el estado de juego.<br>
     */
    public void run( )
    {
        duelo.enviarMensajeReto();

    }
}
