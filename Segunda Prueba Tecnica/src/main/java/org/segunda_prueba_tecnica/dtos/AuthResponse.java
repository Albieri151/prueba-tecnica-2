package org.segunda_prueba_tecnica.dtos;

public record AuthResponse(
        Long id,
        String username,
        String email,
        String firstName,
        String lastName,
        String gender,
        String image,
        String accessToken,
        String refreshToken
) {
}