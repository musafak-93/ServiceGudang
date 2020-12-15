/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gudang;

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
 * @author Musafak
 */
@Entity
@Table(name = "BARANG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Barang.findAll", query = "SELECT b FROM Barang b")
    , @NamedQuery(name = "Barang.findByIdb", query = "SELECT b FROM Barang b WHERE b.idb = :idb")
    , @NamedQuery(name = "Barang.findByNamabarang", query = "SELECT b FROM Barang b WHERE b.namabarang = :namabarang")
    , @NamedQuery(name = "Barang.findByJumlah", query = "SELECT b FROM Barang b WHERE b.jumlah = :jumlah")})
public class Barang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDB")
    private Integer idb;
    @Size(max = 50)
    @Column(name = "NAMABARANG")
    private String namabarang;
    @Column(name = "JUMLAH")
    private Integer jumlah;

    public Barang() {
    }

    public Barang(Integer idb) {
        this.idb = idb;
    }

    public Integer getIdb() {
        return idb;
    }

    public void setIdb(Integer idb) {
        this.idb = idb;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idb != null ? idb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barang)) {
            return false;
        }
        Barang other = (Barang) object;
        if ((this.idb == null && other.idb != null) || (this.idb != null && !this.idb.equals(other.idb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gudang.Barang[ idb=" + idb + " ]";
    }
    
}
