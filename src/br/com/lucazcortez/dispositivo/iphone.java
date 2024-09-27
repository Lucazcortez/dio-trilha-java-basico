package br.com.lucazcortez.dispositivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class iphone extends AparelhoTelefonico {

    private final List<String> musicas = new ArrayList<>();
    private final List<String> abasAbertas = new ArrayList<>();

    int musicaAtual = 0;
    private String paginaAtual ="";

    @Override
    public void ligar (String numero) {
        super.ligar(numero);

    }
    public void atender(){
        super.atender();
    }

    @Override
    public void exibirPagina(String nomePaginaWeb) {
        System.out.println(nomePaginaWeb);

    }

    @Override
    public void adicionarNovaAba(String nomepaginaWeb) {
        exibirPagina(nomepaginaWeb);

    }

    @Override
    public void atualizarPagina() {
        System.out.println("""
                -----------------
                Atualizando
                """);
        System.out.println(paginaAtual);

    }

    @Override
    public void exibirAbasAbertas() {
        for (String aba : abasAbertas) {
            if (!aba.equals(paginaAtual)){
                System.out.printf(aba);
            }
        }

    }

    @Override
    public void tocar(int numeroMusica) {
        System.out.println("Musica: " + musicas.get(numeroMusica));
    }

    @Override
    public void pausar() {
        System.out.println("Musica: " + musicas.get(musicaAtual));

    }

    @Override
    public int selecionarMusica(Scanner input) {
        System.out.printf("%s", """
                ESCOLHA UMA MUSICA
                """);

        for (int i = 0; i < musicas.size(); i++) {
            System.out.printf("%d -> %s%n", i, musicas.get(i));
        }

        System.out.println("Escolha: ");
        return input.nextInt();
    }

    @Override
    public void adicionarMusica(String nome) {
        musicas.add(nome);
    }

    @Override
    public void menu(Scanner input) {

    }


    public void internetMenu(Scanner input) {
        boolean running = true;

        do {
            System.out.printf("%s", """
                     ================
                     Seja bem vindo ao navegador
                     ================
                     1 - Exibir Pagina Web
                     2 - Adicionar nova Aba
                     3 - Atualizar Pagina
                     4 - Abas Abertas
                     5 - sair 
                     """);
            System.out.println("ESCOLHA:  ");
            int opcInput = input.nextInt();

            switch(opcInput) {
                case 1:
                    System.out.println("Insira o nome da página web: ");
                    input.nextLine();
                    String nomePagina = input.nextLine();
                    exibirPagina(nomePagina);
                    break;
                case 2:
                    System.out.println("Insira o nome da página web: ");
                    input.nextLine();
                    String novaPagina = input.nextLine();
                    adicionarNovaAba(novaPagina);
                    break;
                case 3:
                    atualizarPagina();
                    break;
                case 4:
                    exibirAbasAbertas();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    running = false;
                    break;

                default:
                    System.out.println("Selecione uma opção válida.");
                    break;
            }


        }while(running);

    }
}