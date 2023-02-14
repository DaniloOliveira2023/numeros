import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros;
        int maior ;
        int menor ;
        System.out.print("Informe o número:");
        numeros = input.nextInt();

        maior=menor=numeros;

        do{
            if(maior<numeros){
                maior = numeros;
            }

            if (menor>numeros) {
                menor = numeros;
            }

            System.out.print("Informe o número:");
            numeros = input.nextInt();

        }while(numeros!=0);
        System.out.println ("O maior número foi:" +maior);
        System.out.println("O menor número foi:" +menor);
    }

}