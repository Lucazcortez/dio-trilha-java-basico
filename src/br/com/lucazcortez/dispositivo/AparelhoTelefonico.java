package br.com.lucazcortez.dispositivo;

public abstract class AparelhoTelefonico implements NavegadorInternet, ReprodutorMusical {

    void ligar (String numero) {
        System.out.printf("""
    --------------------
    LIGANDO ....
    NÚMERO: %s
    --------------------
    """, numero);
    }


    void atender(){
        System.out.println("""
               ATENDENDENDO, CHAMADA....
                """);
    }
    public void iniciarCorreioVoz(){
        System.out.println("""
                -----------------------
                iniciando correio de voz
                ----------------------
                """);
    }

}
