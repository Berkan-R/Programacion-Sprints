import java.util.Scanner;

public class edadCurso {
    public static void main(String[] args) {

        int edad;
        int curso = 0;
        int ciclo = -1; // Inicializamos la variable fuera de rango. Porque si no nos mostraría el caso
                        // de cuando el ciclo fuera = 0 y no nos interesa.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la edad del niño: ");
        edad = teclado.nextInt();

        if (edad < 3) {
            System.out.println("Es demasiado pequeño!");
        }

        else if (edad < 6) {
            ciclo = 0;
        }

        else if (edad < 7) {
            curso = 1;
            ciclo = 1;
        }

        else if (edad < 8) {
            curso = 2;
            ciclo = 1;
        }

        else if (edad < 9) {
            curso = 3;
            ciclo = 2;
        } else if (edad < 10) {
            curso = 4;
            ciclo = 2;
        }

        else if (edad < 11) {
            curso = 5;
            ciclo = 3;
        }

        else if (edad < 12) {
            curso = 6;
            ciclo = 3;
        }

        else
            System.out.println("Es demasiado grande!");

        switch (ciclo) {
            case 0:
                System.out.println("Es de educación infantil");
                break;
            case 1:
                System.out.println("Es de educación primaria. Ciclo inicial");
                break;
            case 2:
                System.out.println("Es de educación primaria. Ciclo medio.");
                break;
            case 3:
                System.out.println("Es de educación primaria. Ciclo superior.");
            default:
                break;

        }

        if (ciclo > 0) {
            System.out.println("El curso es: " + curso);
        }

        teclado.close();
    }
}