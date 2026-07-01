package banco;

public class TestBanco {

    public static void main(String[] args) {

        // ============================
        // PASO 1: Crear las cuentas
        // ============================

        CuentaAhorro cuenta1 = new CuentaAhorro(
                "AH001",
                "Ana Perez",
                50000,
                "2024-01-15"
        );

        CuentaCorriente cuenta2 = new CuentaCorriente(
                "CC001",
                "Luis Gomez",
                20000
        );

        CuentaEmpresarial cuenta3 = new CuentaEmpresarial(
                "EM001",
                "Tech Solutions",
                200000,
                "Tech Solutions",
                "123456789-0"
        );

        CuentaAhorro cuenta4 = new CuentaAhorro(
                "AH002",
                "Maria Lopez",
                15000,
                "2024-02-01"
        );

        // ============================
        // PASO 2: Mostrar información
        // ============================

        System.out.println("\n========== INFORMACIÓN INICIAL ==========\n");

        cuenta1.mostrarInfo();
        cuenta2.mostrarInfo();
        cuenta3.mostrarInfo();
        cuenta4.mostrarInfo();

        // ============================
        // PASO 3: Operaciones
        // ============================

        System.out.println("\n========== OPERACIONES ==========\n");

        System.out.println("Ana Perez deposita $10.000");
        cuenta1.depositar(10000);

        System.out.println();

        System.out.println("Luis Gomez retira $25.000");
        cuenta2.retirar(25000);

        System.out.println();

        System.out.println("Tech Solutions retira $10.000");
        cuenta3.retirar(10000);

        System.out.println();

        System.out.println("Maria Lopez intenta retirar $20.000");
        cuenta4.retirar(20000);

        // ============================
        // PASO 4: Aplicar intereses
        // ============================

        System.out.println("\n========== INTERESES ==========\n");

        System.out.println("Cuenta Ana Perez");
        cuenta1.aplicarInteres();

        System.out.println();

        System.out.println("Cuenta Luis Gomez");
        cuenta2.aplicarInteres();

        System.out.println();

        System.out.println("Cuenta Tech Solutions");
        cuenta3.aplicarInteres();

        System.out.println();

        System.out.println("Cuenta Maria Lopez");
        cuenta4.aplicarInteres();

        // ============================
        // PASO 5: Estado final
        // ============================

        System.out.println("\n========== ESTADO FINAL ==========\n");

        cuenta1.mostrarInfo();
        cuenta2.mostrarInfo();
        cuenta3.mostrarInfo();
        cuenta4.mostrarInfo();

        // ============================
        // PASO 6: Resumen
        // ============================

        int totalCuentas = 4;

        double saldoTotal =
                cuenta1.getSaldo() +
                        cuenta2.getSaldo() +
                        cuenta3.getSaldo() +
                        cuenta4.getSaldo();

        double promedio = saldoTotal / totalCuentas;

        CuentaBancaria mayor = cuenta1;

        if (cuenta2.getSaldo() > mayor.getSaldo()) {
            mayor = cuenta2;
        }

        if (cuenta3.getSaldo() > mayor.getSaldo()) {
            mayor = cuenta3;
        }

        if (cuenta4.getSaldo() > mayor.getSaldo()) {
            mayor = cuenta4;
        }

        System.out.println("\n========== RESUMEN ==========\n");

        System.out.println("Total de cuentas: " + totalCuentas);

        System.out.println("Saldo total: $" +
                String.format("%.2f", saldoTotal));

        System.out.println("Promedio de saldo: $" +
                String.format("%.2f", promedio));

        System.out.println();

        System.out.println("Cuenta con mayor saldo:");

        System.out.println("Número: " + mayor.getNumeroCuenta());

        System.out.println("Titular: " + mayor.getTitular());

        System.out.println("Saldo: $" +
                String.format("%.2f", mayor.getSaldo()));

    }

}