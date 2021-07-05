package com.supera.gamestore.users.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    @NotNull
    @NotEmpty
    @Size(max=255)
    private String name;

    @NotNull
    @Max(120)
    private int age;

    @NotNull
    @NotEmpty
    @Email
    private String email;

    @NotNull
    @NotEmpty
    @Size(max=100)
    private String username;

    @NotNull
    @NotEmpty
    private String password;
}
