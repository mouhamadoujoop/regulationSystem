package com.momo.regularsystem.service;

import com.momo.regularsystem.entity.Paiement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaiementService {

    List<Paiement> getAllPaiements();

    Paiement savePaiement(Paiement paiement);

    Paiement getPaiementById(Long id);

    Paiement updatePaiement(Paiement paiement);

    void deletePaiementById(Long id);
}