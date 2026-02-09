import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {
    @Test
    void testDeposito() {
        Cuenta c = new Cuenta("Test", 1, 1000);
        c.depositar(500);
        assertEquals(1500, c.consultarSaldo());
    }

    @Test
    void testRetiro() {
        Cuenta c = new Cuenta("Test", 1, 1000);
        boolean resultado = c.retirar(200);
        assertTrue(resultado);
        assertEquals(800, c.consultarSaldo());
    }
    
    @Test
    void testRetiroInsuficiente() {
        Cuenta c = new Cuenta("Test", 1, 100);
        boolean resultado = c.retirar(200);
        assertFalse(resultado);
    }
}
