import java.util.Scanner;
public class ejercico2 {
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un edad: ");
        edad = input.nextInt();

        if(edad >= 18){
            System.out.println("Uestd es mayor!");
        }
        else {
            System.out.println("Usted es menor");
        }
    }
}