import java.util.Scanner;

public class ComprobadorDePase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu calificación: ");
        double calificacion = scanner.nextDouble();

        if (calificacion >= 5.0) {
            System.out.println("¡Felicidades! Has aprobado.");
        } else {
            System.out.println("Lo siento, no has aprobado.");
        }
        scanner.close();
    }
}