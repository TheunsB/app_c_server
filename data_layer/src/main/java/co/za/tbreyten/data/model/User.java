package co.za.tbreyten.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by theunsb on 16/10/15.
 */
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private Integer ID;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
