package com.example.tabling.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String username;

    @Column
    private String number;

    @Column(name = "joinDate") @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime joinDate = LocalDateTime.now();
}