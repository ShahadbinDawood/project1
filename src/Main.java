import java.util.Random;
import java.util.Scanner;

public class Main {
    static String winer ;
    static int winUserCounter=0 ;
    static int winComputerCounter=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean done = false;
        System.out.println("Do you want to play one round or three? (Enter 1 or 3): ");
        int totalRoundsToPlay = Integer.parseInt(input.nextLine());
        int round = 1;


        while (!done) {
            boolean isFinshturn = false;
            int turns = 0;
            String[][] arr = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
            System.out.println("---  "+round+" round ---");
            System.out.println("YOU ARE X !");
            print2D(arr);

            while (!isFinshturn) {
                boolean checkUserTurn = false;
                while (!checkUserTurn) {
                    System.out.println("Enter the position you want : ");
                    String userInput = input.nextLine();
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr.length; j++) {
                            if (userInput.contains(arr[i][j])) {
                                arr[i][j] = "X";
                                checkUserTurn = true;
                                turns++;

                            }
                        }
                    }
                }
                isFinshturn = isWin(arr);
                if (isFinshturn) break;

                if (turns == 9) {
                    winer = "It's a Draw!";
                    isFinshturn = true;
                    break;
                }
                boolean checkComputerTurn = false;
                while (!checkComputerTurn) {

                    for (int i = 0; i < arr.length && !checkComputerTurn; i++) {
                        for (int j = 0; j < arr[i].length && !checkComputerTurn; j++) {
                            String computer = String.valueOf((int) rand.nextInt(9)+1);
                            if (arr[i][j].contentEquals(computer)) {
                                arr[i][j] = "O";
                                checkComputerTurn = true;
                                turns++;

                            } else {
                                continue;
                            }

                        }
                    }

                }

                print2D(arr);
                isFinshturn = isWin(arr);
            }
            if (totalRoundsToPlay == 1) {
                done = true;
            } else if (winUserCounter == 2 || winComputerCounter == 2 || round >= 3) {
                done = true;
            }

            round++;
        }
        if (winUserCounter > winComputerCounter) {
            System.out.println("CONGRATULATIONS! YOU WON THE MATCH!");
        } else if (winComputerCounter > winUserCounter) {
            System.out.println("GAME OVER! THE COMPUTER WON THE MATCH!");
        } else {
            System.out.println("THE MATCH ENDED IN A TIE!");
        }

    }

    public static void print2D(String[][] mat) {
        for (String[] row : mat) {
            System.out.println(row[0] + '|' + row[1] + '|' + row[2] + "\n-----");
        }
    }

    public static boolean isWin(String[][] arr) {
        for (int row = 0; row < 3; row++) {
            if (arr[row][0].equals(arr[row][1]) && arr[row][1].equals(arr[row][2])) {
                if(arr[row][0].equals("X")){
                    winer="X wins!";
                    winUserCounter++;
                }else {
                    winer="O win!";
                    winComputerCounter++;
                }
                return true;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (arr[0][col].equals(arr[1][col]) && arr[1][col].equals(arr[2][col])) {
                if(arr[0][col].equals("X")){
                    winer="X wins!";
                    winUserCounter++;
                }else {
                    winer="O win!";
                    winComputerCounter++;
                }
                return true;
            }
        }
        if (arr[0][0].equals(arr[1][1]) && arr[1][1].equals(arr[2][2])) {
            if(arr[0][0].equals("X")){
                winer="X wins!";
                winUserCounter++;
            }else {
                winer="O win!";
                winComputerCounter++;
            }
            return true ;
        }
        if  (arr[0][2].equals(arr[1][1]) && arr[1][1].equals(arr[2][0])){
            if(arr[2][0].equals("X")){
                winer="X wins!";
                winUserCounter++;
            }else {
                winer="O win!";
                winComputerCounter++;
            }
            return true ;
        }
        return false;
    }
}

