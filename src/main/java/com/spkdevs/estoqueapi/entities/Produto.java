package com.spkdevs.estoqueapi.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "valor")
    private BigDecimal valor;
}
