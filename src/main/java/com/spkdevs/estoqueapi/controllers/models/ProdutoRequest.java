package com.spkdevs.estoqueapi.controllers.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProdutoRequest {
    private String nome;

    private String codigo;

    private Integer quantidade;

    private BigDecimal valor;
}
