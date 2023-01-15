package com.squad.cadastrousuarios.mappers;

import com.squad.cadastrousuarios.dto.responses.GetUsuarioResponse;
import com.squad.cadastrousuarios.entities.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperGetUsuario {

    GetUsuarioResponse toResponse(Usuario usuario);
}
