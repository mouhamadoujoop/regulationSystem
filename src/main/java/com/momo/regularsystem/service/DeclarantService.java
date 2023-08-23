package com.momo.regularsystem.service;

import com.momo.regularsystem.entity.Declarant;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface  DeclarantService {

        List<Declarant> getAllDeclarants();

    Declarant saveDeclarant(Declarant declarant);

    Declarant getDeclarantById(Long id);

    Declarant updateDeclarant(Declarant declarant);

        void deleteDeclarantById(Long id);

}
