package com.unir.calculadora.caluladoraspring.service;

import java.util.List;

import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.mergepatch.JsonMergePatch;

import com.unir.calculadora.caluladoraspring.model.pojo.Product;
import com.unir.calculadora.caluladoraspring.model.pojo.ProductDto;
import com.unir.calculadora.caluladoraspring.model.request.CreateProductRequest;

public interface ProductsService {

    List<Product> getProducts(String name, String country, String description, Boolean visible);

    Product getProduct(String productId);

    Boolean removeProduct(String productId);

    Product createProduct(CreateProductRequest request);

    Product updateProduct(String productId, String updateRequest);

    Product updateProduct(String productId, ProductDto updateRequest);

}

