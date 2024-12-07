class RockPaperScissors {
    String[] choicesList = {"rock", "paper", "scissors"};
    int computerChoice = (int) (Math.random() * 3);
    int playerChoice = (int) (Math.random() * 3);

    void startGame() {
        String resultMessage = "computer: " + choicesList[computerChoice] + " you: " + choicesList[playerChoice];

        if (playerChoice == computerChoice) {
            System.out.println(resultMessage);
            System.out.println("It's a draw!");
        } else if (playerChoice == 0 && computerChoice == 2) {
            System.out.println(resultMessage);
            System.out.println("You won!");
        } else if (playerChoice == 1 && computerChoice == 0) {
            System.out.println(resultMessage);
            System.out.println("You won!");
        } else if (playerChoice == 2 && computerChoice == 1) {
            System.out.println(resultMessage);
            System.out.println("You won!");
        } else {
            System.out.println(resultMessage);
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
