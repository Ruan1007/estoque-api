package com.spkdevs.estoqueapi.controllers;

import com.spkdevs.estoqueapi.controllers.models.ProdutoRequest;
import com.spkdevs.estoqueapi.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produtos")
    public ResponseEntity<?> getProdutos() {
        return ResponseEntity.ok(produtoService.listarTodosProdutos());
    }

    @PostMapping("/cadastrar-produto")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoRequest request) {
        var response = produtoService.cadastrar(request);
        return ResponseEntity.ok(response);
    }
}
