import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int año;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el año a evaluar: ");
        año = input.nextInt();

        if(año % 4 == 0 && año % 100 != 0){
            System.out.println("El año es bisiesto!");
        }
        else {
            if(año % 400 == 0){
                System.out.println("El año es bisiesto!");
            }
            else{
                System.out.println("El año es no es bisiesto!");
            }
        }
    }
}
