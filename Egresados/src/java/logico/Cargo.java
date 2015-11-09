/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

/**
 * @author megasoft.
 * Universidad Mariana (Pasto - Colombia) 
 * Departamento de Ingenier�a de Sistemas. 
 */
public class Cargo {
    
    /**
    * Nombre del cargo
    */
    private String nombre;
    
    /**
    *Funciones que tiene el cargo
    */
    private String funciones;
    
    //-------------------------------------------------------------------------------------------
    //Constructor
    //-------------------------------------------------------------------------------------------
    
    /**
    * Crea un cargo con la información basica
    * @param nNombre Es el nombre del cargo nCargo !=""
    * @param nFunciones Son las funciones que tiene el cargo, nFunciones !=""
    */
    public Cargo (String nNombre, String nFunciones)
    {
        nombre = nNombre;
        funciones = nFunciones;
    }
    
    //----------------------------------------------------------------------
    //GETTERS AND SETTERS
    //----------------------------------------------------------------------

    /**
     * Retorna el nombre del cargo
     * @return cargo, nombre del cargo
     */
    public String getNombre() {
        return nombre;
    }

    /**
    * Establece el nombre del cargo
    * @param nombre el nombre del cargo !=""
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna las funciones del cargo
     * @return funciones las funciones del cargo
     */
    public String getFunciones() {
        return funciones;
    }

    /**
     * Establece las funciones del cargo
     * @param funciones son las funciones del cargo !=""
     */
    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }
    
    /**
     * Metodo para retornar e nombre del cargo
     * @param nNombre Es el nombre del cargo nCargo !=""
     */
    public Cargo(String nNombre)
    {
        nombre=nNombre;
    }
    
}
