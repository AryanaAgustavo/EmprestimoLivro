package br.com.djg.emprestimoLivros.dominio;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Emprestimo {

    @Id
    @GeneratedValue
    private Long idEmprestimo;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idLivro")
    private Livro livro;

    private LocalDate dataEmprestimo;

    private LocalDate dataDevolucao;

    public Long getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) throws Exception {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao){
        if (dataDevolucao.isBefore(dataEmprestimo) || dataDevolucao.isEqual(dataEmprestimo)){
            throw new IllegalArgumentException("Data de devolução inválida. A data de devolução deve ser depois da data de empréstimo. ");
        } else {
            this.dataDevolucao = dataDevolucao;
        }
    }

    @Override
    public String toString() {
        return "Emprestimo salvo com sucesso: " +
                "\n idEmprestimo: " + idEmprestimo +
                "\n Usuário: " + usuario.getNomeCompleto() +
                "\n Livro: " + livro.getNome() + ", " + livro.getAutor();
    }
}
