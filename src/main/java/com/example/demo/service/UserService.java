package com.example.demo.service;

import com.example.demo.dto.request.RegisterRequest;
import com.example.demo.dto.response.RegisterResponse;

public interface UserService {
    RegisterResponse register(RegisterRequest registerRequest);
}
