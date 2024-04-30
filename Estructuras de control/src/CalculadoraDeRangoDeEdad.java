import java.util.Scanner;

public class CalculadoraDeRangoDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Infancia.");
        } else if (edad >= 13 && edad <= 19) {
            System.out.println("Adolescencia.");
        } else if (edad >= 20 && edad <= 64) {
            System.out.println("Adultez.");
        } else {
            System.out.println("Vejez.");
        }
        scanner.close();
    }
}