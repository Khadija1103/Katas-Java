import java.util.Scanner;

public class Kata6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hora;
        int clientes;

        int totalClientes = 0;
        int contadorHoras = 0;

        int horaMayor = 0;
        int mayorClientes = 0;

        System.out.println("=== NÚMERO DE CLIENTES POR HORA ===");

        while (true) {

            System.out.print("Ingrese la hora (0-23, -1 para terminar): ");
            hora = scanner.nextInt();

            if (hora == -1) {
                break;
            }

            System.out.print("Ingrese el número de clientes en esa hora: ");
            clientes = scanner.nextInt();

            totalClientes += clientes;
            contadorHoras++;

            if (clientes > mayorClientes) {
                mayorClientes = clientes;
                horaMayor = hora;
            }
        }

        System.out.println("\n===== REPORTE DE CLIENTES =====");

        System.out.println("Total de clientes: " + totalClientes);

        if (contadorHoras > 0) {
            double promedio = (double) totalClientes / contadorHoras;

            System.out.println("Promedio por hora: " + promedio);
            System.out.println("Hora con más clientes: " + horaMayor);
            System.out.println("Clientes en esa hora: " + mayorClientes);
        } else {
            System.out.println("No se ingresaron datos.");
        }

        scanner.close();
    }
}