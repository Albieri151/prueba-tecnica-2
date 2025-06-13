package org.segunda_prueba_tecnica.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.segunda_prueba_tecnica.dtos.AuthResponse;

import java.time.LocalDateTime;

@Entity
@Table(name = "login_log")
@NoArgsConstructor
@AllArgsConstructor
public class LoginLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Column(name = "login_time")
    private LocalDateTime loginTime;

    @Column(name = "access_token", length = 800)
    private String accessToken;

    @Column(name = "refresh_token", length = 800)
    private String refreshToken;

    public LoginLog(AuthResponse user) {
        this.username = user.username();
        this.loginTime = LocalDateTime.now();
        this.accessToken = user.accessToken();
        this.refreshToken = user.refreshToken();
    }

}
