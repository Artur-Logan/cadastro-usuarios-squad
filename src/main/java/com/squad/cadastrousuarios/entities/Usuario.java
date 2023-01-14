package com.squad.cadastrousuarios.entities;

import com.squad.cadastrousuarios.entities.enuns.TipoUsuario;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Usuario {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private TipoUsuario tipoUsuario;
}
