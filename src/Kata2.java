import java.util.Scanner;

public class Kata2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CLASIFICADOR DE BEBIDAS ===");

        System.out.print("Ingrese el nombre de la bebida: ");
        String bebida = scanner.nextLine();

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double temperatura = scanner.nextDouble();

        System.out.println("\n===== RESULTADO =====");

        if (temperatura > 60) {
            System.out.println(bebida + ": Caliente");
        } else if (temperatura >= 30 && temperatura <= 60) {
            System.out.println(bebida + ": Templada");
        } else {
            System.out.println(bebida + ": Fría");
        }

        scanner.close();
    }
}
