package com.momo.regularsystem.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Declaration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateDeclaration;
    private double montantDeclaration;
    @ManyToOne
    @JoinColumn(name = "idDeclarant")
    private Declarant declarant;


    // Constructeurs
    public Declaration() {
    }

    public Declaration(Date dateDeclaration, double montantDeclaration, Declarant declarant) {
        this.dateDeclaration = dateDeclaration;
        this.montantDeclaration = montantDeclaration;
        this.declarant = declarant;
    }
    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public double getMontantDeclaration() {
        return montantDeclaration;
    }

    public void setMontantDeclaration(double montantDeclaration) {
        this.montantDeclaration = montantDeclaration;
    }

    public Declarant getDeclarant() {
        return declarant;
    }

    public void setDeclarant(Declarant declarant) {
        this.declarant = declarant;
    }
}
