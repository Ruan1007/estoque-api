package com.spkdevs.estoqueapi.services;

import com.spkdevs.estoqueapi.controllers.mappers.ProdutoMapper;
import com.spkdevs.estoqueapi.controllers.models.ProdutoRequest;
import com.spkdevs.estoqueapi.controllers.models.ProdutoResponse;
import com.spkdevs.estoqueapi.entities.Produto;
import com.spkdevs.estoqueapi.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ProdutoMapper mapper;

    public List<ProdutoResponse> listarTodosProdutos() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos.stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    public ProdutoResponse cadastrar(ProdutoRequest request) {
        var produto = mapper.toEntity(request);
        produto = produtoRepository.save(produto);
        return mapper.toResponse(produto);
    }
}
