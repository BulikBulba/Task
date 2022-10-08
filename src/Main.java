import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int toGuessNumber = rand.nextInt(100); // число которое нужно угадать
        int OfTriesNumber = 0; // количество попыток
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        System.out.println( "Загадано число от 1 до 100" );

        while (win == false) {

            System.out.print( "Введите число:" );
            guess = input.nextInt();

            OfTriesNumber++;

            if (guess == toGuessNumber) {
                win = true;
            }
            else if (guess < toGuessNumber) {
                System.out.println("Я сам в шоке, но, загаданное число больше, брат");
            }
            else if (guess > toGuessNumber) {
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
            }
        }
        System.out.println("Вы выиграли!");
        System.out.println("Загаданное число: " + toGuessNumber);
        System.out.println("Количество попыток Ваших попыток: " + OfTriesNumber);
    }
}


