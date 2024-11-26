import java.util.Scanner;

class Multiplos {

    // Método para validar datos de entrada

    public static int validarDato(Scanner teclado) {

        int numero = 0;
        boolean entra = true;

        System.out.print("Introduce un número del 1 al 20: ");

        while (entra) {

            if (teclado.hasNextInt()) {
                numero = teclado.nextInt();

                if (numero >= 1 && numero <= 20) {
                    entra = false;

                } else {
                    System.out.print("El número introducido está fuera de rango. Vuelva a introducir el número: ");
                }

            } else {
                System.out.print("Tienes que introducir un número entero. Vuelve a introducir el número: ");
                teclado.next(); // Limpiamos las entradas inválidas
            }
        }

        return numero;
    }

    // Método para mostrar todos los múltiplos de 0 a 100

    public static void multiplos(int numero) {

        int resultado = 0;
        int contador = 0;

        while (resultado < 100) {
            resultado = contador * numero;
            System.out.println(resultado);
            contador++;
        }
    }

    // Método MAIN

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = validarDato(teclado);
        multiplos(numero);

        teclado.close();
    }
}