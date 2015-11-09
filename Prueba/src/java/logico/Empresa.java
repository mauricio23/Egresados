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
public class Empresa {
    
    private String nombre;
    
    private String ciudad;
    
    private String pais;
    
    //-------------------------------------------------------------------------------------------
    //Constructor
    //-------------------------------------------------------------------------------------------
    
    public Empresa(String nNombre, String nCiudad, String nPais)
    {
        nombre = nNombre;
        ciudad = nCiudad;
        pais = nPais;
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
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public Empresa(String nNombre)
    {
        nombre=nNombre;
    }

           
}
