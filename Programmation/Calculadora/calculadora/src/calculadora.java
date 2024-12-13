import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) throws Exception {
        variables variables = new variables();
        variables.main(args);
    }
}
class variables{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero 1 : ");
        double num1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduzca numero 2 : ");
        double num2 = sc.nextDouble();
        sc.nextLine();
        double resultado = 0;
    
        System.out.println("Calculando ...");

        double suma = suma(num1, num2);
        double resta = resta(num1, num2);
        double multiplicacion = multiplicacion(num1, num2);
        double division = division(num1, num2);
        System.out.print("Operation : ");
        int operation = sc.nextInt();
        sc.nextLine();

        switch (operation) {            
            case 1:
                System.out.println("Calculando ...");
                System.out.println(suma(num1, num2));
                break;
            case 2:
                resultado = resta(num1, num2);
                System.out.println("Calculando ...");
                System.out.println(resultado);
                break;
            case 3: 
                System.out.println("Calculando ...");
                System.out.println(resultado);
                resultado = multiplicacion(num1, num2);
                break;
            case 4: 
                resultado = division(num1, num2);
                System.out.println("Calculando ...");
                System.out.println(resultado);               
                break;
            default:
                System.out.println("Calculando ...");
                System.out.println("Operacion no valida");
                break;
        }
    
    }
           
    private static double suma(double num1, double num2){
        return num1 + num2;
    }
    private static double resta(double num1, double num2){
        return num1 - num2;
    }
    private static double multiplicacion(double num1, double num2){
        return num1 * num2;
    }
    private static double division(double num1, double num2){
        return num1 / num2;
    }   
}
