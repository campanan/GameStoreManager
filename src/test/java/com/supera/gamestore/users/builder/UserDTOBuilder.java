package com.supera.gamestore.users.builder;

import com.supera.gamestore.users.dto.UserDTO;
import lombok.Builder;

@Builder
public class UserDTOBuilder {
    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Angelo Campana Neto";

    @Builder.Default
    private int age = 32;

    @Builder.Default
    private String email = "netocampana@gmail.com";

    @Builder.Default
    private String username = "username";

    @Builder.Default
    private String password = "password";

    public UserDTO buildUserDTO(){
        return new UserDTO(id,
                name,
                age,
                email,
                username,
                password);
    }
}
