package com.squad.cadastrousuarios.dto.requests;

import com.squad.cadastrousuarios.entities.enuns.TipoUsuario;
import lombok.Data;

@Data
public class GetUsuarioRequest {

    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private TipoUsuario tipoUsuario;
}
