import java.util.Scanner;

public class Kata1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE PROPINAS ===");

        System.out.print("Ingrese el total de la cuenta: ");
        double totalCuenta = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de propina: ");
        double porcentajePropina = scanner.nextDouble();

        double propina = totalCuenta * porcentajePropina / 100;
        double totalPagar = totalCuenta + propina;

        System.out.println("\n===== RESULTADO =====");
        System.out.println("Valor de la propina: $" + propina);
        System.out.println("Total a pagar: $" + totalPagar);

        if (porcentajePropina > 30) {
            System.out.println("¡Propina generosa!");
        } else if (porcentajePropina < 5) {
            System.out.println("Propina muy baja.");
        }

        scanner.close();
    }
}
