import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int calificacion;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un calificacion: ");
        calificacion = input.nextInt();

        if(calificacion > 100){
            System.out.println("calificacion invalida!");
        }
        else if(calificacion >= 60) {
            System.out.println("Usted paso");
        }
        else {
            System.out.println("Usted no paso");
        }
    }
}
