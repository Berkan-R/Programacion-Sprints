public class Piscinas {
        public static void main(String[] args) {

                // Declaramos las variables de la primera piscina.

                float largoPiscina1 = 300;
                float anchoPiscina1 = 150;
                float profundidadPiscina1 = 20;

                // Declaramos las variables de la segunda piscina.

                float largoPiscina2 = 300;
                float anchoPiscina2 = 80;
                float profundidadPiscina2 = 35;

                // Calculamos el área de la piscina 1 y 2.

                System.out.println("El área de la Piscina 1 es: " + largoPiscina1 * anchoPiscina1 + " metros cuadrados");
                System.out.println("El área de la Piscina 2 es: " + largoPiscina2 * anchoPiscina2 + " metros cuadrados\n");

                // Calculamos el volumen de la piscina 1 y 2.

                System.out.println("El volumen de la Piscina 1 es : " + largoPiscina1 * anchoPiscina1 * profundidadPiscina1
                                        + " litros cúbicos");
                System.out.println("El volumen de la Piscina 2 es: " + largoPiscina2 * anchoPiscina2 * profundidadPiscina2
                                        + " litros cúbicos\n");

                // Calculamos los valores que tendrían las dos piscinas juntas.

                System.out.println("El largo de las dos piscinas juntas sería la misma: " + largoPiscina1 + " metros");
                System.out.println("El ancho de las dos piscinas juntas sería: " + (anchoPiscina1 + anchoPiscina2) + " metros\n");

                // Calculamos el área de las dos piscinas juntas.

                System.out.println("El área de las dos piscinas juntas es: " + largoPiscina1 * (anchoPiscina1 + anchoPiscina2)
                                        + " metros cuadrados");

                // Calculamos el volumen de las dos piscinas juntas, se coge la profunidad de la piscina 1.

                System.out.println("El volumen de las dos piscinas juntas es: "
                                        + largoPiscina1 * (anchoPiscina1 + anchoPiscina2) * profundidadPiscina1 + " litros cúbicos\n");

                // Intercambiamos los valores de profunidad de las dos piscinas y volvemos a calcular el volumen.

                float nuevaProfundidad = profundidadPiscina1;
                profundidadPiscina1 = profundidadPiscina2;
                profundidadPiscina2 = nuevaProfundidad;

                System.out.println("El volumen de la piscina 1, con la nueva profundidad, es: " + largoPiscina1 * anchoPiscina1 
                        * profundidadPiscina1 + " litros cúbicos");

                System.out.println("El volumen de la piscina 2, con la nueva profunidad, es: " + largoPiscina2 * anchoPiscina2 
                                * profundidadPiscina2 + " litros cúbicos");
        }
}