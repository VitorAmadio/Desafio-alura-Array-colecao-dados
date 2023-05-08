import br.com.deafio.alura.classes.CartaoCredito;
import br.com.deafio.alura.classes.Compra;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o limite do cartão ");
        double limite = ler.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limite);

        int continuarComprando = 1;
        while (continuarComprando != 0) {

            System.out.println("Digite o produto desejado ");
            String produto = ler.next();
            System.out.println("Digite o valor do produto");
            double valorProduto = ler.nextDouble();
            Compra compra = new Compra(produto, valorProduto);

            boolean validaCompra = cartao.lancaCompra(compra);
            if (validaCompra) {
                System.out.println("Compra realizada com sucesso");
                System.out.println("Deseja continuar comprando ? digite 1 para sim e 0 para não");

                continuarComprando = ler.nextInt();
            } else {
                System.out.println("Saldo insuficiente");
                continuarComprando = 0;
            }

        }
        for (Compra compra: cartao.getCompras()) {
            System.out.println(compra);
        }
        System.out.println("Saldo do cartão: R$ " + cartao.getSaldoCredito());
    }
}