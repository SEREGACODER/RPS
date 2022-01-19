
import java.util.Random;
import java.util.Scanner;

public class MainRPS {
    public  static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"к", "б", "н"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("Камень, ножницы, бумага? Выбирай!");
                playerMove = scanner.nextLine();
                if (playerMove.equals("к") || playerMove.equals("б") || playerMove.equals("н")) {
                    break;
                }
                System.out.println(playerMove + " Ты ввел чушь,  введи: к -  для камень, б - для бумага, н - для ножниц.");
            }

            System.out.println("Компукшер выбрал: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("Ничья");
            } else if (playerMove.equals("к")) {
                if (computerMove.equals("б")) {
                    System.out.println("Поражение");

                } else if (computerMove.equals("н")) {
                    System.out.println("Победа");
                }


            } else if (playerMove.equals("б")) {
                if (computerMove.equals("н")) {
                    System.out.println("Поражение");

                } else if (computerMove.equals("к")) {
                    System.out.println("Победа");
                }


            } else if (playerMove.equals("н")) {
                if (computerMove.equals("к")) {
                    System.out.println("Поражение");

                } else if (computerMove.equals("б")) {
                    System.out.println("Победа");
                }
            }

            System.out.println("Ещё разок?");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("+")){
                break;
            }
        }
        scanner.close();
    }
}
