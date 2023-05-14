package br.com.bigfamous.Audios;

import br.com.bigfamous.BaseDosAudios.Audio;

public class Musica extends Audio {
    int duracao;
    String nomeDaMusica;
    String nomeDoArtista;
    String generoDoAudio;

    public int getDuracao(int i) {
        return duracao;
    }

    public String getNomeDaMusica(String nomeDaMusica) {
        return this.nomeDaMusica;
    }

    public String getNomeDoArtista(String next) {
        return nomeDoArtista;
    }

    public String getGeneroMusical(String next) {
        return generoDoAudio;
    }
    public Musica(String artista, int duracao, String nomeDaMusica, String generoMusical) {
        this.duracao = duracao;
        this.nomeDaMusica = nomeDaMusica;
        this.generoDoAudio = generoMusical;
        this.nomeDoArtista = artista;
    }

    @Override
    public String toString() {
        return "[Musica: "+nomeDaMusica + " - " +nomeDoArtista + " (" +duracao + " minutos, gênero: " +generoDoAudio +")]";
    }
}
