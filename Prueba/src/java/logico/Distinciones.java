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
     
    private int fechaNacimiento;
      
    private String quienOtorga;
   
    
    //-------------------------------------------------------------------------------------------
    //Constructor
    //-------------------------------------------------------------------------------------------
    
    public Distinciones (String nDescripcion, int nFechaNacimiento, String nQuienOtorga)
    {
        descripcion = nDescripcion;
        fechaNacimiento = nFechaNacimiento;
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
     * @return the fechaNacimiento
     */
    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
