import java.util.Scanner;
public class atividade3{
public static void main(String[]args) {
    Scanner ler = new Scanner(System.in);

    int numero;

    System.out.println("Digite um número: ");
    numero = ler.nextInt();

    if(numero>-1 && numero<11){
        System.out.println("O número está entre 0 e 10");
    }
    else{
        System.out.println("O número não está entre 0 e 10");
    }
}
}