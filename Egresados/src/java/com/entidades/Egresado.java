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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "egresado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Egresado.findAll", query = "SELECT e FROM Egresado e"),
    @NamedQuery(name = "Egresado.findByIdEgresado", query = "SELECT e FROM Egresado e WHERE e.idEgresado = :idEgresado"),
    @NamedQuery(name = "Egresado.findByIdentificaci\u00f3n", query = "SELECT e FROM Egresado e WHERE e.identificaci\u00f3n = :identificaci\u00f3n"),
    @NamedQuery(name = "Egresado.findByNombre", query = "SELECT e FROM Egresado e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Egresado.findByApellido", query = "SELECT e FROM Egresado e WHERE e.apellido = :apellido"),
    @NamedQuery(name = "Egresado.findByFechaNacimiento", query = "SELECT e FROM Egresado e WHERE e.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Egresado.findByEmail", query = "SELECT e FROM Egresado e WHERE e.email = :email"),
    @NamedQuery(name = "Egresado.findByDireccion", query = "SELECT e FROM Egresado e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "Egresado.findByTelefono", query = "SELECT e FROM Egresado e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "Egresado.findByA\u00f1oEgreso", query = "SELECT e FROM Egresado e WHERE e.a\u00f1oEgreso = :a\u00f1oEgreso"),
    @NamedQuery(name = "Egresado.findByEstadoGrado", query = "SELECT e FROM Egresado e WHERE e.estadoGrado = :estadoGrado")})
public class Egresado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_egresado")
    private Integer idEgresado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "identificaci\u00f3n")
    private long identificación;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private Long telefono;
    @Basic(optional = false)
    @NotNull
    @Column(name = "a\u00f1o_egreso")
    @Temporal(TemporalType.DATE)
    private Date añoEgreso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "estado_grado")
    private String estadoGrado;
    @JoinTable(name = "egresado_red", joinColumns = {
        @JoinColumn(name = "id_egresado", referencedColumnName = "id_egresado")}, inverseJoinColumns = {
        @JoinColumn(name = "id_red", referencedColumnName = "id_red")})
    @ManyToMany
    private List<Red> redList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "egresado")
    private List<Postgrado> postgradoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "egresado")
    private List<Distincion> distincionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "egresado")
    private List<Experiencia> experienciaList;

    public Egresado() {
    }

    public Egresado(Integer idEgresado) {
        this.idEgresado = idEgresado;
    }

    public Egresado(Integer idEgresado, long identificación, String nombre, String apellido, Date fechaNacimiento, String email, Date añoEgreso, String estadoGrado) {
        this.idEgresado = idEgresado;
        this.identificación = identificación;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.añoEgreso = añoEgreso;
        this.estadoGrado = estadoGrado;
    }

    public Integer getIdEgresado() {
        return idEgresado;
    }

    public void setIdEgresado(Integer idEgresado) {
        this.idEgresado = idEgresado;
    }

    public long getIdentificación() {
        return identificación;
    }

    public void setIdentificación(long identificación) {
        this.identificación = identificación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public Date getAñoEgreso() {
        return añoEgreso;
    }

    public void setAñoEgreso(Date añoEgreso) {
        this.añoEgreso = añoEgreso;
    }

    public String getEstadoGrado() {
        return estadoGrado;
    }

    public void setEstadoGrado(String estadoGrado) {
        this.estadoGrado = estadoGrado;
    }

    @XmlTransient
    public List<Red> getRedList() {
        return redList;
    }

    public void setRedList(List<Red> redList) {
        this.redList = redList;
    }

    @XmlTransient
    public List<Postgrado> getPostgradoList() {
        return postgradoList;
    }

    public void setPostgradoList(List<Postgrado> postgradoList) {
        this.postgradoList = postgradoList;
    }

    @XmlTransient
    public List<Distincion> getDistincionList() {
        return distincionList;
    }

    public void setDistincionList(List<Distincion> distincionList) {
        this.distincionList = distincionList;
    }

    @XmlTransient
    public List<Experiencia> getExperienciaList() {
        return experienciaList;
    }

    public void setExperienciaList(List<Experiencia> experienciaList) {
        this.experienciaList = experienciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEgresado != null ? idEgresado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Egresado)) {
            return false;
        }
        Egresado other = (Egresado) object;
        if ((this.idEgresado == null && other.idEgresado != null) || (this.idEgresado != null && !this.idEgresado.equals(other.idEgresado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.Egresado[ idEgresado=" + idEgresado + " ]";
    }
    
}
