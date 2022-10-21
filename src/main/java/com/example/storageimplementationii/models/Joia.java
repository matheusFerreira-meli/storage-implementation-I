package com.example.storageimplementationii.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "joia")
public class Joia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 150, nullable = false, unique = true)
    private String material;

    @Column(nullable = false)
    private double peso;

    @Column(nullable = false)
    private int kilates;
}
