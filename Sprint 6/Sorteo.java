import java.util.Scanner;

public class Sorteo {

    // Constantes para los rangos

    private static final int ID_MINIMO = 111;
    private static final int ID_MAXIMO = 999;
    private static final int EDAD_MINIMA = 14;
    private static final int EDAD_MAXIMA = 120;
    private static final int PRECIO_MINIMO = 0;
    private static final int PRECIO_MAXIMO = 1000;
    private static final int TELEFONO_MINIMO = 111111111;
    private static final int TELEFONO_MAXIMO = 999999999;

    public static void main(String[] args) {

        // Ejecuta el proceso principal

        iniciarSorteo();
    }

    // Método para comprobar si el input es un número entero

    public static boolean esEntero(Scanner teclado) {
        return teclado.hasNextInt();
    }

    // Método para leer un número entero

    public static int leerEntero(Scanner teclado) {

        while (!esEntero(teclado)) {
            teclado.next(); // Limpiar el buffer
            return -1; // Devolvemos -1 para indicar que hubo error en la entrada de datos
        }
        return teclado.nextInt();
    }

    // Método para comprobar si un número está dentro de un rango

    public static boolean comprobarRango(int rangoMinimo, int rangoMaximo, int numero) {

        if (numero < rangoMinimo || numero > rangoMaximo) {
            return false;
        }
        return true;
    }

    // Método para pedir el ID

    public static int pedirId(Scanner teclado) {

        System.out.print("Introduce el ID del cliente. Valores admitidos (111 a 999): ");
        int id = leerEntero(teclado);

        // Si el valor no es válido (no es entero), se retorna -1

        if (id == -1) {
            System.out.println("El número tiene que ser entero!");
            return -1;
        }

        // Ahora que sabemos que el valor es entero, se comprueba si está dentro del
        // rango

        if (!comprobarRango(ID_MINIMO, ID_MAXIMO, id)) {
            System.out.println("ID fuera de rango!");
            return -1; // Indica que hubo un error
        }
        return id;
    }

    // Método para pedir la edad

    public static int pedirEdad(Scanner teclado) {

        System.out.print("Introduce la edad del cliente. Valores admitidos (14 a 120): ");
        int edad = leerEntero(teclado);

        if (edad == -1 || !comprobarRango(EDAD_MINIMA, EDAD_MAXIMA, edad)) {
            System.out.println("Edad fuera de rango!");
            return -1; // Indica que hubo un error
        }
        return edad;
    }

    // Método para pedir el tipo de venta

    public static int pedirTipoDeVenta(Scanner teclado) {

        System.out.print("Introduce el tipo de venta. Valores admitidos (0, 1, 2, 3): ");
        int tipoDeVenta = leerEntero(teclado);

        if (tipoDeVenta == -1 || tipoDeVenta < 0 || tipoDeVenta > 3) {
            System.out.println("El tipo de venta no es válido!");
            return -1; // Indica que hubo un error
        }
        return tipoDeVenta;
    }

    // Método para pedir el precio de la compra

    public static int pedirPrecio(Scanner teclado) {

        System.out.print("Introduce el precio de la compra. Valores admitidos (0 a 1000): ");
        int precioCompra = leerEntero(teclado);

        if (precioCompra == -1 || !comprobarRango(PRECIO_MINIMO, PRECIO_MAXIMO, precioCompra)) {
            System.out.println("Precio fuera de rango!");
            return -1; // Indica que hubo un error
        }
        return precioCompra;
    }

    // Método para pedir el teléfono

    public static int pedirTelefono(Scanner teclado) {

        System.out.print("Introduce el teléfono del cliente. Valores admitidos (111 111 111 a 999 999 999): ");
        int telefono = leerEntero(teclado);

        if (telefono == -1 || !comprobarRango(TELEFONO_MINIMO, TELEFONO_MAXIMO, telefono)) {
            System.out.println("Teléfono incorrecto!");
            return -1; // Indica que hubo un error
        }
        return telefono;
    }

    // Método para obtener el texto asociado al tipo de venta

    public static String obtenerTextoVenta(int tipoDeVenta) {

        switch (tipoDeVenta) {
            case 0:
                return "Venta libre";
            case 1:
                return "Pensionista";
            case 2:
                return "Carnet joven";
            case 3:
                return "Socio";
            default:
                return "Tipo no válido";
        }
    }

    // Método para alinear a la derecha el texto

    public static String alineacionDerecha(String texto, int anchoTexto) {

        while (texto.length() < anchoTexto) {
            texto += " ";
        }
        return texto;
    }

    // Método para mostrar los resultados

    public static void mostrarResultados(int id, int edad, int tipoDeVenta, int precioCompra, int telefono) {

        String textoVenta = obtenerTextoVenta(tipoDeVenta);
        String[] filaUno = { "Id", "Edad", "Tipo", "Importe", "Teléfono" };
        String[] filaDos = {
                Integer.toString(id),
                Integer.toString(edad),
                textoVenta,
                Integer.toString(precioCompra),
                Integer.toString(telefono)
        };
        int[] anchoFila = { 10, 10, 18, 10, 0 };

        // Imprimir Fila 1

        for (int i = 0; i < filaUno.length; i++) {
            System.out.print(alineacionDerecha(filaUno[i], anchoFila[i]));
        }
        System.out.println();

        // Imprimir Fila 2

        for (int i = 0; i < filaDos.length; i++) {
            System.out.print(alineacionDerecha(filaDos[i], anchoFila[i]));
        }
    }

    // Método principal responsable de gestionar todo el proceso

    public static void iniciarSorteo() {

        Scanner teclado = new Scanner(System.in);

        // Recoger datos del cliente, cuando la salida sea -1 lanzara una excepción y el
        // programa parará

        int id = pedirId(teclado);
        if (id == -1)
            return;

        int edad = pedirEdad(teclado);
        if (edad == -1)
            return;

        int tipoDeVenta = pedirTipoDeVenta(teclado);
        if (tipoDeVenta == -1)
            return;

        int precioCompra = pedirPrecio(teclado);
        if (precioCompra == -1)
            return;

        int telefono = pedirTelefono(teclado);
        if (telefono == -1)
            return;

        // Mostrar los resultados una vez recogidos los datos

        mostrarResultados(id, edad, tipoDeVenta, precioCompra, telefono);

        teclado.close();
    }
}