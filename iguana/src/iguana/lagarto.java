import java.util.Random;

public class iguana {

    public static void main(String[] args) {
        int filas = 5;  // Puedes cambiar el número de filas
        int columnas = 5;  // Puedes cambiar el número de columnas
        
        int[][] matriz = new int[filas][columnas];

        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100); 
            }
        }

        System.out.println("Matriz de números aleatorios:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t"); // Imprimir el número con tabulación
            }
            System.out.println();
        }
    }
}
