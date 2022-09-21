package com.tutorial.crud.entity;

import javax.persistence.*;

@Entity
@Table(name = "Main")
public class Extras {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "XName")
    private String xname;

    public Extras(Long id, String xname) {
        this.id = id;
        this.xname = xname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname;
    }
}