package com.oong.store.mappers;

import com.oong.store.dtos.ProductDto;
import com.oong.store.dtos.StoreProductRequest;
import com.oong.store.dtos.UpdateProductRequest;
import com.oong.store.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "categoryId", source = "category.id")
    ProductDto toDto(Product product);
    Product toEntity(StoreProductRequest request);
    void update(UpdateProductRequest request, @MappingTarget Product product);
}
