import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String [][] arr ={{"1","2","3"},{"4","5","6"},{"7","8","9"}};


        System.out.println("--- 1 round "+"---");
        print2D(arr);
        while (true){
            System.out.println("YOU ARE X !");
            System.out.println("Enter the position you want : ");

            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j]=input.nextLine();
                }
            }

        }




        /*
        String [][] arr =new  String[3][3];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=input.nextLine();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

         */


    }

    public static void print2D(String[][] mat)
    {
        for (String[] row : mat) {
            System.out.println(row[0]+'|'+row[1]+'|'+row[2]+"\n-----");
        }
    }

    }

