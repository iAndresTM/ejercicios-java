# ☕ Ejercicios en Java

Repositorio creado con el propósito de practicar y mejorar mis habilidades en **Java**, desarrollando pequeños programas y ejercicios lógicos.

---

## 📘 Primer ejercicio: *Adivina el número*

### 🧩 Descripción
Este es un sencillo juego de consola en el cual el programa genera un número aleatorio entre **1 y 100**, y el usuario debe intentar adivinarlo en un máximo de **5 intentos**.

Durante el juego, el programa indicará si el número ingresado es **mayor o menor** al número secreto, hasta que el usuario acierte o se le acaben los intentos.

---

### 💻 Código fuente
Archivo: [`adivinarNumero.java`](./adivinarNumero.java)

```java
import java.util.Random;
import java.util.Scanner;

public class adivinarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ramdomNumer = new Random().nextInt(100);
        int intentos = 0;
        int numero = 0;

        while (intentos < 5) {
            System.out.println("Digita un número del 1 al 100: ");
            numero = teclado.nextInt();
            if (ramdomNumer == numero) {
                System.out.println("¡Felicidades, has acertado!");
                break;
            } else if (ramdomNumer < numero) {
                System.out.println("El número es menor");
                intentos++;
            } else if (ramdomNumer > numero) {
                System.out.println("El número es mayor");
                intentos++;
            }
            if (intentos == 5) {
                System.out.println("Has superado la cantidad máxima de intentos, perdiste :(");
            }
        }
    }
}
```

## 🛠️ Tecnologías utilizadas

- Lenguaje: Java 17+
- IDE recomendado: Visual Studio Code / IntelliJ IDEA / NetBeans

## 🧠 Próximos ejercicios
🚀 Se agregarán más ejercicios para practicar:
- Estructuras de control  
- Funciones y procedimientos  
- Arreglos  
- Programación orientada a objetos
