package br.com.bigfamous.DadosDosApresentadores;

public class Apresentador {
    String nome;
    String descricaoSobreApresentador;

    public Apresentador(String nome, String descricaoSobreApresentador) {
        this.nome = nome;
        this.descricaoSobreApresentador = descricaoSobreApresentador;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricaoSobreApresentador() {
        return descricaoSobreApresentador;
    }
}
