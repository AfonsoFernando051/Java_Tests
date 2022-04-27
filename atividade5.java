import java.util.Scanner;
public class atividade5{
public static void main(String[]args) {

    Scanner ler = new Scanner(System.in);

    char letra;

    System.out.println("Digite um letra: ");
    letra = ler.next().charAt(0);

    if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
        System.out.printf("A letra é uma vogal");
    }
    else{
        System.out.printf("A letra é uma consoante");
    }    
}
}