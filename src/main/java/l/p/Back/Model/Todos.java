/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l.p.Back.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_d;
    
    private boolean actif ;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public Todos(String title, String description, Date date_d, boolean actif) {
        this.title = title;
        this.description = description;
        this.date_d = date_d;
        this.actif = actif;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Todos)) {
            return false;
        }
        Todos other = (Todos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "l.p.Back.Model.Comptes[ id=" + id + " title "+title+" date_d  "+date_d;
    }

}
