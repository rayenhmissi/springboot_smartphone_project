package com.rayen.smartphones.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rayen.smartphones.entities.Smartphone;

public interface SmartphoneRepository extends JpaRepository<Smartphone,Long>{
}
