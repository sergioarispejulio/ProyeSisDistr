/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package central;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SergioArispe
 */
@Entity
@Table(name = "COMPRA_CANTIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompraCantidad.findAll", query = "SELECT c FROM CompraCantidad c"),
    @NamedQuery(name = "CompraCantidad.findByCompraNro", query = "SELECT c FROM CompraCantidad c WHERE c.compraCantidadPK.compraNro = :compraNro"),
    @NamedQuery(name = "CompraCantidad.findByProductoNro", query = "SELECT c FROM CompraCantidad c WHERE c.compraCantidadPK.productoNro = :productoNro"),
    @NamedQuery(name = "CompraCantidad.findByCantidad", query = "SELECT c FROM CompraCantidad c WHERE c.cantidad = :cantidad")})
public class CompraCantidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompraCantidadPK compraCantidadPK;
    @Column(name = "CANTIDAD")
    private Integer cantidad;

    public CompraCantidad() {
    }

    public CompraCantidad(CompraCantidadPK compraCantidadPK) {
        this.compraCantidadPK = compraCantidadPK;
    }

    public CompraCantidad(int compraNro, int productoNro) {
        this.compraCantidadPK = new CompraCantidadPK(compraNro, productoNro);
    }

    public CompraCantidadPK getCompraCantidadPK() {
        return compraCantidadPK;
    }

    public void setCompraCantidadPK(CompraCantidadPK compraCantidadPK) {
        this.compraCantidadPK = compraCantidadPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compraCantidadPK != null ? compraCantidadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompraCantidad)) {
            return false;
        }
        CompraCantidad other = (CompraCantidad) object;
        if ((this.compraCantidadPK == null && other.compraCantidadPK != null) || (this.compraCantidadPK != null && !this.compraCantidadPK.equals(other.compraCantidadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "central.CompraCantidad[ compraCantidadPK=" + compraCantidadPK + " ]";
    }
    
}
