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
import javax.persistence.Lob;
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
@Table(name = "distincion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Distincion.findAll", query = "SELECT d FROM Distincion d"),
    @NamedQuery(name = "Distincion.findByIdDistincion", query = "SELECT d FROM Distincion d WHERE d.idDistincion = :idDistincion"),
    @NamedQuery(name = "Distincion.findByQuienOtorga", query = "SELECT d FROM Distincion d WHERE d.quienOtorga = :quienOtorga"),
    @NamedQuery(name = "Distincion.findByFechaEntrega", query = "SELECT d FROM Distincion d WHERE d.fechaEntrega = :fechaEntrega")})
public class Distincion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_distincion")
    private Integer idDistincion;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "descripci\u00f3n")
    private String descripción;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "quien_otorga")
    private String quienOtorga;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @JoinColumn(name = "egresado", referencedColumnName = "id_egresado")
    @ManyToOne(optional = false)
    private Egresado egresado;

    public Distincion() {
    }

    public Distincion(Integer idDistincion) {
        this.idDistincion = idDistincion;
    }

    public Distincion(Integer idDistincion, String descripción, String quienOtorga, Date fechaEntrega) {
        this.idDistincion = idDistincion;
        this.descripción = descripción;
        this.quienOtorga = quienOtorga;
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getIdDistincion() {
        return idDistincion;
    }

    public void setIdDistincion(Integer idDistincion) {
        this.idDistincion = idDistincion;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getQuienOtorga() {
        return quienOtorga;
    }

    public void setQuienOtorga(String quienOtorga) {
        this.quienOtorga = quienOtorga;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Egresado getEgresado() {
        return egresado;
    }

    public void setEgresado(Egresado egresado) {
        this.egresado = egresado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDistincion != null ? idDistincion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Distincion)) {
            return false;
        }
        Distincion other = (Distincion) object;
        if ((this.idDistincion == null && other.idDistincion != null) || (this.idDistincion != null && !this.idDistincion.equals(other.idDistincion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.Distincion[ idDistincion=" + idDistincion + " ]";
    }
    
}
