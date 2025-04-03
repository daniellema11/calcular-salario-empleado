import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nombreEmpleado, docIdentidad, diasDescanso = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double deduccionPension = 0;
        double deduccionSalud = 0;
        double horasTrabajadas = 0;
        double valorHora = 0;
        double bonificacionEmpleado = 0;
        double valorSalarioMinimo = 1432500;
        double auxiliotransporte = 200000;
        double cantidadHorasExtra = 0;
        double valorHoraExtra = 0;
        double totalValorHorasExtras = 0;

        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese el documento de identidad del empleado: ");
        docIdentidad = sc.nextline();
        System.out.println("Ingrese los dias de descanso del empleado: (lunes-viernes) ");
        diasDescanso = sc.nextline();
        
    }
}