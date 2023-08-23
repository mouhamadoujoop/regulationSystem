package com.momo.regularsystem.service.impl;

import com.momo.regularsystem.entity.Declaration;
import com.momo.regularsystem.repository.DeclarantRepository;
import com.momo.regularsystem.repository.DeclarationRepository;
import com.momo.regularsystem.service.DeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeclarationServiceImpl implements DeclarationService{
    @Autowired
    private DeclarationRepository declarationRepository;
    public DeclarationServiceImpl(DeclarantRepository declarantRepository) {
        super();
       this.declarationRepository = declarationRepository;
    }
    @Override
    public List<Declaration> getAllDeclaration() {

        return declarationRepository.findAll();
    }

    @Override
    public Declaration saveDeclaration(Declaration declaration) {
        return declarationRepository.save(declaration);
    }

    @Override
    public Declaration getDeclarationById(Long id) {
        return declarationRepository.findById(id).get();
    }

    @Override
    public Declaration updateDeclaration(Declaration declaration) {
        return declarationRepository.save(declaration);
    }

    @Override
    public void deleteDeclarationById(Long id) {
        declarationRepository .deleteById(id);

    }
}
