import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
/*
        // Mary -> he añadido de imprimir el num aleatorio y num de bucles para revisar, dado que el ej no lo pide lo
        // he dejado comentado

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función
        // getRandomNumber
        int random = 1;
        int i =1; //   para mi control
        while (!(random == 7)) {
            random = (getRandomNumber(50));
            //System.out.println("El número aleatorio es " + random + " y ha corrido el bucle " + i + " veces.");
            //i++;
        }

        System.out.println("\n");

        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la
        // función getRandomNumber
        while (!(random >= 70)) {
            random = (getRandomNumber(150));
                //System.out.println("El núm aleatorio es " + random + " y ha corrido el bucle " + i + " veces.");
                //i++;
        }

        System.out.println("\n");
*/
        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número
        // aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después
        // de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado.
        // Has de usar la función getRandomNumber

        int random = 1;
        int userGuess;
        Scanner scanner = new Scanner(System.in);
        System.out.print("P fv teclea tu número entre 1 y 100 y dar a intro.\t");
        random = getRandomNumber(100);
        do {
            userGuess = scanner.nextInt();
            if (random > userGuess) {
                System.out.println("Tu número es menor que el número aleatorio.");
            } else if (random < userGuess){
                System.out.println("Tu número es mayor que el número aleatorio.");
            }
        }
            while (!(userGuess == random));
        System.out.println("Has acertado.");
        scanner.close();
    }

    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){
        return (int)(Math.random() * number) + 1;
    }
}
