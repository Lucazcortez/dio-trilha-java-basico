package br.com.lucazcortez.dispositivo;

import br.com.lucazcortez.dispositivo.ReprodutorMusical;
import br.com.lucazcortez.dispositivo.NavegadorInternet;

import java.util.Scanner;

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
