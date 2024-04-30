import java.util.Scanner;

public class ControlDeAcceso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad");

        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Tienes acceso al evento");

        } else {
            System.out.println("No tienes acceso al evento.");

        }
        scanner.close();
    }
}
