package br.com.djg.emprestimoLivros.service;

import br.com.djg.emprestimoLivros.dominio.Usuario;
import br.com.djg.emprestimoLivros.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void salvaUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
