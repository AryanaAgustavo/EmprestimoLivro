package br.com.djg.emprestimoLivros.service;

import br.com.djg.emprestimoLivros.dominio.Livro;
import br.com.djg.emprestimoLivros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    LivroRepository livroRepository;

    public void salvaLivro(Livro livro){
        livroRepository.save(livro);
    }
}
