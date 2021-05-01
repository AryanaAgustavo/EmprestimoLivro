package br.com.djg.emprestimoLivros.repository;

import br.com.djg.emprestimoLivros.dominio.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
