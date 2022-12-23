import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();
        int[] N = new int[1000];

// TODO: Implemente uma condição onde possamos preencher o vetor de N.
// Lembre-se a sequência de valores é de 0 até T-1:
        if (t >= 2 && t <= 50) {

            for (int i = 0; i < 1000; ) {
                for (int j = 0; j < t; j++) {

                    if (i < N.length) {
                        N[i] = j;
                    }

                    i++;
                }
            }
        }
        for (int i = 0; i < N.length; i++) {

            if ((i & 1) == 1)
            {
                System.out.println("ok");
            }

            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}