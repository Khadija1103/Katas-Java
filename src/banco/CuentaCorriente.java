package banco;

public class CuentaCorriente extends CuentaBancaria {

    // Valores por defecto
    private double limiteSobregiro;
    private double porcentajeComisionSobregiro;

    // Constructor principal
    public CuentaCorriente(String numeroCuenta,
                           String titular,
                           double saldoInicial,
                           double limiteSobregiro,
                           double porcentajeComisionSobregiro) {

        super(numeroCuenta, titular, saldoInicial, 0.0);

        this.limiteSobregiro = limiteSobregiro;
        this.porcentajeComisionSobregiro = porcentajeComisionSobregiro;
    }

    // Constructor con valores por defecto
    public CuentaCorriente(String numeroCuenta,
                           String titular,
                           double saldoInicial) {

        this(numeroCuenta, titular, saldoInicial, 50000, 5.0);
    }

    @Override
    public void retirar(double monto) {

        if (monto <= 0) {
            System.out.println("Error: el monto debe ser mayor que cero.");
            return;
        }

        if (monto > getSaldo() + limiteSobregiro) {
            System.out.println("Error: supera el límite de sobregiro.");
            return;
        }

        // Realizar el retiro
        setSaldo(getSaldo() - monto);

        System.out.println("Retiro exitoso.");

        // Aplicar comisión solo si queda en saldo negativo
        if (getSaldo() < 0) {

            double montoSobregirado = -getSaldo();
            double comision = montoSobregirado * porcentajeComisionSobregiro / 100;

            setSaldo(getSaldo() - comision);

            System.out.println("Comisión por sobregiro: $" +
                    String.format("%.2f", comision));
        }

        System.out.println("Nuevo saldo: $" +
                String.format("%.2f", getSaldo()));
    }

    // Esta cuenta no genera intereses
    @Override
    public void aplicarInteres() {
        System.out.println("Esta cuenta no genera intereses.");
    }

    @Override
    public void mostrarInfo() {

        System.out.println("========== CUENTA CORRIENTE ==========");
        System.out.println("Número de cuenta: " + getNumeroCuenta());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: $" +
                String.format("%.2f", getSaldo()));
        System.out.println("Límite de sobregiro: $" +
                String.format("%.2f", limiteSobregiro));
        System.out.println();
    }
}