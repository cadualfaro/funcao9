/*
Atividade 1

Implemente uma função recursiva que retorna o fatorial de um número
 */
package funcao9;
import java.util.Scanner;
    public class Funcao9 {
        static int fatorial(int n){
            if(n == 0) //condição de parada da função
                return 1; //retorno caso o valor de n seja 0
            
    return n*fatorial(n-1); //retorno caso n seja diferente de 0, que calcula o fatorial da variavel digitada na main
}

    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in); //cria o scanner que irá receber o valor digitado
        
        System.out.println("Digite um valor inteiro para calcular seu fatorial: ");
        int fator = my_scan.nextInt(); // o scanner recebe o valor digitado
        
        System.out.printf("\nO fatorial de %d e: ", fator); //introduz o resultado
        System.out.println("\n"+ fatorial(fator)); //mostra o resultado chamando a função com a variavel que recebeu o valor digitado
    }
}
