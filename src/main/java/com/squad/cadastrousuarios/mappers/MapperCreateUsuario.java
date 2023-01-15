package com.squad.cadastrousuarios.mappers;

import com.squad.cadastrousuarios.dto.requests.CreateUsuarioRequest;
import com.squad.cadastrousuarios.entities.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperCreateUsuario {

    Usuario toEntity(CreateUsuarioRequest request);
    CreateUsuarioRequest toResponse(Usuario usuario);
}

