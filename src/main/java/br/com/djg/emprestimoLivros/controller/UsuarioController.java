package br.com.djg.emprestimoLivros.controller;

import br.com.djg.emprestimoLivros.dominio.Usuario;
import br.com.djg.emprestimoLivros.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario")
    public void salvaUsuario(@RequestBody Usuario usuario){
        usuarioService.salvaUsuario(usuario);
    }
}
