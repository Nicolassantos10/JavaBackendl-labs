import java.util.Scanner;

public class InteractivecCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        //crea una instancia de Scanner

        // solicitar al usuario el segundo numero
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        //cerrar scanner
        scanner.close();
        int resultado = sumar(num1, num2);
        System.out.println("La suma es: " + num1 + " + " + num2 + " = " + resultado);
    }
        public static int sumar (int num1, int num2) {
            return num1 + num2;


    }
}
