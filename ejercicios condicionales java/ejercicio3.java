import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int Numero1;
        Scanner input1 = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        Numero1 = input1.nextInt();

        int Numero2;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Ingresa el segundo número: ");
        Numero2 = input2.nextInt();

        if(Numero1 > Numero2){
            System.out.println("El numero 1 es mayor!");
        }
        else if(Numero1 == Numero2) {
            System.out.println("Los numeros son iguales");
        }
        else{
            System.out.println("el numero 2 es menor");
        }
    }
}
