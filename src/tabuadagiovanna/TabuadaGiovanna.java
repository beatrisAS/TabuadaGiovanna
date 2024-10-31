package tabuadagiovanna;

/**
 *
 * @author beatris
 */
public class TabuadaGiovanna {

 public static void main(String[] args) {
        // Laço para gerar as tabuadas de 6 a 10
        for (int numero = 6; numero <= 10; numero++) {
            System.out.println("Tabuada do " + numero + ":");
            
            // Laço para calcular os múltiplos de 1 a 10 do número atual
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            
            System.out.println(); // Linha em branco para separar as tabuadas
        }
    }
}