package com.jams_and_jellies.frontend.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    
    @GetMapping
    public String getProductPage(Model model) {
        
        model.addAttribute("userLogin", "default");
        return "product_page";
    }
}