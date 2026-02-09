import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta miCuenta = new Cuenta("Usuario Alke", 12345, 50000.0);
        int opcion = 0;

        System.out.println("Bienvenido a Alke Wallet");
        
        while (opcion != 5) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ver Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Convertir a Dolares");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + miCuenta.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    miCuenta.depositar(scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    miCuenta.retirar(scanner.nextDouble());
                    break;
                case 4:
                    double dolares = miCuenta.convertirMoneda(0.0011); // Tasa ejemplo
                    System.out.println("Saldo en USD: $" + dolares);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion invalida");
            }
        }
        scanner.close();
    }
}
