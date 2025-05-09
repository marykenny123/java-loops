import java.sql.SQLOutput;

public class StrawberryFields {

    //Escribe un programa que permita imprimir la canción Strawberry Fields Forever con un bucle. Solo puedes tener
    // 2 funciones, una que imprima los versos y otra que imprima el coro.
    //Busca información sobre bucles anidados.
    //Al final está la letra completa

    public static void main(String[] args) {
        System.out.println("Strawberry Fields Forever\n");
        for (int chorusCount = 1; chorusCount <= 4; chorusCount++) {
            playChorus();
            for (int verseCount = chorusCount; verseCount <= chorusCount; verseCount++) {
                playVersus(verseCount);
            }


        }
    }

    public static void playVersus(int verseNumber) {
        if (verseNumber == 1) {
            System.out.println("Living is easy with eyes closed\nMisunderstanding all you see\nIt's getting hard to be someone, but it all works out");
            System.out.println();
        } else if (verseNumber == 2) {
            System.out.println("No one I think is in my tree\nI mean, it must be high or low\nThat is, you can't, you know, tune in, but it's alright\nThat is, I think it's not too bad");
            System.out.println();
        } else if (verseNumber == 3) {
            System.out.println("Always, no sometimes, think it's me\nBut you know, I know when it's a dream\nI think I know, I mean a yes\nBut it's all wrong\nThat is, I think I disagree");
            System.out.println();
        }
    }

    public static void playChorus() {
        System.out.println("Let me take you down\n'Cause I'm going to strawberry fields\nNothing is real\nAnd nothing to get hung about\nStrawberry fields forever\n");
    }
}

/**

 * Function name: playVersus
 *
 * @param number (int)
 *
 * Inside the function:n
 * 1. print versus according the position number
 */

/**
 * Function name: playChorus
 *
 * Inside the function:
 * 1. print chorus
 */


/*
Strawberry Fields Forever

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever

Living is easy with eyes closed
Misunderstanding all you see
It's getting hard to be someone, but it all works out
It doesn't matter much to me

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever

No one I think is in my tree
I mean, it must be high or low
That is, you can't, you know, tune in, but it's alright
That is, I think it's not too bad

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever

Always, no sometimes, think it's me
But you know, I know when it's a dream
I think I know, I mean a yes
But it's all wrong
That is, I think I disagree

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever
*/

