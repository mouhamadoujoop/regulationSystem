package com.momo.regularsystem.service.impl;

import com.momo.regularsystem.entity.Paiement;
import com.momo.regularsystem.repository.PaiementRepository;
import com.momo.regularsystem.service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaiementServiceImpl implements PaiementService {
    @Autowired
    private PaiementRepository paiementRepository;
    public PaiementServiceImpl(PaiementRepository paiementRepository){
        super();
        this.paiementRepository = paiementRepository;
    }
    @Override
    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement savePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement getPaiementById(Long id) {
        return paiementRepository.findById(id).get();
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void deletePaiementById(Long id) {
        paiementRepository.deleteById(id);

    }
}
