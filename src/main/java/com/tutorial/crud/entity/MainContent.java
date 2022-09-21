package com.tutorial.crud.entity;

import javax.persistence.*;

@Entity
@Table (name = "Main")
public class MainContent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "OwnerName")
    public String owner;

    @Column(name = "UserName")
    public String userName;

    @Column(name = "Password")
    public String pass;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Categories")
    @Column(name= "Category")
    private String category;*/

    @Column(name= "Access")
    public String access;

    @Column(name= "Resource")
    public String dataResource;

    @Column(name="Instructions")
    public String instructions;

    @Column(name="Notes")
    public String notes;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Extras")
    @Column(name= "Extra Users")
    private String xtra;*/

}
