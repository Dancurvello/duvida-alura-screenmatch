package br.com.alura.screenmatch.domain.filme;

public record DadosAlteracaoFilme(Long id, String nome, Integer ano, Integer duracao, Integer fk_genero) {
}
