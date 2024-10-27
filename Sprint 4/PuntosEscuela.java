import java.util.Scanner;

public class PuntosEscuela {

    static int validarDato(Scanner datos, String mensaje, int numeroMinimo, int numeroMaximo) {

        /*
         * Se crea un método que comprueba el número de entrada que sea un entero. Si el
         * dato
         * introducido no es un entero, devolvemos mensaje a usuario y volvemos a pedir
         * el dato. Si el dato
         * introducido además es menor al mínimo indicado y mayor al máximo establecido,
         * también
         * mostramos mensaje al usuario y volvemos a pedir los datos.
         */

        int entero;

        while (true) {

            System.out.print(mensaje);

            if (datos.hasNextInt()) {
                entero = datos.nextInt();

                if (entero >= numeroMinimo && entero <= numeroMaximo) {
                    break;

                } else {
                    System.out.println("El número tiene que estar entre " + numeroMinimo + " y " + numeroMaximo);
                }

            } else {
                System.out.println("Tiene que introducir un número entero!");
                datos.next(); // Vacíamos la entrada inválida.
            }
        }

        return entero;
    }

    public static void main(String[] args) {

        // Declaramos constantes para faciliar el manejo de puntos si en un futuro se
        // deciden cambiar los valores.

        final int PUNTOS_HERMANO = 40;
        final int PUNTOS_VIVE_MISMA_POBLACION = 30;
        final int PUNTOS_TRABAJA_MISMA_POBLACION = 20;
        final int PUNTOS_DISCAPACIDAD = 10;
        final int PUNTOS_FAMILIA_NUMEROSA = 15;
        final int PUNTOS_ESCOLARIZACION_PASADA = 5;

        // Declaramos todos los datos que vamos a recoger del usuario.

        int numeroRegistro, tieneHermano, viveMismaPoblacion, trabajaMismaPoblacion,
                tieneDiscapacidad, esFamiliaNumerosa, haEstadoEscolarizado;

        // Creamos el objeto "datos" para poder guardar los datos introducidos.

        Scanner datos = new Scanner(System.in);

        // Preguntar por el número de registro del alumno.

        numeroRegistro = validarDato(datos, "Introduce el número de registro (entre 1 y 499): ", 1, 499);

        // Preguntar si tiene hermano/a en el centro.

        tieneHermano = validarDato(datos, "Tiene algún hermano/a en el centro? (0:NO / 1:SÍ): ", 0, 1);

        // Preguntar si vive en la misma población.

        viveMismaPoblacion = validarDato(datos, "Vive en la zona de la escuela? (0:NO / 1:SÍ): ", 0, 1);

        // Preguntar si trabaja en la misma población.

        trabajaMismaPoblacion = validarDato(datos, "Sus padres trabajan por la zona de la escuela? (0:NO / 1:SÍ): ", 0,
                1);

        // Preguntar si tiene alguna discapacidad.

        tieneDiscapacidad = validarDato(datos,
                "Tiene alguna discapacidad mayor o igual al 33% o una enfermedad crónica? (0:NO / 1:SÍ): ", 0, 1);

        // Preguntar si es familia numerosa.

        esFamiliaNumerosa = validarDato(datos, "Son una familia numerosa o monoparental? (0:NO / 1:SÍ): ", 0, 1);

        // Preguntar si alguien de la familia ha estudiado en la escuela.

        haEstadoEscolarizado = validarDato(datos,
                "Los padres, tutor legal o hermano han estado estudiado en esta escuela? (0:NO / 1:SÍ): ", 0, 1);

        // Calculamos todos los puntos y los mostramos.

        // Se evalua el criterio de Hermanos.

        int puntosTotales = 0;

        if (tieneHermano == 1) {
            puntosTotales = puntosTotales + PUNTOS_HERMANO;
        }

        // Se evalua el criterio de Proximidad: elegir el de más puntuación.

        if (viveMismaPoblacion == 1) {
            puntosTotales = puntosTotales + PUNTOS_VIVE_MISMA_POBLACION;

        } else if (trabajaMismaPoblacion == 1) {
            puntosTotales = puntosTotales + PUNTOS_TRABAJA_MISMA_POBLACION;
        }

        // Se evalua el criterio de Discapacidad.

        if (tieneDiscapacidad == 1) {
            puntosTotales = puntosTotales + PUNTOS_DISCAPACIDAD;
        }

        // Se evalua el criterio de FamiliaNumerosa o Monoparental.

        if (esFamiliaNumerosa == 1) {
            puntosTotales = puntosTotales + PUNTOS_FAMILIA_NUMEROSA;
        }

        // Se evalua el criterio de Escolarizaciones pasadas.

        if (haEstadoEscolarizado == 1) {
            puntosTotales = puntosTotales + PUNTOS_ESCOLARIZACION_PASADA;
        }

        // Mostramos por pantalla los puntos del alumno.

        System.out.println("El alumno con número de registro : " + numeroRegistro + " tiene un total de "
                + puntosTotales + " puntos.");

        datos.close();
    }
}