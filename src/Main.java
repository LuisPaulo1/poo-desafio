import model.*;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone13();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPaginar();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Musica 1");

    }
}