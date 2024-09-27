package br.com.lucazcortez.dispositivo;

import java.util.Scanner;
public interface ReprodutorMusical {

    void tocar (int numeroMusica);
    void pausar();
    int selecionarMusica (Scanner input);
    void adicionarMusica (String nome);
    void menu(Scanner input);



}