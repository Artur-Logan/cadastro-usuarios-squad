package com.squad.cadastrousuarios.services;

import com.squad.cadastrousuarios.dto.responses.GetUsuarioResponse;
import com.squad.cadastrousuarios.entities.Usuario;
import com.squad.cadastrousuarios.mappers.MapperGetUsuario;
import com.squad.cadastrousuarios.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class GetUsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final MapperGetUsuario mapperGetUsuario;

    public GetUsuarioResponse getUsuarioResponse(Long id){
        log.info("Entrada no metodo GetUsuarioResponse");
        log.info("Inicio da busca do usuario: ");

        Usuario usuario = usuarioRepository
                .findById(id)
                .get();

        log.info("Usuario obtido: " + usuario.toString());
        log.info("Fim da busca do usuario.");

        log.info("retorno do usuario usando mapper");
        return mapperGetUsuario.toResponse(usuario);
    }
}
