import java.util.Scanner;

public class ControlDeAccesoCombinado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese si tiene pase especial ");
        boolean tienePaseEspecial = scanner.nextBoolean();

        if (edad >= 18 && tienePaseEspecial) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
