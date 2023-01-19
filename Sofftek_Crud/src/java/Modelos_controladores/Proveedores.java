/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos_controladores;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author YURLEY
 */
@Entity
@Table(name = "proveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p")
    , @NamedQuery(name = "Proveedores.findByIdentificacionProveedor", query = "SELECT p FROM Proveedores p WHERE p.identificacionProveedor = :identificacionProveedor")
    , @NamedQuery(name = "Proveedores.findByNombreProveedor", query = "SELECT p FROM Proveedores p WHERE p.nombreProveedor = :nombreProveedor")
    , @NamedQuery(name = "Proveedores.findByDireccion", query = "SELECT p FROM Proveedores p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "Proveedores.findByCorreo", query = "SELECT p FROM Proveedores p WHERE p.correo = :correo")
    , @NamedQuery(name = "Proveedores.findByDisponibilidadVehiculos", query = "SELECT p FROM Proveedores p WHERE p.disponibilidadVehiculos = :disponibilidadVehiculos")
    , @NamedQuery(name = "Proveedores.findByUsuarioIdusuario", query = "SELECT p FROM Proveedores p WHERE p.usuarioIdusuario = :usuarioIdusuario")})
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "identificacionProveedor")
    private Integer identificacionProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreProveedor")
    private String nombreProveedor;
    @Size(max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 45)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "disponibilidadVehiculos")
    private int disponibilidadVehiculos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_idusuario")
    private int usuarioIdusuario;

    public Proveedores() {
    }

    public Proveedores(Integer identificacionProveedor) {
        this.identificacionProveedor = identificacionProveedor;
    }

    public Proveedores(Integer identificacionProveedor, String nombreProveedor, int disponibilidadVehiculos, int usuarioIdusuario) {
        this.identificacionProveedor = identificacionProveedor;
        this.nombreProveedor = nombreProveedor;
        this.disponibilidadVehiculos = disponibilidadVehiculos;
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public Integer getIdentificacionProveedor() {
        return identificacionProveedor;
    }

    public void setIdentificacionProveedor(Integer identificacionProveedor) {
        this.identificacionProveedor = identificacionProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getDisponibilidadVehiculos() {
        return disponibilidadVehiculos;
    }

    public void setDisponibilidadVehiculos(int disponibilidadVehiculos) {
        this.disponibilidadVehiculos = disponibilidadVehiculos;
    }

    public int getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(int usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificacionProveedor != null ? identificacionProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.identificacionProveedor == null && other.identificacionProveedor != null) || (this.identificacionProveedor != null && !this.identificacionProveedor.equals(other.identificacionProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos_controladores.Proveedores[ identificacionProveedor=" + identificacionProveedor + " ]";
    }
    
}
