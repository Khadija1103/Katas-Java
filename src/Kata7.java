import java.util.Scanner;

public class Kata7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char continuar = 'S';
        double totalCompra = 0;

        while (continuar == 'S' || continuar == 's') {

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();

            double subtotal = precio * cantidad;

            double porcentajeDescuento = 0;

            if (cantidad >= 3 && cantidad <= 5) {
                porcentajeDescuento = 0.05;
            } else if (cantidad >= 6 && cantidad <= 10) {
                porcentajeDescuento = 0.10;
            } else if (cantidad >= 11) {
                porcentajeDescuento = 0.15;
            }

            double descuento = subtotal * porcentajeDescuento;
            double subtotalConDescuento = subtotal - descuento;
            double iva = subtotalConDescuento * 0.19;
            double total = subtotalConDescuento + iva;

            totalCompra += total;

            System.out.println("\n===== FACTURA =====");
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("IVA (19%): $" + iva);
            System.out.println("Total: $" + total);

            System.out.print("\n¿Agregar otro producto? (S/N): ");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("\n==============================");
        System.out.println("TOTAL DE LA COMPRA: $" + totalCompra);

        scanner.close();
    }
}
