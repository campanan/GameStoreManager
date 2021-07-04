package com.supera.gamestore.users.service;

import com.supera.gamestore.users.builder.UserDTOBuilder;
import com.supera.gamestore.users.dto.MessageDTO;
import com.supera.gamestore.users.dto.UserDTO;
import com.supera.gamestore.users.entity.User;
import com.supera.gamestore.users.mapper.UserMapper;
import com.supera.gamestore.users.repository.UserRepository;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    private final UserMapper userMapper = UserMapper.INSTANCE;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    private UserDTOBuilder userDTOBuilder;

    @BeforeEach
    void setUp(){
        userDTOBuilder = UserDTOBuilder.builder().build();

    }

//    @Test
//    void whenNewUserIsInformedThenItShouldBeCreated(){
//        UserDTO expectedCreatedUserDTO = userDTOBuilder.buildUserDTO();
//        User expectedCreatedUser = userMapper.toModel(expectedCreatedUserDTO);
//        String expectedCreationMessage = "User username with ID 1 successfully created";
//        when(userRepository.save(expectedCreatedUser)).thenReturn(expectedCreatedUser);
//
//        MessageDTO creationMessage = userService.create(expectedCreatedUserDTO);
//
//        assertThat(expectedCreationMessage, Matchers.is(Matchers.equalTo(creationMessage.getMessage())));
//    }

}
