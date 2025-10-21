import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);


        while (true)
        {
            System.out.println("Dime dos numeros paras sumar:");
            int Num1=N.nextInt();
            int Num2=N.nextInt();

            DecirHola("Hola",Num1,Num2);
        }


    }

    public static void DecirHola(String a,int b, int c)
    {
        System.out.println(a);
        System.out.print("Su suma es:");
        System.out.println(b+c);
    }
}
