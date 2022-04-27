import java.util.Scanner;
public class atividade6{
public static void main(String[]args) {

    Scanner ler = new Scanner(System.in);

    int numero;
    int result;

    System.out.println("Digite um número: ");
    numero = ler.nextInt();

    if(numero > 0){
        System.out.printf("O número é: %d", numero);
    }
    else{
        result = numero*-1;
        System.out.printf("O número é: %d", result);
    }    
}
}
