package br.com.alura.screenmatch.domain.filme;

import jakarta.persistence.*;

//Entidade é uma classe que é também uma tabela no banco de dados

@Entity
@Table(name = "tb_filmes")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoLancamento;

    private Integer fk_genero;

    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.fk_genero = dados.fk_genero();
    }

    public Filme() {}

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", anoLancamento=" + anoLancamento +
                ", fk_genero='" + fk_genero + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }


    public Integer getFk_genero() {
        return fk_genero;
    }

    public Long getId() {
        return id;
    }

    public void atualizaDados(DadosAlteracaoFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.fk_genero = dados.fk_genero();
    }
}

