package com.squad.cadastrousuarios.repositories;

import com.squad.cadastrousuarios.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
