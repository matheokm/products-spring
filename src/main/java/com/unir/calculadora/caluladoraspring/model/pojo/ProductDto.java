package com.unir.calculadora.caluladoraspring.model.pojo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ProductDto {

    private String name;
    private String country;
    private String description;
    private Boolean visible;

}

