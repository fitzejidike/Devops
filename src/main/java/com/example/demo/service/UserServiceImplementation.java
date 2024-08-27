package com.example.demo.service;

import com.example.demo.data.model.User;
import com.example.demo.data.repository.UserRepository;
import com.example.demo.dto.request.RegisterRequest;
import com.example.demo.dto.response.RegisterResponse;
import com.example.demo.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation  implements UserService{
    public final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        User user = new User();
        if (user != null) {
            throw new UserNotFoundException("User not found");
        }
        user.setUsername(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        userRepository.save(user);
        RegisterResponse response = new RegisterResponse();
        response.setUsername(registerRequest.getUsername());
        response.setMessage("Registered successfully");
        return response;

    }

}
