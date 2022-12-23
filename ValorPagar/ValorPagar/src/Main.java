// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        System.out.println("cod1");
        int cod1 = leitor.nextInt();
        System.out.println("n1");
        int n1 = leitor.nextInt();
        System.out.println("valor1");
        double valor1 = leitor.nextDouble();

        System.out.println("cod2");
        int cod2 = leitor.nextInt();
        System.out.println("n2");
        int n2 = leitor.nextInt();
        System.out.println("valor3");
        double valor2 = leitor.nextDouble();

// TODO: Implemente um Cálculo Simples.
// Levando em consideração a sua precedência de operadores e a definição de suas casas decimais:

        double total = (valor1*n1) + (valor2*n2);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }

}