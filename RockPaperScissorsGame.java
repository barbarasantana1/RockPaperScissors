class Choices {
    int rock = 0;
    int paper = 1;
    int scissors = 2;
    String[] choicesgame = {"rock", "paper", "scissors"};
}

class RockPaperScissors {
    void startGame() {
        int computerChoice = (int) (Math.random() * 3);
        int playerChoice = (int) (Math.random() * 3);

        Choices listchoices = new Choices();

        if (playerChoice == computerChoice) {
            System.out.println("computer: " + listchoices.choicesgame[computerChoice] + " you: " + listchoices.choicesgame[playerChoice]);
            System.out.println("It's a draw!");
        } else if (playerChoice == 0 && computerChoice == 2) {
            System.out.println("computer: " + listchoices.choicesgame[computerChoice] + " you: " + listchoices.choicesgame[playerChoice]);
            System.out.println("You won!");
        } else if (playerChoice == 1 && computerChoice == 0) {
            System.out.println("computer: " + listchoices.choicesgame[computerChoice] + " you: " + listchoices.choicesgame[playerChoice]);
            System.out.println("You won!");
        } else if (playerChoice == 2 && computerChoice == 1) {
            System.out.println("computer: " + listchoices.choicesgame[computerChoice] + " you: " + listchoices.choicesgame[playerChoice]);
            System.out.println("You won!");
        } else {
            System.out.println("computer: " + listchoices.choicesgame[computerChoice] + " you: " + listchoices.choicesgame[playerChoice]);
            System.out.println("You lost!");
        }
    }
}

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.startGame();
    }
}