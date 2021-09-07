package com.sha.springbootmicroservice1product.repository;

import com.sha.springbootmicroservice1product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository 2 parametre alıyor. 1 -> Model Sınıf , 2 -> Model sınıfındaki Id sınıf
public interface IProductRepository extends JpaRepository<Product, Long> {
}
