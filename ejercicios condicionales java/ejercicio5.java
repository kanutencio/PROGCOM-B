import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        int Numero;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        Numero = input.nextInt();

        if(Numero %2 == 0){
            System.out.println("El numero es par!");
        }
        else {
            System.out.println("el numero es inpar");
        }
    }
}
