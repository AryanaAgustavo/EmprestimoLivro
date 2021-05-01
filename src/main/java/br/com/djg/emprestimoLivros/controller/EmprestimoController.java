package br.com.djg.emprestimoLivros.controller;

import br.com.djg.emprestimoLivros.dominio.Emprestimo;
import br.com.djg.emprestimoLivros.service.EmprestimoService;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmprestimoController {

    @Autowired
    EmprestimoService emprestimoService;

    @PostMapping("/emprestimo")
    public void salvaEmprestimo(@RequestBody Emprestimo emprestimo){
        emprestimoService.salvaEmprestimo(emprestimo);
    }
}
