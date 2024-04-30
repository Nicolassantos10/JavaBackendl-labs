import java.util.Scanner;

public class ControlDeAccesoAtracciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        System.out.println("Ingrese su altura");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("¿Esta acompañado? (si/no");
        String acompañado = scanner.nextLine();
        boolean acompañadoBool = "si".equalsIgnoreCase(acompañado);


    }
}
