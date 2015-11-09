/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author David
 */
@Entity
@Table(name = "postgrado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Postgrado.findAll", query = "SELECT p FROM Postgrado p"),
    @NamedQuery(name = "Postgrado.findByIdPostgrado", query = "SELECT p FROM Postgrado p WHERE p.idPostgrado = :idPostgrado"),
    @NamedQuery(name = "Postgrado.findByNombreTitulo", query = "SELECT p FROM Postgrado p WHERE p.nombreTitulo = :nombreTitulo"),
    @NamedQuery(name = "Postgrado.findByA\u00f1oInicio", query = "SELECT p FROM Postgrado p WHERE p.a\u00f1oInicio = :a\u00f1oInicio"),
    @NamedQuery(name = "Postgrado.findByA\u00f1oFin", query = "SELECT p FROM Postgrado p WHERE p.a\u00f1oFin = :a\u00f1oFin")})
public class Postgrado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_postgrado")
    private Integer idPostgrado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre_titulo")
    private String nombreTitulo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "a\u00f1o_inicio")
    @Temporal(TemporalType.DATE)
    private Date añoInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "a\u00f1o_fin")
    @Temporal(TemporalType.DATE)
    private Date añoFin;
    @JoinColumn(name = "egresado", referencedColumnName = "id_egresado")
    @ManyToOne(optional = false)
    private Egresado egresado;
    @JoinColumn(name = "universidad", referencedColumnName = "id_universidad")
    @ManyToOne(optional = false)
    private Universidad universidad;

    public Postgrado() {
    }

    public Postgrado(Integer idPostgrado) {
        this.idPostgrado = idPostgrado;
    }

    public Postgrado(Integer idPostgrado, String nombreTitulo, Date añoInicio, Date añoFin) {
        this.idPostgrado = idPostgrado;
        this.nombreTitulo = nombreTitulo;
        this.añoInicio = añoInicio;
        this.añoFin = añoFin;
    }

    public Integer getIdPostgrado() {
        return idPostgrado;
    }

    public void setIdPostgrado(Integer idPostgrado) {
        this.idPostgrado = idPostgrado;
    }

    public String getNombreTitulo() {
        return nombreTitulo;
    }

    public void setNombreTitulo(String nombreTitulo) {
        this.nombreTitulo = nombreTitulo;
    }

    public Date getAñoInicio() {
        return añoInicio;
    }

    public void setAñoInicio(Date añoInicio) {
        this.añoInicio = añoInicio;
    }

    public Date getAñoFin() {
        return añoFin;
    }

    public void setAñoFin(Date añoFin) {
        this.añoFin = añoFin;
    }

    public Egresado getEgresado() {
        return egresado;
    }

    public void setEgresado(Egresado egresado) {
        this.egresado = egresado;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPostgrado != null ? idPostgrado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Postgrado)) {
            return false;
        }
        Postgrado other = (Postgrado) object;
        if ((this.idPostgrado == null && other.idPostgrado != null) || (this.idPostgrado != null && !this.idPostgrado.equals(other.idPostgrado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.Postgrado[ idPostgrado=" + idPostgrado + " ]";
    }
    
}
