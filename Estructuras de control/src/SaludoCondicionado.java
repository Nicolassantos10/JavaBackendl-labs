import java.util.Scanner;

public class SaludoCondicionado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la hora del día (formato 24 horas): ");
        int hora = scanner.nextInt();

        if (hora >= 0 && hora < 12) {
            System.out.println("Buenos días");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
        scanner.close();
    }
}