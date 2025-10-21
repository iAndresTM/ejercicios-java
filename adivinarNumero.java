// Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100, y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos. En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor que el número generado.

// Consejos:

// Para generar un número aleatorio en Java: new Random().nextInt(100);

// Utiliza el Scanner para obtener los datos del usuario.

// Utiliza una variable para contar los intentos.

// Utiliza un bucle para controlar los intentos.

// Utiliza la instrucción ‘break;’ para salir del bucle.

import java.util.Random;
import java.util.Scanner;

public class adivinarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ramdomNumer = new Random().nextInt(100);
        int intentos = 0;
        int numero = 0;

        while (intentos < 5) {
            System.out.println("Digita un numero del 1 al 100: ");
            numero = teclado.nextInt();
            if (ramdomNumer == numero) {
                System.out.println("Felicidades haz acertado");
                break;
            }else if (ramdomNumer < numero) {
                System.out.println("El numero es menor");
                intentos++;
            }else if (ramdomNumer > numero) {
                System.out.println("El numero es mayor");
                intentos++;
            }else{
                System.out.println("El numero ingresado es erroneo");
            }
            if (intentos == 5) {
                System.out.println("Haz superado la cantidad maxima de intentos perdiste :(");
            }
        }

    }
}
