package org.segunda_prueba_tecnica.services;

import lombok.RequiredArgsConstructor;
import org.segunda_prueba_tecnica.dtos.AuthRequest;
import org.segunda_prueba_tecnica.dtos.AuthResponse;
import org.segunda_prueba_tecnica.feign.DummyJsonClient;
import org.segunda_prueba_tecnica.models.LoginLog;
import org.segunda_prueba_tecnica.repositorys.LoginLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthentificationService {

    @Autowired
    private DummyJsonClient dummyJsonClient;

    @Autowired
    private LoginLogRepository loginLogRepository;

    @Transactional
    public AuthResponse authenticateUser(AuthRequest authRequest) {

        ResponseEntity<AuthResponse> authResponse = dummyJsonClient.authenticate(authRequest);

        if (!authResponse.getStatusCode().is2xxSuccessful() || authResponse.getBody() == null) {
            throw new RuntimeException("Authentication failed");
        }

        loginLogRepository.save(new LoginLog(authResponse.getBody()));
        return authResponse.getBody();
    }

}