package com.momo.regularsystem.service.impl;

import com.momo.regularsystem.entity.Declarant;
import com.momo.regularsystem.repository.DeclarantRepository;
import com.momo.regularsystem.service.DeclarantService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeclarantServiceImpl implements DeclarantService {
    private DeclarantRepository declarantRepository;
    public DeclarantServiceImpl(DeclarantRepository  declarantRepository) {
        super();
        this.declarantRepository = declarantRepository;
    }
    @Override
    public List<Declarant> getAllDeclarants() {

        return declarantRepository.findAll();
    }

    @Override
    public Declarant saveDeclarant(Declarant declarant) {

        return declarantRepository.save(declarant);
    }

    @Override
    public Declarant getDeclarantById(Long id) {

        return declarantRepository.findById(id).get();
    }

    @Override
    public Declarant updateDeclarant(Declarant declarant) {

        return declarantRepository.save(declarant);
    }

    @Override
    public void deleteDeclarantById(Long id) {
        declarantRepository.deleteById(id);

    }
}
