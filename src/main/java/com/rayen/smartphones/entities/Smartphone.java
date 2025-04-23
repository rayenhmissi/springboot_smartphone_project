package com.rayen.smartphones.entities;
import java.util.Date; 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
@Entity
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 
    private String marque;
    private String modele;
    private int ram;
    private int stockage;
    private Double prix; 
    private Date date;
    public Smartphone() {
        super();
    }
    public Smartphone(String marque, String modele, int ram, int stockage, Double prix, Date date) {
        super();
        this.marque = marque;
        this.modele = modele;
        this.ram = ram;
        this.stockage = stockage;
        this.prix = prix;
        this.date = date;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getStockage() {
        return stockage;
    }
    public void setStockage(int stockage) {
        this.stockage = stockage;
    }
    public Double getPrix() {
        return prix;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Smartphone [id=" + id + ", marque=" + marque + ", modele=" + modele + ", ram=" + ram + ", stockage="
                + stockage + ", prix=" + prix + ", date=" + date + "]";
    }
}
