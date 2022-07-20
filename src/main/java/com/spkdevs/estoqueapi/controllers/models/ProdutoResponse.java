package com.spkdevs.estoqueapi.controllers.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProdutoResponse {
    private Long id;

    private String nome;

    private String codigo;

    private Integer quantidade;

    private BigDecimal valor;
}
