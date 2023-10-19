public class IPhone implements Telefone, NavegadorInternet, Reprodutor {

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }
    @Override
    public void ligar() {
        System.out.println("Ligando o telefone.");
    }
    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web.");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba de navegação.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página da web.");
    }

    public static void main(String[] args) {
        IPhone primeiroIphone = new IPhone();
        System.out.println("O Iphone está: ");
        primeiroIphone.adicionarNovaAba();
        primeiroIphone.exibirPagina();
        primeiroIphone.atender();
        primeiroIphone.ligar();
        primeiroIphone.atualizarPagina();
        primeiroIphone.pausar();
        primeiroIphone.iniciarCorreioVoz();
        primeiroIphone.tocar();
        primeiroIphone.selecionarMusica();
    }
}

