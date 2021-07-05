package com.supera.gamestore.mapper;

import com.supera.gamestore.product.Product;
import com.supera.gamestore.product.ProductRequestDTO;
import com.supera.gamestore.product.ProductResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

        ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

        Product toModel(ProductRequestDTO productRequestDTO);
        ProductResponseDTO toDTO(Product product);
}
