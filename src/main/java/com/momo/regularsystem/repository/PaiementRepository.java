package com.momo.regularsystem.repository;

import com.momo.regularsystem.entity.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
