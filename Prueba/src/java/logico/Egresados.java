/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class Egresados {
 
    /**
    * Nombre del egresado
    */
    private String nombres;
    
    /**
    * Apellido del egresado
    */
    private String apellidos;

    /**
    *Identificacion del egresado 
    */
    private int identificacion;
	
    /**
    *Fecha de nacimiento del egresado 
    */
    private int fechaNacimiento;
	
    /**
    *Correo del egresado 
    */
    private String correo;
    
    /**
    * 
    */
    private String direccion;
    
    /**
    * 
    */
    private int telefono;
    
    /**
    * 
    */
    private int añoEgreso;
    
    /**
    * 
    */
    private String estadoEgreso;
    
    /**
    * 
    */
    private ArrayList<Distinciones> distinciones; 
    
    /**
    * 
    */
    private ArrayList<ExperienciaProfesional> experienciaProfesional;
    
    /**
    * 
    */
    private ArrayList<Postgrado> postgrado;
    
    /**
    * 
    */
    private ArrayList<Red> redes; 
    
    

    //----------------------------------------------------------------------
    //CONSTRUCTOR
    //----------------------------------------------------------------------
    public Egresados (String nNombres, String nApellidos, int nIdentificacion, int nFechaNacimiento, String nCorreo, String nDireccion, 
            int nTelefono, int nAñoEgreso, String nEstadoEgreso)    
    {
        nombres = nNombres;
        apellidos = nApellidos;
        identificacion = nIdentificacion;
        fechaNacimiento = nFechaNacimiento;
        correo = nCorreo;
        direccion = nDireccion;
        telefono = nTelefono;
        añoEgreso = nAñoEgreso;
        estadoEgreso = nEstadoEgreso;
        distinciones = new ArrayList<>();
        experienciaProfesional = new ArrayList<>();
        postgrado = new ArrayList<>();
        redes = new ArrayList<>();
           
                
    }
    
    //----------------------------------------------------------------------
    //GETTERS AND SETTERS
    //----------------------------------------------------------------------

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the identificacion
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
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

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the añoEgreso
     */
    public int getAñoEgreso() {
        return añoEgreso;
    }

    /**
     * @param añoEgreso the añoEgreso to set
     */
    public void setAñoEgreso(int añoEgreso) {
        this.añoEgreso = añoEgreso;
    }

    /**
     * @return the estadoEgreso
     */
    public String getEstadoEgreso() {
        return estadoEgreso;
    }

    /**
     * @param estadoEgreso the estadoEgreso to set
     */
    public void setEstadoEgreso(String estadoEgreso) {
        this.estadoEgreso = estadoEgreso;
    }

    /**
     * @return the distinciones
     */
    public ArrayList<Distinciones> getDistinciones() {
        return distinciones;
    }

    /**
     * @param distinciones the distinciones to set
     */
    public void setDistinciones(ArrayList<Distinciones> distinciones) {
        this.distinciones = distinciones;
    }

    /**
     * @return the experienciaProfesional
     */
    public ArrayList<ExperienciaProfesional> getExperienciaProfesional() {
        return experienciaProfesional;
    }

    /**
     * @param experienciaProfesional the experienciaProfesional to set
     */
    public void setExperienciaProfesional(ArrayList<ExperienciaProfesional> experienciaProfesional) {
        this.experienciaProfesional = experienciaProfesional;
    }

    /**
     * @return the postgrado
     */
    public ArrayList<Postgrado> getPostgrado() {
        return postgrado;
    }

    /**
     * @param postgrado the postgrado to set
     */
    public void setPostgrado(ArrayList<Postgrado> postgrado) {
        this.postgrado = postgrado;
    }

    /**
     * @return the redes
     */
    public ArrayList<Red> getRedes() {
        return redes;
    }

    /**
     * @param redes the redes to set
     */
    public void setRedes(ArrayList<Red> redes) {
        this.redes = redes;
    }
    
    
    
    
}
