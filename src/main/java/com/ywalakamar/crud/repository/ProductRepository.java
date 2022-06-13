package com.ywalakamar.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ywalakamar.crud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
