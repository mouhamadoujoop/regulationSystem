package com.momo.regularsystem.controller;

import com.momo.regularsystem.entity.Declaration;
import com.momo.regularsystem.service.DeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/declarations")
public class DeclarationController {
    @Autowired
    private DeclarationService declarationService;
    @Autowired
    public DeclarationController( DeclarationService declarationService) {
        super();
        this.declarationService = declarationService;
    }
    // handler method to handle list declarants and return mode and view
    @GetMapping("/declarations")
    public String listDeclarations (Model model) {
        model.addAttribute("declarations", declarationService.getAllDeclaration());
        return "declarations";
    }
    @PostMapping("/declarations")
    public String saveDeclaration(@ModelAttribute("declarations") Declaration declaration)  {
        declarationService.saveDeclaration(declaration);
        return "redirect:/declarations";
    }

}