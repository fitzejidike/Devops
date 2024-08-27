package com.example.demo.controller;

import com.example.demo.dto.request.RegisterRequest;
import com.example.demo.dto.response.ApiResponse;
import com.example.demo.service.UserService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor(access = AccessLevel.PRIVATE)

public class UserController {
    private final UserService userService;
    @PostMapping
    public ResponseEntity<?> register(@RequestBody RegisterRequest request){
        return ResponseEntity.status(CREATED)
                .body(new ApiResponse(userService.register(request),true));

    }
}
