package com.majov.brainsduel.mundo;

/**
 * Created by majoc on 12/12/2017.
 */

public class ThreadIniciarSesion extends Thread
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Referencia a la batalla.
     */
    private Duelo duelo;

    /**
     * Ventana principal de la aplicación
     */
    //private InterfazBrainsDuel principal;

    /**
     * Alias que utilizará el jugador.
     */
    private String alias;

    /**
     * Password del jugador.
     */
    private String password;

    /**
     * Dirección para localizar al servidor.
     */
    private String servidor;

    /**
     * Puerto a través del cual se realizará la conexión con el servidor.
     */
    private int puerto;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el nuevo hilo y lo deja listo para conectarse al servidor.
     * @param pBatalla Batalla actual. pBatalla != null.
     * @param pDireccionServidor Dirección para localizar al servidor. pDireccionServidor != null.
     * @param pPuertoServidor Puerto a través del cual se realizará la conexión con el servidor. pPuertoServidor != null && pPuertoServidor != "".
     * @param pAlias Alias que utilizará el jugador. pAlias != null && pAlias != "".
     * @param pPassword Contraseña que utilizará el jugador. pPassword != null && pPassword != "".
     */
    public ThreadIniciarSesion(Duelo pBatalla,  String pDireccionServidor, int pPuertoServidor, String pAlias, String pPassword )
    {
        duelo = pBatalla;
        password = pPassword;
        //principal = pInterfaz;
        servidor = pDireccionServidor;
        puerto = pPuertoServidor;
        alias = pAlias;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicia la ejecución del hilo que realiza la conexión con el servidor, dispara la selección de los pokémon e incializa la batalla.<br>
     * Cuando se tiene la conexión y la información de la batalla entonces se actualiza la interfaz.
     */
    public void run( )
    {
        try
        {
            duelo.iniciarSesion( servidor, puerto, alias, password );
           // principal.actualizarInterfaz( );
            duelo.esperarJugada( );

        }
        catch( Exception e )
        {
           // principal.mostrarError( e );
        }

    }
}
