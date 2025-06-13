package org.segunda_prueba_tecnica.controllers;

import org.segunda_prueba_tecnica.dtos.AuthRequest;
import org.segunda_prueba_tecnica.dtos.AuthResponse;
import org.segunda_prueba_tecnica.services.AuthentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class LoginController {

    @Autowired
    private AuthentificationService authService;

    @PostMapping("auth/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest authRequest) {
        return ResponseEntity.ok(authService.authenticateUser(authRequest));
    }

}
