package br.com.djg.emprestimoLivros.repository;

import br.com.djg.emprestimoLivros.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> { }
