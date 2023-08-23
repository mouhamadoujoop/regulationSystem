package com.momo.regularsystem.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date datePaiement;
    private double montantPaiement;
    @ManyToOne
    @JoinColumn(name = "idDeclaration")
    private Declaration declaration;

    // Constructeurs
    public Paiement() {
    }

    public Paiement(Date datePaiement, double montantPaiement, Declaration declaration) {
        this.datePaiement = datePaiement;
        this.montantPaiement = montantPaiement;
        this.declaration = declaration;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public double getMontantPaiement() {
        return montantPaiement;
    }

    public void setMontantPaiement(double montantPaiement) {
        this.montantPaiement = montantPaiement;
    }

    public Declaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
    }
}
