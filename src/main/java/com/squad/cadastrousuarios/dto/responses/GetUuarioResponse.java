package com.squad.cadastrousuarios.dto.responses;

import com.squad.cadastrousuarios.entities.enuns.TipoUsuario;
import lombok.Data;

@Data
public class GetUuarioResponse {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private TipoUsuario tipoUsuario;
}
