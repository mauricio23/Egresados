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
public class ExperienciaProfesional {
    
    private String fechaInicio;
    
    private String fechaFin;
    
    private Cargo cargo;
    
    private Empresa empresa;
    
    private ArrayList<Cargo> cargos;
    
    private ArrayList<Empresa> empresas;
    
 
    
    //-------------------------------------------------------------------------------------------
    //Constructor
    //-------------------------------------------------------------------------------------------
    
    public ExperienciaProfesional(String nFechaInicio, String nFechaFin, Cargo nCargo, Empresa nEmpresa)
    {
        fechaFin = nFechaFin;
        fechaInicio = nFechaInicio;
        cargo = nCargo;
        empresa = nEmpresa;
    }
    
    //----------------------------------------------------------------------
    //GETTERS AND SETTERS
    //----------------------------------------------------------------------

    /**
     * @return the fechaInicio
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    public Cargo buscarCargo(String nNombre)
    {
        Cargo retorno= null;
        for(int i=0; i<cargos.size();i++){
            String miNombre= cargos.get(i).getNombre();
            if(miNombre.equals(nNombre)){
                retorno = cargos.get(i);
            }
        }
        return retorno;
    }
    
  
    
   
    
    
    
    
    public Empresa buscarEmpresa(String nNombre)
    {
            Empresa retorno= null;
            for(int i=0; i<empresas.size();i++){
                String miNombre= empresas.get(i).getNombre();
                if(miNombre.equals(nNombre)){
                    retorno = empresas.get(i);
                }
            }
            return retorno;
    }
    
  
   
    
    
}
