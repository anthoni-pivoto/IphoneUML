package iphone.reprodutor;

import java.sql.SQLOutput;

public class Ipod implements ReprodutoMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecioando musica");
    }
}
