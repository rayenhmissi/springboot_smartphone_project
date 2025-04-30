package com.rayen.smartphones.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.rayen.smartphones.entities.Smartphone;
import com.rayen.smartphones.repos.SmartphoneRepository;
@Service
public class SmartphoneServiceImpl implements SmartphoneService{

    @Autowired
    private SmartphoneRepository smartphoneRepository;
    @Override
    public Smartphone saveSmartphone(Smartphone s) {
        return smartphoneRepository.save(s);
    }

    @Override
    public Smartphone updateSmartphone(Smartphone s) {
        return smartphoneRepository.save(s);
    }

    @Override
    public void deleteSmartphone(Smartphone s) {
        smartphoneRepository.delete(s);
    }

    @Override
    public void deleteSmartphoneById(Long id) {
        smartphoneRepository.deleteById(id);
    }

    @Override
    public Smartphone getSmartphone(Long id) {
        return smartphoneRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Smartphone not found with id: " + id));
    }

    @Override
    public List<Smartphone> getAllSmartphones() {
        return smartphoneRepository.findAll();
    }
        @Override 
    public Page<Smartphone> getAllSmartphonesParPage(int page, int size) { 
    return smartphoneRepository.findAll(PageRequest.of(page, size)); 
    }


}
