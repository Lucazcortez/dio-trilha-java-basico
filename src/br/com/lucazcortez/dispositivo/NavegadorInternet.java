package br.com.lucazcortez.dispositivo;

import java.util.Scanner;
public interface NavegadorInternet {

    void exibirPagina (String url);
    void adicionarNovaAba (String url);
    void atualizarPagina();
    void exibirAbasAbertas();

}
