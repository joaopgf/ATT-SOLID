package SSolid.Exemplo2;

public class MainEncomenda {
    public MainEncomenda() {
    }

    public static void main(String[] args) {
        ProcessadorEncomendas processador1 = new ProcessadorEncomendas();
        ProcessarEncomendas processador2 = new ProcessarEncomendas();
        //processador1.processar();
        processador2.processar();
    }
}