import java.util.Scanner;

public class notaAlumno {
    public static void main(String[] args) {

        // Declaración de variables.

        int notaPrueba;
        int cantidadEntregados;
        int notaEntregas = 0;
        double notaFinal = 0;
        int notaPracticas;
        int totalEntregas;

        // Construimos el objeto teclado para introducir datos por teclado.

        Scanner teclado = new Scanner(System.in);

        // Se recogen todos los datos.

        System.out.println("Introduce la nota de la prueba: ");
        notaPrueba = teclado.nextInt();

        System.out.println("Introduce la cantidad de entregas: ");
        cantidadEntregados = teclado.nextInt();

        System.out.println("Introduce la cantidad total de entregas: ");
        totalEntregas = teclado.nextInt();

        System.out.println("Introduce la nota de las prácticas: ");
        notaPracticas = teclado.nextInt();

        boolean noSeguidaAC = false;

        if (notaPrueba < 7) {
            System.out.println("Suspendido por la prueba final!");
        }

        else if (cantidadEntregados < 0.7 * totalEntregas) {
            System.out.println("Suspendido. No ha seguido evaluación continua!");
            noSeguidaAC = true;
        }

        else {

            if (cantidadEntregados == totalEntregas) {
                notaEntregas = 10;
            }

            else if (cantidadEntregados >= 0.9 * totalEntregas) {
                notaEntregas = 8;
            }

            else if (cantidadEntregados >= 0.8 * totalEntregas) {
                notaEntregas = 6;
            }

            else if (cantidadEntregados >= 0.7 * totalEntregas) {
                notaEntregas = 4;
            }
        }

        // Se calcula nota final.

        notaFinal = (0.2 * notaPrueba) + (0.1 * notaEntregas) + (0.7 * notaPracticas);

        if (notaFinal < 5) {

            if (noSeguidaAC == true) {
                System.out.println("Hay que seguir evaluación continua.");
                
            } else {
                System.out.println("Hacer los ejercicios preparatorios para la PAF2.");
            }
        }

        teclado.close();
    }
}