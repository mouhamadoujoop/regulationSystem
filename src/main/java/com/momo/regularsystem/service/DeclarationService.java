package com.momo.regularsystem.service;

import com.momo.regularsystem.entity.Declaration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeclarationService  {
    List<Declaration> getAllDeclaration();

    Declaration saveDeclaration(Declaration declaration);

    Declaration getDeclarationById(Long id);

    Declaration updateDeclaration(Declaration declaration);

    void deleteDeclarationById(Long id);


}