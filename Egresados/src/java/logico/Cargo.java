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
public class Cargo {
    
    private String nombre;
    
    private String funciones;
    
    //-------------------------------------------------------------------------------------------
    //Constructor
    //-------------------------------------------------------------------------------------------
    
    public Cargo (String nNombre, String nFunciones)
    {
        nombre = nNombre;
        funciones = nFunciones;
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
     * @return the funciones
     */
    public String getFunciones() {
        return funciones;
    }

    /**
     * @param funciones the funciones to set
     */
    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }
    
    public Cargo(String nNombre)
    {
        nombre=nNombre;
    }
    
}
