import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        int Numero1;
        Scanner input1 = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        Numero1 = input1.nextInt();

        int Numero2;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Ingresa el segundo número: ");
        Numero2 = input2.nextInt();

        int Numero3;
        Scanner input3 = new Scanner(System.in);
        System.out.print("Ingresa el segundo número: ");
        Numero3 = input3.nextInt();

        if(Numero1 > Numero2 &&  Numero1 > Numero3  ){
            System.out.println("El numero 1 es mayor!");
            System.out.println(Numero1);
        }
        else if(Numero2 > Numero1 && Numero2 > Numero3) {
            System.out.println("Los numeros 2 es mayor:");
            System.out.println(Numero2);
        }
        else{
            System.out.println("el numero 3 es menor");
            System.out.println(Numero3);
        }
    }
}

