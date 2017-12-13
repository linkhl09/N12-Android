package com.majov.brainsduel.mundo;

import java.io.IOException;

/**
 * Created by majoc on 12/12/2017.
 */

public class ThreadRegistrar extends Thread
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
     * Nombre que utilizará el jugador.
     */
    private String nombre;

    /**
     * Apellidos que utilizará el jugador.
     */
    private String apellidos;

    /**
     * Alias que utilizará el jugador.
     */
    private String alias;

    /**
     * Dirección para localizar al servidor.
     */
    private String servidor;

    /**
     * Puerto a través del cual se realizará la conexión con el servidor.
     */
    private int puerto;

    /**
     * Password del jugador.
     */
    private String password;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el nuevo hilo y lo deja listo para conectarse al servidor.
     * @param pBatalla Batalla actual. pBatalla != null.
     * @param pInterfaz Ventana principal de la aplicación. pInterfaz != null.
     * @param pNombreJugador Nombre que utilizará el jugador. pNombreJugador != null.
     * @param pApellidosJugador Apellidos que utilizará el jugador. pApellidosJugador != null.
     * @param pDireccionServidor Dirección para localizar al servidor. pDireccionServidor != null.
     * @param pPuertoServidor Puerto a través del cual se realizará la conexión con el servidor. pPuertoServidor != null.
     * @param pAlias Alias que utilizará el jugador. pAlias != null.
     * @param pPassword Contraseña que utilizará el jugador. pPassword != null && pPassword != "".
     */
    public ThreadRegistrar(Duelo pBatalla, String pDireccionServidor, int pPuertoServidor, String pAlias, String pNombreJugador, String pApellidosJugador, String pPassword )
    {
        duelo = pBatalla;
       // principal = pInterfaz;
        servidor = pDireccionServidor;
        puerto = pPuertoServidor;
        alias = pAlias;
        nombre = pNombreJugador;
        apellidos = pApellidosJugador;
        password = pPassword;
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
            duelo.registrar( servidor, puerto, alias, nombre, apellidos, password );
           // principal.actualizarInterfaz( );
            duelo.esperarJugada( );

        }
        catch( BrainsDuelException | IOException | InterruptedException e )
        {
           // principal.mostrarError( e );
        }

    }
}
