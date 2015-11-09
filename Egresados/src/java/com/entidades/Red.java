/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author David
 */
@Entity
@Table(name = "red")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Red.findAll", query = "SELECT r FROM Red r"),
    @NamedQuery(name = "Red.findByIdRed", query = "SELECT r FROM Red r WHERE r.idRed = :idRed"),
    @NamedQuery(name = "Red.findByNombre", query = "SELECT r FROM Red r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Red.findByDirector", query = "SELECT r FROM Red r WHERE r.director = :director"),
    @NamedQuery(name = "Red.findByA\u00f1oCreaci\u00f3n", query = "SELECT r FROM Red r WHERE r.a\u00f1oCreaci\u00f3n = :a\u00f1oCreaci\u00f3n"),
    @NamedQuery(name = "Red.findByEmail", query = "SELECT r FROM Red r WHERE r.email = :email")})
public class Red implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_red")
    private Integer idRed;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "director")
    private String director;
    @Basic(optional = false)
    @NotNull
    @Column(name = "a\u00f1o_creaci\u00f3n")
    @Temporal(TemporalType.DATE)
    private Date añoCreación;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;
    @ManyToMany(mappedBy = "redList")
    private List<Egresado> egresadoList;

    public Red() {
    }

    public Red(Integer idRed) {
        this.idRed = idRed;
    }

    public Red(Integer idRed, String nombre, String director, Date añoCreación, String email) {
        this.idRed = idRed;
        this.nombre = nombre;
        this.director = director;
        this.añoCreación = añoCreación;
        this.email = email;
    }

    public Integer getIdRed() {
        return idRed;
    }

    public void setIdRed(Integer idRed) {
        this.idRed = idRed;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getAñoCreación() {
        return añoCreación;
    }

    public void setAñoCreación(Date añoCreación) {
        this.añoCreación = añoCreación;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public List<Egresado> getEgresadoList() {
        return egresadoList;
    }

    public void setEgresadoList(List<Egresado> egresadoList) {
        this.egresadoList = egresadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRed != null ? idRed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Red)) {
            return false;
        }
        Red other = (Red) object;
        if ((this.idRed == null && other.idRed != null) || (this.idRed != null && !this.idRed.equals(other.idRed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.Red[ idRed=" + idRed + " ]";
    }
    
}
