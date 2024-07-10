package com.example.tabling.model;
import import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Favorite {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long FavoriteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

}