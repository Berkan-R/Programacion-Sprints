import java.util.Scanner;

public class temperaturaNiño {
    public static void main(String[] args) {

        int temperatura;
        int edad;
        int dosisParacetamol = 0;
        int kilosNiño;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la edad del niño: ");
        edad = teclado.nextInt();

        System.out.println("Introduce la temperatura del niño: ");
        temperatura = teclado.nextInt();

        System.out.println("Introduce los kilos del niño: ");
        kilosNiño = teclado.nextInt();

        // Verificamos la temperatura primero

        if (temperatura < 38) {
            System.out.println("El niño está bien!");

        } else if (temperatura < 39) {
            System.out.println("Es recomendable darle un baño.");

        } else if (temperatura >= 40) {
            System.out.println("Hay que llevarlo al hospital!");

        } else { // Si la temperatura está entre 39 y 40. Verificamos la edad.

            if (edad < 3) {
                System.out.println("Tienes que consultar al médico.");

            } else if (edad < 12) {
                dosisParacetamol = 15 * kilosNiño;
                System.out.println("Hay que darle " + dosisParacetamol + " mg de paracetamol cada 8h");

            } else { // edad >= 12
                dosisParacetamol = 500;
                System.out.println("Hay que darle " + dosisParacetamol + " mg de paracetamol cada 8h");
            }
        }

        teclado.close();
    }
}