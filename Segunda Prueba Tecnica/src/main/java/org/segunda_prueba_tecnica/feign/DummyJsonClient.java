package org.segunda_prueba_tecnica.feign;

import org.segunda_prueba_tecnica.dtos.AuthRequest;
import org.segunda_prueba_tecnica.dtos.AuthResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "dummyJsonClient", url = "https://dummyjson.com")
public interface DummyJsonClient {

    @PostMapping(value = "/auth/login", consumes = "application/json")
    ResponseEntity<AuthResponse> authenticate(@RequestBody AuthRequest authRequest);

    @GetMapping("/auth/me")
    ResponseEntity<AuthResponse> getCurrentUser(@RequestHeader("Cookie") String cookie);

    @GetMapping("/users")
    ResponseEntity<List<AuthResponse>> getUsers();
}
