package br.com.djg.emprestimoLivros.service;

import br.com.djg.emprestimoLivros.dominio.Emprestimo;
import br.com.djg.emprestimoLivros.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {

    @Autowired
    EmprestimoRepository emprestimoRepository;

    public void salvaEmprestimo(Emprestimo emprestimo){
        emprestimoRepository.save(emprestimo);
    }
}
