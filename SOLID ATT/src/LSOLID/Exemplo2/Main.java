package LSOLID.Exemplo2;

public class Main {
    public static void main(String[] args) {
        // Pode sacar
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(100);
        cc.sacar(90);
        System.out.println("Saldo da conta corrente: " + cc.getSaldo());

        // Nao pode sacar
        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(10);
        System.out.println("Saldo da conta poupança: " + cp.getSaldo());
        if (cp instanceof ISacar) {
            ((ISacar) cp).sacar(0); // nao funciona, pois nao tem como sacar da conta poupança
        } else {
            System.out.println("Conta poupança não pode sacar");
        }
    }
}
