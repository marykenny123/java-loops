public class ForLoops {
    public static void main(String[] args) {

        //Escribe un bucle for que imprima números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        //Escribe un bucle for que imprima "¡Hola FemCoders!" 5 veces
        for (int i=0; i<5;i++) {
            System.out.println("¡Hola FemCoders!");
        }
        //System.out.println("\n");

        //Escribe un bucle for que imprima la tabla de multiplicar del número 7 (del 1 al 10)
        for (int i=1;i<=10;i++) {
            int mult = 7 * i;
            System.out.print(mult + " ");
        }
        System.out.print("\n");

        //Escribe un bucle for que imprima números del 10 al 1
        for (int i=10;i>=1;i--) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        //Escribe un bucle for que imprima los 10 primeros números impares
        for (int i=1;i<=20;i++) {
            if (!((i%2) == 0)) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
        //Escribe un bucle for que encuentre el número más pequeño que sea mayor a 20 y que sea divisible para 8,
        // usando 'break'.
        //Imprime: El número más pequeño mayor de 20 que es divisible para 8 es <result>

        for (int i=20;i<100;i++) {
            if ((i%8)==0) {
                System.out.println("El número más pequeño mayor de 20 que es divisible por 8 es: " + i);
                break;
            }
        }

        //Escribe un bucle for que imprima números pares del 1 al 20 saltando los números impares usando 'continue'
        for (int i=1;i<=20;i++) {
            if ( (!(i%2 == 0)) ) {
                System.out.print(i + " ");
                continue;
            }
        }

    }
}