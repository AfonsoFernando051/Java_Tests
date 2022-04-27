import java.util.Scanner;
public class atividade4{
public static void main(String[]args) {

    Scanner ler = new Scanner(System.in);

    int numero1;
    int numero2;
    int numero3;


    System.out.println("Digite um número: ");
    numero1 = ler.nextInt();

    System.out.println("Digite um número: ");
    numero2 = ler.nextInt();

    System.out.println("Digite um número: ");
    numero3 = ler.nextInt();

    if(numero3 > numero2 && numero3 > numero1)
    {
        System.out.printf("O número 3 é maior");
    }
    else 
    {
        if (numero2 > numero3 && numero2 > numero1)
        {
            System.out.printf("O número 2 é maior");
        }
        else
        {
            if(numero1 > numero3 && numero1 > numero2)
            {
                System.out.printf("O número 1 é maior");
            }
        } 
    }
}
}