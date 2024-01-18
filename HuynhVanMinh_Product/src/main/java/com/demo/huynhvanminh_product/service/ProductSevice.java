package com.demo.huynhvanminh_product.service;

import com.demo.huynhvanminh_product.entity.Product;

import java.util.List;

public interface ProductSevice {
    public List<Product> getAllProduct();
    public void addProduct(Product product);

}
