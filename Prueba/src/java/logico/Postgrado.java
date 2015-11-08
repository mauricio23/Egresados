/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

/**
 *
 * @author Laura
 */
public class Postgrado {
    
    private String titulo;
    
    private int añoInicio;
    
    private int añoFin;
    
    private Institucion institucion;
    
    //-------------------------------------------------------------------------------------------
    //Constructor
    //-------------------------------------------------------------------------------------------
    
    public Postgrado (String nTitulo, int nAñoInicio, int nAñoFin, Institucion nInstitucion)
    {
        titulo = nTitulo;
        añoFin = nAñoFin;
        añoInicio = nAñoInicio;
        institucion = nInstitucion;
        
    }
    
    //----------------------------------------------------------------------
    //GETTERS AND SETTERS
    //----------------------------------------------------------------------

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the añoInicio
     */
    public int getAñoInicio() {
        return añoInicio;
    }

    /**
     * @param añoInicio the añoInicio to set
     */
    public void setAñoInicio(int añoInicio) {
        this.añoInicio = añoInicio;
    }

    /**
     * @return the añoFin
     */
    public int getAñoFin() {
        return añoFin;
    }

    /**
     * @param añoFin the añoFin to set
     */
    public void setAñoFin(int añoFin) {
        this.añoFin = añoFin;
    }

    /**
     * @return the institucion
     */
    public Institucion getInstitucion() {
        return institucion;
    }

    /**
     * @param institucion the institucion to set
     */
    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }
}
