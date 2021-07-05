package com.supera.gamestore.product;
import com.supera.gamestore.mapper.ProductMapper;
import com.supera.gamestore.users.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProductService {

    private final ProductMapper productMapper = ProductMapper.INSTANCE;

    private ProductRepository productRepository;
    private UserService userService;

    public ProductResponseDTO create(ProductRequestDTO productRequestDTO){

        Product productToSave = productMapper.toModel(productRequestDTO);
        Product savedProduct = productRepository.save(productToSave);
        return productMapper.toDTO(savedProduct);
    }

    public List<ProductResponseDTO> findAllByOrderByPriceDesc(){
        return productRepository.findAllByOrderByPriceDesc()
                .stream().map(productMapper::toDTO)
                .collect(Collectors.toList());
    }

}
