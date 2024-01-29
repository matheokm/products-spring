package com.unir.calculadora.caluladoraspring.data;
import java.util.List;

import com.unir.calculadora.caluladoraspring.model.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

interface ProductJpaRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

    List<Product> findByName(String name);

    List<Product> findByCountry(String country);

    List<Product> findByVisible(Boolean visible);

    List<Product> findByNameAndCountry(String name, String country);

}
