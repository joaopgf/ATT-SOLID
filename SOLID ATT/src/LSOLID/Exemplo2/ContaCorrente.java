package LSOLID.Exemplo2;

public class ContaCorrente extends ContaBancaria implements ISacar {

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Teste (sem saldo)");
        }
        saldo -= valor;
    }
}
