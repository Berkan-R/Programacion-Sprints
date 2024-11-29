import java.util.Scanner;

public class Optica {

    // Constantes para los rangos
    private static final int ID_MINIMO = 111;
    private static final int ID_MAXIMO = 999;
    private static final int EDAD_MINIMA = 14;
    private static final int EDAD_MAXIMA = 120;
    private static final int PRECIO_MINIMO = 0;
    private static final int PRECIO_MAXIMO = 1000;
    private static final int TELEFONO_MINIMO = 111111111;
    private static final int TELEFONO_MAXIMO = 999999999;

    // Método para validar datos de entrada. Que sea entero y que este dentro del rango.
    public static int validarDato(Scanner teclado, int rangoMinimo, int rangoMaximo) {

        int numero = 0;
        boolean entra = true;
        int intentos = 0;

        while (entra && intentos < 3) {
            if (teclado.hasNextInt()) {
                numero = teclado.nextInt();
                if (numero >= rangoMinimo && numero <= rangoMaximo) {
                    return numero;
                } else {
                    intentos++;
                    if (intentos < 2) {
                        System.out.print(
                                "Número fuera de rango. Te quedan " + (3 - intentos)
                                        + " intentos. Vuelve a introducir el número: ");
                    } else if (intentos == 2) {
                        System.out.print("Numero fuera de rango. Te queda 1 intento. Vuelve a introducir el número: ");
                    }
                }
            } else {
                intentos++;
                if (intentos < 2) {
                    System.out.print("Tienes que introducir un número entero. Te quedan " + (3 - intentos)
                            + " intentos. Vuelve a introducir el número: ");
                } else if (intentos == 2) {
                    System.out.print("Numero fuera de rango. Te queda 1 intento. Vuelve a introducir el número: ");
                }
                teclado.next(); // Limpiamos la entrada no válida
            }
        }
        System.out.println("Se han agotado los intentos! Este cliente no se ha registrado!");
        return -1; // Devuelve -1 cuando se han agotado los 3 intentos
    }

    // Método para pedir el ID
    public static int pedirID(Scanner teclado) {
        System.out.print("Introduce el ID del cliente. Valores admitidos (111 a 999): ");
        return validarDato(teclado, ID_MINIMO, ID_MAXIMO);
    }

    // Método para pedir la edad
    public static int pedirEdad(Scanner teclado) {

        System.out.print("Introduce la edad del cliente. Valores admitidos (14 a 120): ");
        return validarDato(teclado, EDAD_MINIMA, EDAD_MAXIMA);
    }

    // Método para pedir el tipo de venta
    public static int pedirTipoDeVenta(Scanner teclado) {

        System.out.print("Introduce el tipo de venta. Valores admitidos (0, 1, 2, 3): ");
        return validarDato(teclado, 0, 3);
    }

    // Método para pedir el precio de la compra
    public static int pedirPrecio(Scanner teclado) {

        System.out.print("Introduce el precio de la compra. Valores admitidos (0 a 1000): ");
        return validarDato(teclado, PRECIO_MINIMO, PRECIO_MAXIMO);
    }

    // Método para pedir el teléfono
    public static int pedirTelefono(Scanner teclado) {

        System.out.print("Introduce el teléfono del cliente. Valores admitidos (111 111 111 a 999 999 999): ");
        return validarDato(teclado, TELEFONO_MINIMO, TELEFONO_MAXIMO);
    }

    // Método para obtener el texto asociado al tipo de venta
    public static String obtenerTextoVenta(int pedirTipoDeVenta) {

        switch (pedirTipoDeVenta) {
            case 0:
                return "Venta libre";
            case 1:
                return "Pensionista";
            case 2:
                return "Carnet joven";
            case 3:
                return "Socio";
            default:
                return null; // Nunca va a llegar hasta aquí porque validarDato no lo va permitir
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
        String[] filaUno = { "\nId", "Edad", "Tipo", "Importe", "Teléfono" };
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

        int clientesIntroducidos = 0; // Contador de clientes introducidos correctamente
        boolean entra = true;

        while (entra) {

            System.out.println("\nIntroduce los datos de un nuevo cliente:\n");

            int id = pedirID(teclado);
            if (id == -1)
                continue;

            int edad = pedirEdad(teclado);
            if (edad == -1)
                continue;

            int tipoDeVenta = pedirTipoDeVenta(teclado);
            if (tipoDeVenta == -1)
                continue;

            int precioCompra = pedirPrecio(teclado);
            if (precioCompra == -1)
                continue;

            int telefono = pedirTelefono(teclado);
            if (telefono == -1)
                continue;

            // Mostrar los resultados una vez recogidos los datos
            mostrarResultados(id, edad, tipoDeVenta, precioCompra, telefono);

            // Aumentamos el contador de clientes introducidos correctamente
            clientesIntroducidos++;

            // Preguntar si se desea introducir otro cliente
            System.out.print("\n\n¿Deseas introducir otro cliente? (sí/no): ");
            String respuesta = teclado.next();

            if (respuesta.equals("no")) {
                entra = false; // Salimos del bucle, si la respuesta es "no"
            }
        }

        // Al final, mostrar el número total de clientes introducidos
        if (clientesIntroducidos == 1) {
            System.out.println("\nSe ha registrado 1 cliente correctamente");
        } else {
            System.out.println("\nSe han registrado " + clientesIntroducidos + " clientes correctamente.");
        }
        teclado.close();
    }

    public static void main(String[] args) {

        // Ejecuta el método principal
        iniciarSorteo();
    }
}