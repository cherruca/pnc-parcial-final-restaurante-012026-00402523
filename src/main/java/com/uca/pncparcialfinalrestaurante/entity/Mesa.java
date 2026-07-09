package com.uca.pncparcialfinalrestaurante.entity;

import jakarta.persistence.*;

@Entity
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer capacidad;

    @Enumerated(EnumType.STRING)
    private EstadoMesa estado;

    @ManyToOne
    private Restaurante restaurante;
}
