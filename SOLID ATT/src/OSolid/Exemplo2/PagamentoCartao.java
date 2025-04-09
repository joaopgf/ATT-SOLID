package OSolid.Exemplo2;

public class PagamentoCartao implements IMetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " feito com cartao.");
    }
}
