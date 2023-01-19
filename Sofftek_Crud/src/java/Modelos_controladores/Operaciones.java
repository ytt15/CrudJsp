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
@Table(name = "operaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operaciones.findAll", query = "SELECT o FROM Operaciones o")
    , @NamedQuery(name = "Operaciones.findByIdentificacionConducto", query = "SELECT o FROM Operaciones o WHERE o.identificacionConducto = :identificacionConducto")
    , @NamedQuery(name = "Operaciones.findByNombreConducto", query = "SELECT o FROM Operaciones o WHERE o.nombreConducto = :nombreConducto")
    , @NamedQuery(name = "Operaciones.findByPlacaVehiculo", query = "SELECT o FROM Operaciones o WHERE o.placaVehiculo = :placaVehiculo")
    , @NamedQuery(name = "Operaciones.findByMarcaVehiculo", query = "SELECT o FROM Operaciones o WHERE o.marcaVehiculo = :marcaVehiculo")
    , @NamedQuery(name = "Operaciones.findByModeloVehiculo", query = "SELECT o FROM Operaciones o WHERE o.modeloVehiculo = :modeloVehiculo")
    , @NamedQuery(name = "Operaciones.findByOperacionescol", query = "SELECT o FROM Operaciones o WHERE o.operacionescol = :operacionescol")
    , @NamedQuery(name = "Operaciones.findByUsuarioIdusuario", query = "SELECT o FROM Operaciones o WHERE o.usuarioIdusuario = :usuarioIdusuario")
    , @NamedQuery(name = "Operaciones.findByEstadoIdestado", query = "SELECT o FROM Operaciones o WHERE o.estadoIdestado = :estadoIdestado")})
public class Operaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "identificacionConducto")
    private Integer identificacionConducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreConducto")
    private String nombreConducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "placaVehiculo")
    private String placaVehiculo;
    @Size(max = 45)
    @Column(name = "marcaVehiculo")
    private String marcaVehiculo;
    @Size(max = 45)
    @Column(name = "modeloVehiculo")
    private String modeloVehiculo;
    @Size(max = 45)
    @Column(name = "operacionescol")
    private String operacionescol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_idusuario")
    private int usuarioIdusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_idestado")
    private int estadoIdestado;

    public Operaciones() {
    }

    public Operaciones(Integer identificacionConducto) {
        this.identificacionConducto = identificacionConducto;
    }

    public Operaciones(Integer identificacionConducto, String nombreConducto, String placaVehiculo, int usuarioIdusuario, int estadoIdestado) {
        this.identificacionConducto = identificacionConducto;
        this.nombreConducto = nombreConducto;
        this.placaVehiculo = placaVehiculo;
        this.usuarioIdusuario = usuarioIdusuario;
        this.estadoIdestado = estadoIdestado;
    }

    public Integer getIdentificacionConducto() {
        return identificacionConducto;
    }

    public void setIdentificacionConducto(Integer identificacionConducto) {
        this.identificacionConducto = identificacionConducto;
    }

    public String getNombreConducto() {
        return nombreConducto;
    }

    public void setNombreConducto(String nombreConducto) {
        this.nombreConducto = nombreConducto;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getOperacionescol() {
        return operacionescol;
    }

    public void setOperacionescol(String operacionescol) {
        this.operacionescol = operacionescol;
    }

    public int getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(int usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public int getEstadoIdestado() {
        return estadoIdestado;
    }

    public void setEstadoIdestado(int estadoIdestado) {
        this.estadoIdestado = estadoIdestado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificacionConducto != null ? identificacionConducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operaciones)) {
            return false;
        }
        Operaciones other = (Operaciones) object;
        if ((this.identificacionConducto == null && other.identificacionConducto != null) || (this.identificacionConducto != null && !this.identificacionConducto.equals(other.identificacionConducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos_controladores.Operaciones[ identificacionConducto=" + identificacionConducto + " ]";
    }
    
}
