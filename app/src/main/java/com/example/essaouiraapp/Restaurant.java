package com.example.essaouiraapp;

import java.io.Serializable;
import java.util.HashMap;

public class Restaurant implements Serializable {
    public String id;
    public String nom;
    public String adresse;
    public String description;
    public String tel;
    public String fax;



    public Restaurant() {
    }

    public Restaurant(String id,String nom, String adresse, String description, String tel, String fax) {
        this.id=id;
        this.nom = nom;
        this.adresse = adresse;
        this.description = description;
        this.tel = tel;
        this.fax = fax;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreses() {
        return adresse;
    }

    public void setAdreses(String adreses) {
        this.adresse = adreses;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }


}
