package banco;

public class CuentaAhorro extends CuentaBancaria {

    // Atributo adicional
    private String fechaApertura;

    // Tasa fija
    private static final double TASA_INTERES = 2.5;

    // Constructor
    public CuentaAhorro(String numeroCuenta, String titular,
                        double saldoInicial, String fechaApertura) {

        super(numeroCuenta, titular, saldoInicial, TASA_INTERES);

        if (saldoInicial < 10000) {
            throw new IllegalArgumentException(
                    "La cuenta de ahorro requiere un saldo mínimo de $10,000.");
        }

        this.fechaApertura = fechaApertura;
    }

    @Override
    public void retirar(double monto) {

        if (monto <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
            return;
        }

        if (monto > getSaldo()) {
            System.out.println("Error: saldo insuficiente.");
            return;
        }

        setSaldo(getSaldo() - monto);

        System.out.println("Retiro exitoso.");
        System.out.println("Nuevo saldo: $" +
                String.format("%.2f", getSaldo()));
    }

    @Override
    public void mostrarInfo() {

        System.out.println("========== CUENTA AHORRO ==========");
        System.out.println("Número de cuenta: " + getNumeroCuenta());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: $" + String.format("%.2f", getSaldo()));
        System.out.println("Tasa de interés: " + getTasaInteres() + "%");
        System.out.println("Fecha de apertura: " + fechaApertura);
        System.out.println();
    }
}
