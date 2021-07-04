package com.supera.gamestore.repository.product;

import com.supera.gamestore.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
