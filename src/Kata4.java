import java.util.Scanner;

public class Kata4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== VALIDADOR DE HORARIOS ===");

        System.out.print("Ingrese el día (1=Lunes, 7=Domingo): ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese la hora (0-23): ");
        int hora = scanner.nextInt();

        switch (dia) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (hora >= 6 && hora < 20) {
                    System.out.println("La cafetería está abierta.");
                    System.out.println("Horario: 6:00 AM - 8:00 PM");
                } else {
                    System.out.println("La cafetería está cerrada.");
                    System.out.println("Horario: 6:00 AM - 8:00 PM");
                }
                break;

            case 6:
                if (hora >= 7 && hora < 14) {
                    System.out.println("La cafetería está abierta.");
                    System.out.println("Horario de sábado: 7:00 AM - 2:00 PM");
                } else {
                    System.out.println("La cafetería está cerrada.");
                    System.out.println("Horario de sábado: 7:00 AM - 2:00 PM");
                }
                break;

            case 7:
                System.out.println("La cafetería está cerrada.");
                System.out.println("Los domingos no hay atención.");
                break;

            default:
                System.out.println("Día inválido.");
        }

        scanner.close();
    }
}