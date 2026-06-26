import java.util.Scanner;

public class Kata3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double precio;
        double subtotal = 0;

        System.out.println("=== CALCULADORA DE PEDIDOS CON IVA ===");

        while (true) {

            System.out.print("Ingrese el precio del producto (0 para terminar): ");
            precio = scanner.nextDouble();

            if (precio == 0) {
                break;
            }

            subtotal += precio;
        }

        double iva = subtotal * 0.19;
        double total = subtotal + iva;
        double descuento = 0;

        if (total > 50000) {
            descuento = total * 0.10;
            total = total - descuento;
        }

        System.out.println("\n===== RESULTADO =====");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + iva);

        if (descuento > 0) {
            System.out.println("Descuento (10%): $" + descuento);
        }

        System.out.println("Total: $" + total);

        scanner.close();
    }
}
