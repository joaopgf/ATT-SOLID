package ISOLID.Exemplo2;

public class Main {
    public static void main(String[] args) {
        // Testando o carro
        ITerrestre carro = new Carro();
        carro.dirigir();

        // Testando o aviÃ£o
        IAereo aviao = new Aviao();
        aviao.voar();

        // Testando o barco
        IAquatico submarino = new Submarino();
        submarino.navegar();
    }
}
