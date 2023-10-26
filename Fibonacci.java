// package pacote;

import java.util.Scanner;

public class Fibonacci {
    
    public static void fiboFor(int qtdRotacoes) {

        int primeiro = 0;
        int segundo = 1;

        for(int i = qtdRotacoes; i != 0; i--) {

            int calculoFibo = primeiro + segundo;

            System.out.printf("%d, ", primeiro);

            primeiro = segundo;
            segundo = calculoFibo;

            // if(i == qtdRotacoes) {
            //     System.out.printf("0, %d, ", primeiro);
            // }else if(i == 1) {
            //     System.out.print(primeiro);
            // }else {
            //     System.out.print(primeiro + ", ");
            // }

        }
        
        System.out.print(primeiro);

    }

    public static void fiboRecursiva(int primeiro, int segundo, int qtdRotacoes) {

        if(qtdRotacoes != 0) {     

            qtdRotacoes--;
            int calculoFibo = primeiro + segundo;
            
            System.out.print(primeiro + ", ");
            fiboRecursiva(primeiro = segundo, segundo = calculoFibo, qtdRotacoes);

        }else {
            System.out.print(primeiro);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\033\143");
        System.out.printf("Digite o número: ");
        int NumeroDeVezes = Integer.parseInt(sc.nextLine());
        
        System.out.print("\033\143");
        System.out.println("Sequência de Fibonacci, forma 1:");
        fiboFor(NumeroDeVezes);

        System.out.println("\n");

        System.out.println("Sequência de Fibonacci, forma 2:");
        fiboRecursiva(0, 1, NumeroDeVezes);

        sc.close();
    }

}
