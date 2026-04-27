package com.oong.store.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class StoreProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
    private Long categoryId;
}
