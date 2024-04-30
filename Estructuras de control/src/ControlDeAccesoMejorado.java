import java.util.Scanner;


public class ControlDeAccesoMejorado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tipos de eventos disponibles: Infantil. JuveniL. Adultos");
        System.out.println("Ingrese el tipo de evento al que desea acceder: ");
        String tipoEvento = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();

        // determinar el acceso basado en el tipo de evento y la edad

        //.equalsIgnorCase es un miembro de la clase String. Es un metodo que compara dos cadenas de texto
        //para determinar si son iguales
        //"texto".equalsIgnorCase(String "texto a comparar"), es booleano, verdadero si son iguales, falso sino
        //IgnoreCase ignora las mayusculas. Texto es igual a texto TEXTO= texto

        if ("Infantil" .equalsIgnoreCase(tipoEvento)) {
            System.out.println("Bienvenido al evento Infantil. ");

        } else if ("Juvenil".equalsIgnoreCase(tipoEvento)) {
            if (edad >= 12) {
                System.out.println("Bienvenido al evento Juvenil: ");
            }else {
                System.out.println("Debe tener almenos 12 años. ");
            }
        } else if ("Adultos".equalsIgnoreCase(tipoEvento)) {
            if (edad >= 18) {
                System.out.println("Bienvenido al evento Adultos: ");
            }
            else {
                System.out.println("Tipo de evento no reconocido.");

            }
        }

        }

    }

