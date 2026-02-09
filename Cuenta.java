public class Cuenta implements ServicioCuenta {
    private String titular;
    private double saldo;
    private int numeroCuenta;

    public Cuenta(String titular, int numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Deposito realizado: +$" + cantidad);
        }
    }

    @Override
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && this.saldo >= cantidad) {
            this.saldo -= cantidad;
            System.out.println("Retiro realizado: -$" + cantidad);
            return true;
        }
        System.out.println("Operacion fallida: Fondos insuficientes.");
        return false;
    }

    @Override
    public double convertirMoneda(double tasaCambio) {
        return this.saldo * tasaCambio;
    }
}
