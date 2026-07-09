package com.uca.pncparcialfinalrestaurante.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(unique = true)
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @ManyToOne
    @JoinColumn(name="restaurante_id")
    private Restaurante restaurante;
}
