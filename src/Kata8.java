import java.util.Scanner;

public class Kata8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de empleados: ");
        int empleados = scanner.nextInt();
        scanner.nextLine();

        int totalHoras = 0;
        int mayores40 = 0;
        int menores20 = 0;
        double sueldoTotal = 0;

        String nombresMas40 = "";

        for (int i = 1; i <= empleados; i++) {

            System.out.print("\nNombre del empleado " + i + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Horas trabajadas: ");
            int horas = scanner.nextInt();
            scanner.nextLine();

            totalHoras += horas;
            sueldoTotal += horas * 12000;

            if (horas > 40) {
                mayores40++;
                nombresMas40 += nombre + " ";
            }

            if (horas < 20) {
                menores20++;
            }
        }

        double promedio = (double) totalHoras / empleados;

        System.out.println("\n===== REPORTE DE TURNOS =====");
        System.out.println("Total de horas: " + totalHoras);
        System.out.println("Promedio de horas: " + promedio);
        System.out.println("Empleados con más de 40 horas: " + mayores40);
        System.out.println("Nombres: " + nombresMas40);
        System.out.println("Empleados con menos de 20 horas: " + menores20);
        System.out.println("Sueldo total: $" + sueldoTotal);

        scanner.close();
    }
}