/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SergioArispe
 */
@Entity
@Table(name = "COMPRA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compra.findAll", query = "SELECT c FROM Compra c"),
    @NamedQuery(name = "Compra.findByNro", query = "SELECT c FROM Compra c WHERE c.nro = :nro"),
    @NamedQuery(name = "Compra.findByCancelado", query = "SELECT c FROM Compra c WHERE c.cancelado = :cancelado"),
    @NamedQuery(name = "Compra.findByMontoTotal", query = "SELECT c FROM Compra c WHERE c.montoTotal = :montoTotal"),
    @NamedQuery(name = "Compra.findByUsuarioCi", query = "SELECT c FROM Compra c WHERE c.usuarioCi = :usuarioCi"),
    @NamedQuery(name = "Compra.findByFecha", query = "SELECT c FROM Compra c WHERE c.fecha = :fecha")})
public class Compra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NRO")
    private Integer nro;
    @Column(name = "CANCELADO")
    private Serializable cancelado;
    @Column(name = "MONTO_TOTAL")
    private Integer montoTotal;
    @Column(name = "USUARIO_CI")
    private Integer usuarioCi;
    @Size(max = 70)
    @Column(name = "FECHA")
    private String fecha;

    public Compra() {
    }

    public Compra(Integer nro) {
        this.nro = nro;
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public Serializable getCancelado() {
        return cancelado;
    }

    public void setCancelado(Serializable cancelado) {
        this.cancelado = cancelado;
    }

    public Integer getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Integer montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Integer getUsuarioCi() {
        return usuarioCi;
    }

    public void setUsuarioCi(Integer usuarioCi) {
        this.usuarioCi = usuarioCi;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nro != null ? nro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.nro == null && other.nro != null) || (this.nro != null && !this.nro.equals(other.nro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Servicios.Compra[ nro=" + nro + " ]";
    }
    
}
