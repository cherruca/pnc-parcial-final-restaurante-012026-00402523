package com.uca.pncparcialfinalrestaurante.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario cliente;

    @ManyToOne
    private Mesa mesa;

    @ManyToMany
    private List<Producto> productos;

    @Enumerated(EnumType.STRING)
    private EstadoPedido estado;
}
