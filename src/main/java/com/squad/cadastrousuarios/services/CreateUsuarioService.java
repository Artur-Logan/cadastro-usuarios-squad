package com.squad.cadastrousuarios.services;

import com.squad.cadastrousuarios.dto.requests.CreateUsuarioRequest;
import com.squad.cadastrousuarios.dto.responses.CreateUsuarioResponse;
import com.squad.cadastrousuarios.entities.Usuario;
import com.squad.cadastrousuarios.mappers.MapperCreateUsuario;
import com.squad.cadastrousuarios.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateUsuarioService {

    private static final String MENSAGEM_REGISTRO_SUCESSO = "Registrado com sucesso";

    private final UsuarioRepository usuarioRepository;
    private final MapperCreateUsuario mapperCreateUsuario;

    public CreateUsuarioResponse createUsuarioResponse (CreateUsuarioRequest createUsuarioRequest){
        log.info("Iniciando o metodo CreateUsuarioResponse.");
        Usuario usuario = mapperCreateUsuario.toEntity(createUsuarioRequest);

        log.info("Salvando o usuario no banco de dados.");
        usuarioRepository.save(usuario);
        log.info("Usuario salvo no banco de dados.");
    }
}
