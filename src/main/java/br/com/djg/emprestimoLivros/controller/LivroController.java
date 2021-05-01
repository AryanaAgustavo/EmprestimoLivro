package br.com.djg.emprestimoLivros.controller;

import br.com.djg.emprestimoLivros.dominio.Livro;
import br.com.djg.emprestimoLivros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;

@RestController
public class LivroController {

    @Autowired
    LivroService livroService;

    @PostMapping("/livro")
    public void salvaLivro(@RequestBody Livro livro){
        livroService.salvaLivro(livro);
    }
}
