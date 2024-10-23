import java.util.Scanner;

public class PiscinasSprint3 {
    public static void main(String[] args) {

    // Declaramos una constante que será el largo de las dos piscinas.

    float largoPiscinas = 300.3F;

    // Declaramos las variables de la primera piscina.

    float anchoPiscina1 = 150.5F;
    float profundidadPiscina1 = 20.5F;

    // Declaramos las variables de la segunda piscina.

    float anchoPiscina2 = 80.5F;
    float profundidadPiscina2 = 35.5F;

    // Calculamos el área de la piscina 1 y 2.

    System.out.println("El área de la Piscina 1 es: " + (int) (largoPiscinas * anchoPiscina1) + " metros cuadrados");
    System.out.println("El área de la Piscina 2 es: " + (int) (largoPiscinas * anchoPiscina2) + " metros cuadrados\n");

    // Calculamos el volumen de la piscina 1 y 2.

    System.out.println("El volumen de la Piscina 1 es : " + (int) (largoPiscinas * anchoPiscina1 * profundidadPiscina1)
                        + " litros cúbicos");
    System.out.println("El volumen de la Piscina 2 es: " + (int) (largoPiscinas * anchoPiscina2 * profundidadPiscina2)
                        + " litros cúbicos\n");

    // Calculamos los valores que tendrían las dos piscinas juntas.

    System.out.println("El largo de las dos piscinas juntas sería la misma: " + (int) largoPiscinas + " metros");
    System.out.println("El ancho de las dos piscinas juntas sería: " + (int) (anchoPiscina1 + anchoPiscina2) + " metros\n");

    // Calculamos el área de las dos piscinas juntas.

    System.out.println("El área de las dos piscinas juntas es: " + (int) (largoPiscinas * (anchoPiscina1 + anchoPiscina2))
                        + " metros cuadrados");

    // Calculamos el volumen de las dos piscinas juntas, se coge la profunidad de la piscina 1.

    System.out.println("El volumen de las dos piscinas juntas es: "
                        + (int) (largoPiscinas * (anchoPiscina1 + anchoPiscina2) * profundidadPiscina1) + " litros cúbicos\n");
    
    // Creamos el objeto teclado para que el usuario pueda introducir datos por teminal.
    
    Scanner teclado = new Scanner(System.in);

    // Intercambiamos los valores de profunidad de las dos piscinas por las del usuario y volvemos a calcular el volumen.

    System.out.println("Dame la nueva profundidad de la piscina 1: ");
    float nuevaProfundidad1 = teclado.nextFloat();
    profundidadPiscina1 = nuevaProfundidad1;

    System.out.println("Dame el nuevo ancho de la piscina 1: ");
    float nuevoAncho1 = teclado.nextFloat();
    anchoPiscina1 = nuevoAncho1;

    System.out.println("Dame la nueva profundidad de la piscina 2: ");
    float nuevaProfundidad2 = teclado.nextFloat();
    profundidadPiscina2 = nuevaProfundidad2;

    System.out.println("Dame el nuevo ancho de la piscina 2: ");
    float nuevoAncho2 = teclado.nextFloat();
    anchoPiscina2 = nuevoAncho2;

    System.out.println("\nEl volumen de la piscina 1, con la nueva profundidad, es: " + (int) (largoPiscinas * anchoPiscina1 
                        * profundidadPiscina1) + " litros cúbicos");

    System.out.println("El volumen de la piscina 2, con la nueva profunidad, es: " + (int) (largoPiscinas * anchoPiscina2 
                            * profundidadPiscina2) + " litros cúbicos\n"); 

    teclado.close(); 
    }
}