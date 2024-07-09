package com.example.tabling.model;
import import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

    @Column(columnDefinition = "TEXT")
    private String request;

    @Column(nullable = false)
    private int persons;

    @Column(nullable = false)
    private String bookStatus;

    @Column @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime bookRedate;

    @Column(name = "bookDate") @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime bookDate = LocalDateTime.now();
}