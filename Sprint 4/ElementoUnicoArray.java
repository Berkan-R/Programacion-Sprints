public class ElementoUnicoArray {

    static int sinRepetir(int[] numeros) {

        // Recorremos la lista dos veces y contamos todas las veces que aparece cada elemento.

        int suma = 0;

        for (int contador1 = 0; contador1 < numeros.length; contador1++) {

            int cantidadRepetidos = 0;

            for (int contador2 = 0; contador2 < numeros.length; contador2++) {

                if (numeros[contador1] == numeros[contador2]) {
                    cantidadRepetidos++;
                }
            }

            // Si el elemento en el array aparece solo una vez, lo sumamos a la variable "suma".

            if (cantidadRepetidos == 1) {
                suma = suma + numeros[contador1];
            }
        }

        return suma;
    }

    public static void main(String[] args) {

        System.out.println(sinRepetir(new int[] { 4, 5, 7, 5, 4, 8 }));
        System.out.println(sinRepetir(new int[] { 9, 10, 19, 13, 19, 13 }));
        System.out.println(sinRepetir(new int[] { 16, 0, 11, 4, 8, 16, 0, 11 }));
    }
}