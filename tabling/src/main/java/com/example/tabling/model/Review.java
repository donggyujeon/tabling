package com.example.tabling.model;
import import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Review {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(nullable = false, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String anonymous;

    @Column @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime revisionDate;

    @Column(name = "createDate") @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createDate = LocalDateTime.now();
}