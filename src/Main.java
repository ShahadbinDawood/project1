import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String [][] arr ={{"1","2","3"},{"4","5","6"},{"7","8","9"}};


        System.out.println("--- 1 round "+"---");

        while (true){
            System.out.println("YOU ARE X !");
            print2D(arr);
            System.out.println("Enter the position you want : ");
            String userInput = input.nextLine();

            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if(userInput.contains(arr[i][j])){
                        arr[i][j]="X";

                    }
                }
            }
            boolean checkComputerTurn = false ;
            while (!checkComputerTurn){

            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j < arr.length; j++) {

                        String  computer = String.valueOf((int) rand.nextInt(1,10));
                        if(arr[i][j].contentEquals(computer)) {
                        arr[i][j] = "O";
                        checkComputerTurn=true;

                    }else {
                            continue;
                        }

                    }
                }
            }



        }


    }

    public static void print2D(String[][] mat)
    {
        for (String[] row : mat) {
            System.out.println(row[0]+'|'+row[1]+'|'+row[2]+"\n-----");
        }
    }

    }

