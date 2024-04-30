import java.util.Scanner;

public class ControlDeAccesoConContrasena {
    public static void main(String[] args) {
        //Configurar la contraseña correcta
        final String CONTRASENA = "Java.2024";
        final int EDAD_MINIMA = 18;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();


        if (edad >= EDAD_MINIMA) {
            System.out.println("Ingrese su contraseña: ");
            String contrasenaingresada = scanner.next();
            if (CONTRASENA.equals(contrasenaingresada)) {

            }

        }

    }
}
