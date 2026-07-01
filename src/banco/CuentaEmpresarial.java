package banco;

public class CuentaEmpresarial extends CuentaBancaria {

    // Atributos adicionales
    private String nombreEmpresa;
    private String RUT;
    private double comisionRetiro;

    // Constantes
    private static final double TASA_INTERES = 1.5;
    private static final double COMISION_DEFECTO = 2000;

    // Constructor
    public CuentaEmpresarial(String numeroCuenta,
                             String titular,
                             double saldoInicial,
                             String nombreEmpresa,
                             String RUT) {

        super(numeroCuenta, titular, saldoInicial, TASA_INTERES);

        if (saldoInicial < 100000) {
            throw new IllegalArgumentException(
                    "La cuenta empresarial requiere un saldo mínimo de $100000.");
        }

        this.nombreEmpresa = nombreEmpresa;
        this.RUT = RUT;
        this.comisionRetiro = COMISION_DEFECTO;
    }

    @Override
    public void retirar(double monto) {

        if (monto <= 0) {
            System.out.println("Error: el monto debe ser mayor que cero.");
            return;
        }

        if ((monto + comisionRetiro) > getSaldo()) {
            System.out.println("Error: saldo insuficiente.");
            return;
        }

        setSaldo(getSaldo() - monto);
        setSaldo(getSaldo() - comisionRetiro);

        System.out.println("Retiro exitoso.");
        System.out.println("Comisión por retiro: $" +
                String.format("%.2f", comisionRetiro));
        System.out.println("Nuevo saldo: $" +
                String.format("%.2f", getSaldo()));
    }

    @Override
    public void mostrarInfo() {

        System.out.println("========== CUENTA EMPRESARIAL ==========");
        System.out.println("Número de cuenta: " + getNumeroCuenta());
        System.out.println("Titular: " + getTitular());
        System.out.println("Empresa: " + nombreEmpresa);
        System.out.println("RUT: " + RUT);
        System.out.println("Saldo: $" +
                String.format("%.2f", getSaldo()));
        System.out.println("Tasa de interés: " +
                getTasaInteres() + "%");
        System.out.println();
    }

}