package com.example.__Spring_boot_Data_JPA.Repository;

import com.example.__Spring_boot_Data_JPA.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
