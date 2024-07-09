package com.example.tabling.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;

    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long storeUnique;

    @Column(nullable = false)
    private String storeName;

    @Column
    private String storeCategory;

    @Column
    private String storeNumber;

    @Column
    private int storeFavorites;
}
