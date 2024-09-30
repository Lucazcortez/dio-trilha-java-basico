package br.com.lucazcortez.dispositivo;

public interface NavegadorInternet {

    void exibirPagina (String url);
    void adicionarNovaAba (String url);
    void atualizarPagina();
    void exibirAbasAbertas();

}
