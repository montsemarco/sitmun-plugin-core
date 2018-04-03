package org.sitmun.plugin.core.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="stm_tarea")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="tar_codigo")
    private long id;
    
    @Column(name="tar_nombre")
    private String nombre;
    
    @Column(name="tar_orden")
    private Integer order;
    
    
    @Column(name="tar_f_alta")
    private Date fechaAlta;

    @ManyToOne
    @JoinColumn(name="tar_codcon")
    private Conexion conexion;
    
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "stm_roltar", joinColumns = @JoinColumn(name = "rta_codrol"), inverseJoinColumns = @JoinColumn(name = "rta_codtar"))            
    private Set<Rol> roles;


    /**
     * @return the id
     */
    public long getId() {
        return id;
    }


    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }


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
     * @return the order
     */
    public Integer getOrder() {
        return order;
    }


    /**
     * @param order the order to set
     */
    public void setOrder(Integer order) {
        this.order = order;
    }


    /**
     * @return the fechaAlta
     */
    public Date getFechaAlta() {
        return fechaAlta;
    }


    /**
     * @param fechaAlta the fechaAlta to set
     */
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    /**
     * @return the conexion
     */
    public Conexion getConexion() {
        return conexion;
    }


    /**
     * @param conexion the conexion to set
     */
    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }


    /**
     * @return the roles
     */
    public Set<Rol> getRoles() {
        return roles;
    }


    /**
     * @param roles the roles to set
     */
    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }    

}