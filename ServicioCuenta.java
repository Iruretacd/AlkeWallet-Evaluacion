public interface ServicioCuenta {
    double consultarSaldo();
    void depositar(double cantidad);
    boolean retirar(double cantidad);
    double convertirMoneda(double tasaCambio);
}
