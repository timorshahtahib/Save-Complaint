package com.poraan.Learn.Spring.model;


import javax.persistence.*;

@Entity
public class Comita {

    @Column (name="comita_id")
    private Long id;


    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
