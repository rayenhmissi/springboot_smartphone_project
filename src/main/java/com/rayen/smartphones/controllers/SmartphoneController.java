package com.rayen.smartphones.controllers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.rayen.smartphones.entities.Smartphone;
import com.rayen.smartphones.service.SmartphoneService;

@Controller

public class SmartphoneController {
    @Autowired
    SmartphoneService smartphoneService;
   
    @GetMapping("/ListeSmartphones")
    public String listeSmartphones(ModelMap modelMap) {
     List<Smartphone> smarts = smartphoneService.getAllSmartphones();
     modelMap.addAttribute("smartphones", smarts);
     return "listeSmartphones";
    }
    @GetMapping("/showCreate")
    public String showCreate() {
     return "createSmartphone";
    }
   
    @GetMapping("/saveSmartphone")
    public String saveSmartphone(@ModelAttribute("produit") Smartphone smartphone,
      @RequestParam("date") String date,
      ModelMap modelMap) throws ParseException {
   
     // conversion de la date
     SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
     Date dateCreation = dateformat.parse(String.valueOf(date));
     smartphone.setDate(dateCreation);
     Smartphone saveSmartphone = smartphoneService.saveSmartphone(smartphone);
     String msg = "produit enregistré avec Id " + saveSmartphone.getId();
     modelMap.addAttribute("msg", msg);
     return "createSmartphone";
    }
   
    @GetMapping("/supprimerSmartphone")
    public String supprimerSmartphone(@RequestParam("id") Long id,
      ModelMap modelMap) {
     smartphoneService.deleteSmartphoneById(id);
     List<Smartphone> smarts = smartphoneService.getAllSmartphones();
     modelMap.addAttribute("produits", smarts);
     return "listeSmartphones";
    }
   
    @GetMapping("/modifierSmartphone")
    public String editerSmartphone(@RequestParam("id") Long id,
      ModelMap modelMap) {
     Smartphone s= smartphoneService.getSmartphone(id);
     modelMap.addAttribute("smartphone", s);
     return "editerSmartphone";
    }
   
    @GetMapping("/updateSmartphone")
    public String updateSmartphone(@ModelAttribute("smartphone") Smartphone smartphone,
      @RequestParam("date") String date,
      ModelMap modelMap) throws ParseException {
   
     // conversion de la date
     SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
     Date dateCreation = dateformat.parse(String.valueOf(date));
     smartphone.setDate(dateCreation);
     smartphoneService.updateSmartphone(smartphone);
     List<Smartphone> smarts = smartphoneService.getAllSmartphones();
     modelMap.addAttribute("smartphones", smarts);
     return "listeSmartphones";
    }   
}
