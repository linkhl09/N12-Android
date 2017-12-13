package com.majov.brainsduel.mundo;

/**
 * Created by majoc on 12/12/2017.
 */

public class BrainsDuelException extends Exception
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante para la serialización.
     */
    private static final long serialVersionUID = 113229143589381951L;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye una nueva excepción de este tipo con el mensaje indicado.
     * @param pMensaje Mensaje que describe la causa de la excepción. pMensaje != null && pMensaje != "".
     */
    public BrainsDuelException( String pMensaje )
    {
        super( pMensaje );
    }
}
