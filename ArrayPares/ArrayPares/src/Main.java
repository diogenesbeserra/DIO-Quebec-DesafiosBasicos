// Abaixo segue um exemplo de código que você pode ou não utilizar:

public class Main {
    public static void main(String[] args){

// TODO: Crie um Array de números inteiros utilizando o Array da entrada no enunciado:
        int[] entregas = {2, 3, 5, 7, 11, 13, 18, 34};

// TODO: Implemente um laço de repetição que verifique APENAS seus números Pares:
        for (int i = 0; i < entregas.length; i++) {
            if (entregas[i] % 2 == 0) {
                System.out.println(entregas[i]);
            }
        }
    }
}