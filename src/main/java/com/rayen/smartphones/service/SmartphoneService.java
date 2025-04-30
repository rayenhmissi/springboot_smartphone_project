package com.rayen.smartphones.service;
import java.util.List;

import org.springframework.data.domain.Page;

import com.rayen.smartphones.entities.Smartphone;

public interface SmartphoneService {
    Smartphone saveSmartphone(Smartphone s); 
    Smartphone updateSmartphone(Smartphone s); 
    void deleteSmartphone(Smartphone s); 
    void deleteSmartphoneById(Long id); 
    Smartphone getSmartphone(Long id); 
    List<Smartphone> getAllSmartphones();
    Page<Smartphone> getAllSmartphonesParPage(int page, int size); 


}
