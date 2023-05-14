package br.com.bigfamous.Playlist;


import br.com.bigfamous.Audios.Musica;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Play {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String menu = """
        Escolha o que adicionar:
        1-Musica
        2-Podcast
        """;
        System.out.println(menu);
        System.out.println("Digite a opção desejada: ");
        int operacao = sc.nextInt();


        List<Musica> playlistMusica = new LinkedList<>();

        while (operacao ==1) {
            if (operacao == 1) {
                System.out.println("Nome da música adicionada: ");
                String nomeDaMusica = sc.next();
                sc.nextLine();

                System.out.println("Duracao da música: ");
                int duracaoDaMusica = sc.nextInt();

                System.out.println("Nome do artista: ");
                String artista = sc.next();
                sc.nextLine();

                System.out.println("Gênero musical");
                String generoDoAudio = sc.next();

               Musica musicaNova = new Musica(artista,
                        duracaoDaMusica,
                        nomeDaMusica,
                        generoDoAudio);

                System.out.println(musicaNova);

                playlistMusica.add(musicaNova);
                System.out.println("Musicas adicionadas: " +playlistMusica);

                menu = """
                        Digite '1' para adionar mais músicas
                        Digite '2' para sair
                        """;
                System.out.println(menu);
                sc.nextLine();
                operacao = sc.nextInt();

            }
        }




    }
}



