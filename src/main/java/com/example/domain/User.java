package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String address;
    private String borrowed1;
    private String borrowed2;
    private String borrowed3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBorrowed1() {
        return borrowed1;
    }

    public void setBorrowed1(String borrowed1) {
        this.borrowed1 = borrowed1;
    }

    public String getBorrowed2() {
        return borrowed2;
    }

    public void setBorrowed2(String borrowed2) {
        this.borrowed2 = borrowed2;
    }

    public String getBorrowed3() {
        return borrowed3;
    }

    public void setBorrowed3(String borrowed3) {
        this.borrowed3 = borrowed3;
    }
}