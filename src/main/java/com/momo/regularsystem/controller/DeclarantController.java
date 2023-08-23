package com.momo.regularsystem.controller;

import com.momo.regularsystem.entity.Declarant;
import com.momo.regularsystem.service.DeclarantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/declarants")
public class DeclarantController {
    @Autowired
    private DeclarantService declarantService;
    @Autowired
    public DeclarantController( DeclarantService declarantService) {
        super();
        this.declarantService = declarantService;
    }

    // handler method to handle list declarants and return mode and view
    @GetMapping("/declarants")
    public String listDeclarants (Model model) {
       model.addAttribute("declarants", declarantService.getAllDeclarants());
       return "declarants";
    }
    @GetMapping("/declarants/new")
    public String createDeclarantForm(Model model) {

        // create declarant object to hold student form data
        Declarant declarant = new Declarant();
        model.addAttribute("declarant", declarant);
        return "create_declarant";

    }
    @PostMapping("/declarants")
    public String saveDeclarant(@ModelAttribute("declarant") Declarant declarant) {
        declarantService.saveDeclarant(declarant);
        return "redirect:/declarants";
    }

    @GetMapping("/declarants/edit/{id}")
    public String editDeclarantForm(@PathVariable Long id, Model model) {
        model.addAttribute("declarant", declarantService.getDeclarantById(id));
        return "edit_declarant";
    }

    @PostMapping("/declarants/{id}")
    public String updateDeclarant(@PathVariable Long id,
                                @ModelAttribute("declarant") Declarant declarant,
                                Model model) {

        // get declarant from database by id
        Declarant existingDeclarant = declarantService.getDeclarantById(id);
        existingDeclarant.setId(id);
        existingDeclarant.setAdresse(declarant.getAdresse());
        existingDeclarant.setEmail(declarant.getEmail());
        existingDeclarant.setTelephone(declarant.getTelephone());
        existingDeclarant.setRaisonSociale(declarant.getRaisonSociale());


        // save updated declarant object
        declarantService.updateDeclarant( existingDeclarant);
        return "redirect:/declarants";
    }

    // handler method to handle delete declarant request

    @GetMapping("/declarants/{id}")
    public String deleteDeclarant(@PathVariable Long id) {
        declarantService.deleteDeclarantById(id);
        return "redirect:/declarants";
    }
}
