package com.rayen.smartphones;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rayen.smartphones.entities.Smartphone;
import com.rayen.smartphones.service.SmartphoneService;

@SpringBootApplication
public class SmartphonesApplication implements CommandLineRunner {
	@Autowired  
	SmartphoneService smartphoneService;
	public static void main(String[] args) {
		SpringApplication.run(SmartphonesApplication.class, args);
	}
	@Override 
	public void run(String... args) throws Exception { 
	smartphoneService.saveSmartphone(new Smartphone("apple","iphone 15",6,128, 4499.9, new Date())); 
	smartphoneService.saveSmartphone(new Smartphone("samsung","galaxy a56",8,256, 1999.99, new Date())); 
	smartphoneService.saveSmartphone(new Smartphone("xiaomi","redmi note 14 5g",8,128, 949.9, new Date())); 
	} 
}
