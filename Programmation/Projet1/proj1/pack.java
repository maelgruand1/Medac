import java.util.Scanner;
public class pack {
    public static void main(String[] args) {
        User.main(args);
    }
}
class User {
    private static String pedirNombre(Scanner input, String nombre) {
        nombre = input.nextLine();
        return nombre;
    }
    private static int pedirEdad(Scanner input) {
        int edad = input.nextInt();
        return edad;
    }
    // verificar la edad
    private static int verificarEdad(int age) {
        if (age >= 18) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        String nombre = pedirNombre(scanner, "");
        System.out.print("Introduzca su edad: ");
        int edad = pedirEdad(scanner);
        int resultado = verificarEdad(edad);
        if (resultado == 1) {
            System.out.println(nombre + ", Eres mayor de edad.");
        } else {
            System.out.println(nombre +  ", Eres menor de edad.");
        }
    }
}
