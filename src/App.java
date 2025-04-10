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
        docIdentidad = sc.nextLine();
        System.out.println("Ingrese los dias de descanso del empleado: (lunes-viernes) ");
        diasDescanso = sc.nextLine();
        System.out.println("Ingrese el valor de la hora: ");
        valorHora = sc.nextDouble();
        System.out.println("Ingrese cantidad de horas trabajadas: ");
        horasTrabajadas= sc.nextDouble();

        salarioBruto = horasTrabajadas * valorHora;
        if(salarioBruto <= valorSalarioMinimo*2){
            auxiliotransporte = 200000;
            bonificacionEmpleado = salarioBruto * 0.1;
        }else{
            auxiliotransporte = 0;
            bonificacionEmpleado = 0;
        }
        deduccionPension = salarioBruto * 0.04;
        deduccionSalud = salarioBruto * 0.04;
        if (horasTrabajadas > 96) {
            cantidadHorasExtra = horasTrabajadas - 96;
            valorHoraExtra = valorHora * 1.25;
            totalValorHorasExtras = cantidadHorasExtra * valorHoraExtra;
        }
        if (horasTrabajadas < 24 ) {
            System.out.println("Sin pago");
        } else {
            salarioNeto = salarioBruto - deduccionPension -deduccionSalud + auxiliotransporte + bonificacionEmpleado + totalValorHorasExtras;
            System.out.println("El salario neto del empleado es: " + salarioNeto);
        }
        System.out.println("Nombre del empleado: " + nombreEmpleado);
        System.out.println("Documento de identidad del empleado: " + docIdentidad);
        System.out.println("Los dias de descanso del empleado es: " + diasDescanso);
        System.out.println("Valor hora del empleado es: " + valorHora);
        System.out.println("Horas trabajadas del empleado: " + horasTrabajadas);
        System.out.println("Horas extras del empleado son: " + cantidadHorasExtra);
        System.out.println("Valor hora extra del empleado son: " + valorHoraExtra);
        System.out.println("Total horas extras del empleado son: " + totalValorHorasExtras);
        System.out.println("El salario bruto del empleado es: " + salarioBruto);
        System.out.println("El empleado tiene auxilio de transporte de: " + auxiliotransporte);
        System.out.println("El empleado tiene bonificacion de: " + bonificacionEmpleado);
        System.out.println("La deduccion del empleado por pension es: " + deduccionPension);
        System.out.println("La deduccion del empleado por salud es: " + deduccionSalud);


    }
}