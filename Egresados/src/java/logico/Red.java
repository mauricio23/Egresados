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
public class Red {
    
    private String nombre;
    
    private int añoCreacion;
    
    private String director;
    
    private String correo;
    
     //-------------------------------------------------------------------------------------------
    //Constructor
    //-------------------------------------------------------------------------------------------
    
    public Red(String nNombre, int nAñoCreacion, String nDirector, String nCorreo)
    {
        nombre = nNombre;
        añoCreacion = nAñoCreacion;
        director = nDirector;
        correo = nCorreo;
    }
    
    //----------------------------------------------------------------------
    //GETTERS AND SETTERS
    //----------------------------------------------------------------------

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the añoCreacion
     */
    public int getAñoCreacion() {
        return añoCreacion;
    }

    /**
     * @param añoCreacion the añoCreacion to set
     */
    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
           
}
