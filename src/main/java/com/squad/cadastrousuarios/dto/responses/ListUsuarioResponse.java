package com.squad.cadastrousuarios.dto.responses;

import com.squad.cadastrousuarios.entities.enuns.TipoUsuario;
import lombok.Data;

@Data
public class ListUsuarioResponse {

    private Long id;
    private String nome;
    private String email;
    private TipoUsuario tipoUsuario;
}
