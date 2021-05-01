package br.com.djg.emprestimoLivros.repository;

import br.com.djg.emprestimoLivros.dominio.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}
