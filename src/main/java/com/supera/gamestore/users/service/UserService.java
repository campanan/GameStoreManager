package com.supera.gamestore.users.service;

import com.supera.gamestore.exceptions.UserAlreadyExistsException;
import com.supera.gamestore.users.dto.MessageDTO;
import com.supera.gamestore.users.dto.UserDTO;
import com.supera.gamestore.users.entity.User;
import com.supera.gamestore.users.mapper.UserMapper;
import com.supera.gamestore.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UserService {

    private final static UserMapper userMapper = UserMapper.INSTANCE;

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public MessageDTO create(UserDTO userToCreateDTO){

        verifyIfExists(userToCreateDTO.getEmail(), userToCreateDTO.getUsername());
        User userToCreate = userMapper.toModel(userToCreateDTO);
        User createdUser = userRepository.save(userToCreate);

        return creationMessage(createdUser);
    }

    private void verifyIfExists(String email, String username) {
        Optional<User> foundUser = userRepository.findByEmailOrUsername(email, username);

        if(foundUser.isPresent()){
            throw new UserAlreadyExistsException(email, username);
        }
    }

    private MessageDTO creationMessage(User createdUser) {
        String createdUsername = createdUser.getUsername();
        Long createdId = createdUser.getId();
        String createdUserMessage = String.format("User %s with ID %s successfully created", createdUsername, createdId);
        return MessageDTO.builder()
                .message(createdUserMessage)
                .build();
    }
}
