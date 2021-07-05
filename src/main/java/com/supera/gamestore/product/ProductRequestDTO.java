package com.supera.gamestore.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDTO {



    public long id;

    @NotNull
    @NotEmpty
    @Size(max=255)
    public String name;

    @NotNull
    @NotEmpty
    public BigDecimal price;

    @NotNull
    @NotEmpty
    public short score;

    @NotNull
    @NotEmpty
    public String image;
}
