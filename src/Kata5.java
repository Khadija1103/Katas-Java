import java.util.Scanner;

public class Kata5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;
        double total = 0;

        do {

            System.out.println("\n--- MENÚ DE LA CAFETERÍA ---");
            System.out.println("1. Café ($4000)");
            System.out.println("2. Muffin ($3500)");
            System.out.println("3. Sandwich ($7500)");
            System.out.println("4. Jugo ($5000)");
            System.out.println("5. Té ($3000)");
            System.out.println("6. Salir");

            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    total += 4000;
                    System.out.println("Producto agregado: Café ($4000)");
                    break;

                case 2:
                    total += 3500;
                    System.out.println("Producto agregado: Muffin ($3500)");
                    break;

                case 3:
                    total += 7500;
                    System.out.println("Producto agregado: Sandwich ($7500)");
                    break;

                case 4:
                    total += 5000;
                    System.out.println("Producto agregado: Jugo ($5000)");
                    break;

                case 5:
                    total += 3000;
                    System.out.println("Producto agregado: Té ($3000)");
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        System.out.println("\n===== RESULTADO =====");
        System.out.println("Total del pedido: $" + total);

        scanner.close();
    }
}
