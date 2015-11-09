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
public class Distinciones {
    
    private String descripcion;
     
    private String fecha;
      
    private String quienOtorga;
   
    
    //-------------------------------------------------------------------------------------------
    //Constructor
    //-------------------------------------------------------------------------------------------
    
    public Distinciones (String nDescripcion, String nFecha, String nQuienOtorga)
    {
        descripcion = nDescripcion;
        fecha = nFecha;
        quienOtorga = nQuienOtorga;
    }
    
    //----------------------------------------------------------------------
    //GETTERS AND SETTERS
    //----------------------------------------------------------------------

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the quienOtorga
     */
    public String getQuienOtorga() {
        return quienOtorga;
    }

    /**
     * @param quienOtorga the quienOtorga to set
     */
    public void setQuienOtorga(String quienOtorga) {
        this.quienOtorga = quienOtorga;
    }
         
}
