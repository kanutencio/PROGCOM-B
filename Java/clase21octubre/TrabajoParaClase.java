import java.util.Scanner;

public class TrabajoParaClase {
    public static void main(String[] args) {
        /*System.out.println("Hola Mundo!");
        int Edad = 19;
        double Estatura = 1.83;
        boolean MayorEdad = true;
        String Nombre = "Alejamdro";
        final String Correo = "apradilla793@unab.edu.co";
        System.out.println(Correo);
        var Apellido = "Pradilla";
        System.out.println(Apellido);*/
        Ejercicios();

    }

    public static void Ejercicios()
    {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Cual es su Nombre: ");
        String Nombre=Scan.next();
        System.out.println("Cual es su Apellido: ");
        String Apellido=Scan.next();
        System.out.println("La primera etra de su nombre es: ");
        char Primera=Nombre.charAt(0);
        System.out.println(Nombre + " " + Apellido);
        int Edad = Scan.nextInt();
        double Estatura = Scan.nextDouble();
        System.out.println("Su Edad es: " + Edad + " Su Estatura es: " + Estatura);

        boolean MayorEdad;
        if(Edad>18)
        {
            MayorEdad=true;
            System.out.println("Eres mayor de edad");
        }
        else
        {
            MayorEdad=false;
            System.out.println("Eres menor de edad");
        }
        System.out.println("Eso es todo amigos");


    }
}
