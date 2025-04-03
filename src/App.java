import java.util.Scanner;
// esto se pone para el scanner o el programa lea la informacion
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        // esto se coloca para que el editor capture por teclado es LEER seria SC  que pusimos o el que queramos

        int valorHora, cantidadHoras;

        valorHora = sc.nextInt();
        cantidadHoras = sc.nextInt();
        // se debe colocar luego de la variable, la letra que se le dio como leer sc, 
        // poner next y lo siguiente es dependiendo de la variable en este caso int, termina con parentesis.

        System.out.println(valorHora*cantidadHoras);
        sc.close();

    }
}
