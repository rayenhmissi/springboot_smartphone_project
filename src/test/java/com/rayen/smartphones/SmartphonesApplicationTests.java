package com.rayen.smartphones;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rayen.smartphones.entities.Smartphone;
import com.rayen.smartphones.repos.SmartphoneRepository;

@SpringBootTest
class SmartphonesApplicationTests {

	@Autowired
	private SmartphoneRepository smartphoneRepository;
   
	@Test
	public void testCreateSmartphone() {
	 Smartphone smart = new Smartphone("samsung", "galaxy a16",8,256,799.99, new Date());
	 smartphoneRepository.save(smart);
	}
   
	@Test
	public void testFindSmartphone() {
	 Smartphone s= smartphoneRepository.findById(1L).get();
	 System.out.println(s);
	}
   
	@Test
	public void testUpdateSmartphone() {
	 Smartphone s= smartphoneRepository.findById(1L).get();
	 s.setPrix(749.99);
	 smartphoneRepository.save(s);
	}
   
	@Test
	public void testDeleteSmartphone() {
	 smartphoneRepository.deleteById(1L);
	}
   
	@Test
	public void testListerTousSmarphones() {
	 List<Smartphone> smarts = smartphoneRepository.findAll();
	 for (Smartphone s : smarts) {
	 System.out.println(s);
	 }
	}   
}
