package com.spkdevs.estoqueapi.controllers.mappers;

import com.spkdevs.estoqueapi.controllers.models.ProdutoRequest;
import com.spkdevs.estoqueapi.controllers.models.ProdutoResponse;
import com.spkdevs.estoqueapi.entities.Produto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    Produto toEntity(ProdutoRequest request);

    ProdutoResponse toResponse(Produto produto);
}
