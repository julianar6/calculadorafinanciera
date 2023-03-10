import java.util.Scanner;

public class CostoCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese el monto del préstamo: ");
        double monto = scanner.nextDouble();
        System.out.print("Ingrese la tasa de interés anual: ");
        double tasa = scanner.nextDouble() / 100; // Se divide por 100 para convertir a porcentaje
        System.out.print("Ingrese el número de períodos: ");
        int periodos = scanner.nextInt();

        // Cálculo del pago mensual
        double tasaMensual = tasa / 12; // Se divide entre 12 para obtener la tasa mensual
        double numerador = tasaMensual * Math.pow(1 + tasaMensual, periodos);
        double denominador = Math.pow(1 + tasaMensual, periodos) - 1;
        double pagoMensual = monto * numerador / denominador;

        // Cálculo del costo total del crédito
        double costoTotal = pagoMensual * periodos;

        // Imprimir resultados
        System.out.println("El pago mensual necesario es de $" + pagoMensual);
        System.out.println("El costo total del crédito es de $" + costoTotal);

        scanner.close();
    }
}
