package br.com.bigfamous.DadosDosApresentadores;


public class Artista {
    String nome;
    String generoDoAudio;
    int musicasSalvas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGeneroDoAudio() {
        return generoDoAudio;
    }

    public int getMusicasSalvas() {
        return musicasSalvas;
    }

    public Artista(String nome, String generoDoAudio) {
        this.nome = nome;
        this.generoDoAudio = generoDoAudio;
    }

    //preciso criar metodo adiciona musica
    public Artista() {
        this.musicasSalvas = musicasSalvas;
    }
}
