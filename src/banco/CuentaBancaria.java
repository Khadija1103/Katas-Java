package banco;

public abstract class CuentaBancaria {

    // Atributos privados
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private double tasaInteres;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial, double tasaInteres) {

        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }

        if (tasaInteres < 0) {
            throw new IllegalArgumentException("La tasa de interés no puede ser negativa.");
        }

        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.tasaInteres = tasaInteres;
    }

    // Getters

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    // Permite modificar el saldo desde las clases hijas
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Depositar dinero
    public void depositar(double monto) {

        if (monto <= 0) {
            System.out.println("Error: el monto debe ser mayor que cero.");
            return;
        }

        saldo += monto;

        System.out.println("Depósito realizado: $" + String.format("%.2f", monto));
        System.out.println("Nuevo saldo: $" + String.format("%.2f", saldo));
    }

    // Aplicar interés
    public void aplicarInteres() {

        double interes = saldo * tasaInteres / 100;
        saldo += interes;

        System.out.println("Interés generado: $" + String.format("%.2f", interes));
    }

    // Métodos que implementarán las clases hijas
    public abstract void retirar(double monto);

    public abstract void mostrarInfo();
}