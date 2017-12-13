package com.majov.brainsduel.mundo;

/**
 * Created by majoc on 12/12/2017.
 */

public class Pregunta
{
    /**
     * Categoría de la pregunta
     */
    private String categoria;

    /**
     * Texto de la pregunta
     */
    private String pregunta;

    /**
     * Opciones de la pregunta
     */
    private String[] opciones;

    /**
     * Respuesta del usuario a la pregunta
     */
    private String respuestaUsuario;

    /**
     * Construye una nueva pregunta
     * @param pCategoria Categoría
     * @param pPregunta Pregunta
     * @param pOpciones Opciones
     */
    public Pregunta( String pCategoria, String pPregunta, String[] pOpciones )
    {
        categoria = pCategoria;
        pregunta = pPregunta;
        opciones = pOpciones;
        respuestaUsuario = null;
    }

    /**
     * Retorna la categoría de la pregunta
     * @return Categoría de la pregunta
     */
    public String darCategoria( )
    {
        return categoria;
    }

    /**
     * Retorna el texto de la pregunta
     * @return Texto de la pregunta
     */
    public String darPregunta( )
    {
        return pregunta;
    }

    /**
     * Opciones de respuesta para la pregunta
     * @return Opciones de respuesta
     */
    public String[] darOpciones( )
    {
        return opciones;
    }

    /**
     * Respuesta del usuario
     * @return Respuesta del usuario
     */
    public String darRespuestaUsuario( )
    {
        return respuestaUsuario;
    }

    /**
     * Cambia la respuesta del usuario
     * @param pRespuesta Nueva respuesta
     */
    public void cambiarRespuesta( String pRespuesta )
    {
        respuestaUsuario = pRespuesta;
    }
}