package com.majov.brainsduel.mundo;

/**
 * Created by majoc on 12/12/2017.
 */

public class ThreadEsperarJugada extends Thread
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Referencia a la batalla.
     */
    private Duelo duelo;

    /**
     * Ventana principal de la aplicación.
     */
    //private InterfazBrainsDuel principal;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el nuevo hilo y lo deja listo para esperar la jugada.
     * @param pBatalla Referencia de la batalla. pBatalla != null.
     * @param //pInterfaz Ventana principal de la aplicación. pInterfaz != null
     */
    public ThreadEsperarJugada(Duelo pBatalla)
    {
        super( );
        duelo = pBatalla;
       // principal = pInterfaz;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicia la ejecución del hilo que espera la jugada del oponente. <br>
     * Cuando se tiene información sobre la jugada del oponente entonces se actualiza la interfaz.<br>
     * Si el juego debe terminar entonces muestra quién fue el ganador y termina el encuentro y la conexión al servidor.
     */
    public void run( )
    {
        try
        {
            duelo.esperarJugada( );
        }

        catch( Exception e )
        {
            //principal.mostrarError( e );
        }
    }
}
