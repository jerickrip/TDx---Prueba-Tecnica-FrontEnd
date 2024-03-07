package com.pokecrudangular.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="customers")
public class customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String lastname;
    private String pasatiempo;
    private Date cumple;
    @Column(unique = true,nullable = false)
    private Integer dui;

    public customer() {
    }

    public customer(Integer id, String firstname, String lastname, String pasatiempo, Date cumple, Integer dui) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.pasatiempo = pasatiempo;
        this.cumple = cumple;
        this.dui = dui;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPasatiempo() {
        return pasatiempo;
    }

    public void setPasatiempo(String pasatiempo) {
        this.pasatiempo = pasatiempo;
    }

    public Date getCumple() {
        return cumple;
    }

    public void setCumple(Date cumple) {
        this.cumple = cumple;
    }

    public Integer getDui() {
        return dui;
    }

    public void setDui(Integer dui) {
        this.dui = dui;
    }

}
