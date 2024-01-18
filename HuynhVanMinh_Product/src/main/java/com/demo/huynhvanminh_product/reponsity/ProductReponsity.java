package com.demo.huynhvanminh_product.reponsity;

import com.demo.huynhvanminh_product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReponsity extends JpaRepository<Product,Integer> {
}
