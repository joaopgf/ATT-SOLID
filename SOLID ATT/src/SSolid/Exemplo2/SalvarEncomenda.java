package SSolid.Exemplo2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SalvarEncomenda {
    public static void salvarArquivo(String idEncomenda, double valorFrete) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("encomendas.txt", true))) {
                bw.write("ID: " + idEncomenda + " - Frete: " + valorFrete);
                bw.newLine();
                System.out.println("Salvo no arquivo encomendas.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
