import java.util.Scanner;

public class ejercicio9 {public static void main(String[] args) {
    int Numero;
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa un número: ");
    Numero = input.nextInt();

    if(Numero % 3 == 0 && Numero % 5==0){
        System.out.println("FizzBuzz");
    }
    else if(Numero % 3 == 0){
        System.out.println("Fizz");
    }
    else if(Numero % 5 == 0){
        System.out.println("Buzz");
    }
    else{
        System.out.println("ni Fizz ni Buzz");
    }
}
}
