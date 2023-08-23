package com.momo.regularsystem.controller;


import com.momo.regularsystem.entity.Paiement;
import com.momo.regularsystem.service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/paiements")
public class PaiementController {

    @Autowired
    private PaiementService paiementService;
    @Autowired
    public PaiementController(PaiementService paiementService){
        super();
        this.paiementService = paiementService;
    }
    @GetMapping("/paiements")
    public String listPaiements(Model model) {
        List<Paiement> paiements = paiementService.getAllPaiements();
        model.addAttribute("paiements", paiements);
        return "paiements";
    }
    @GetMapping("/paiements/new")
    public String createPaiementForm(Model model) {
        Paiement paiement = new Paiement();
        model.addAttribute("paiement", paiement);
        return "create_paiement";
    }
    @PostMapping("/paiements")
    public String savePaiement(@ModelAttribute("paiement") Paiement paiement) {
        paiementService.savePaiement(paiement);
        return "redirect:/paiements/paiements";
    }
}