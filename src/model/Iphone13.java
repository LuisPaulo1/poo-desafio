package model;

public class Iphone13 implements Iphone {
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz do iPhone");
    }

    @Override
    public void exibirPaginar() {
        System.out.println("Exibindo página no iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no iPhone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iPhone");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Selecionando música " + nomeMusica + " no iPhone");
    }
}
