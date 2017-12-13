package com.majov.brainsduel.mundo;

/**
 * Created by majoc on 12/12/2017.
 */

class ThreadMostrarMensaje extends Thread
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Clase principal de la interfaz
     */
   // private InterfazBrainsDuel principal;

    /**
     * Parte 1 del mensaje
     */
    private String parte1;

    /**
     * Parte 2 del mensaje
     */
    private String parte2;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el nuevo hilo y lo deja listo para conectarse al servidor.
     * @param pDuelo Batalla actual. pBatalla != null.
     * //@param pPrincipal Ventana principal de la aplicación. pPrincipal != null.
     * @param pParte1 Parte 1 del mensaje
     * @param pParte2  Parte 2 del mensaje
     */
    public ThreadMostrarMensaje(Duelo pDuelo, String pParte1, String pParte2 )
    {
        //principal = pPrincipal;
        parte1 = pParte1;
        parte2 = pParte2;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicia la ejecución del hilo que verifica los cambios en el estado de juego.<br>
     */
    public void run( )
    {
        //principal.mostarMensaje( parte1, parte2 );
    }
}
