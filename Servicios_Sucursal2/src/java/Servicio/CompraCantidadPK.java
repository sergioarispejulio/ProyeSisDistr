/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author SergioArispe
 */
@Embeddable
public class CompraCantidadPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMPRA_NRO")
    private int compraNro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRODUCTO_NRO")
    private int productoNro;

    public CompraCantidadPK() {
    }

    public CompraCantidadPK(int compraNro, int productoNro) {
        this.compraNro = compraNro;
        this.productoNro = productoNro;
    }

    public int getCompraNro() {
        return compraNro;
    }

    public void setCompraNro(int compraNro) {
        this.compraNro = compraNro;
    }

    public int getProductoNro() {
        return productoNro;
    }

    public void setProductoNro(int productoNro) {
        this.productoNro = productoNro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) compraNro;
        hash += (int) productoNro;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompraCantidadPK)) {
            return false;
        }
        CompraCantidadPK other = (CompraCantidadPK) object;
        if (this.compraNro != other.compraNro) {
            return false;
        }
        if (this.productoNro != other.productoNro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Servicio.CompraCantidadPK[ compraNro=" + compraNro + ", productoNro=" + productoNro + " ]";
    }
    
}
