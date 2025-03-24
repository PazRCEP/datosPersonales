import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hola");
 	System.out.println("rama1");

        try {
            // Solicitar datos personales al usuario
            System.out.println("Introduce tu nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Introduce tu edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.println("Introduce tu correo electrónico: ");
            String email = scanner.nextLine();

            System.out.println("Introduce tu dirección: ");
            String direccion = scanner.nextLine();

            // Escribir los datos en un fichero
            String rutaFichero = "datos_personales.txt";
            try (FileWriter escritor = new FileWriter(rutaFichero)) {
                escritor.write("Nombre: " + nombre + "\n");
                escritor.write("Edad: " + edad + "\n");
                escritor.write("Correo electrónico: " + email + "\n");
                escritor.write("Dirección: " + direccion + "\n");
            }

            System.out.println("Los datos se han guardado correctamente en el fichero " + rutaFichero);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar los datos: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error en la entrada de datos: " + e.getMessage());
        } finally {
            scanner.close();

        }
    }
}
