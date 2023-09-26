package P3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number1:");
        int num1 = in.nextInt();
        System.out.print("Input number2:");
        int num2 = in.nextInt();
        System.out.print("Choose an action: \n 1 = + \n 2 = - \n 3 = * \n 4 = / \n");
        int num3 = in.nextInt();
        switch (num3){
            case 1:
                System.out.printf("+ = %d \n", num1+num2);
                break;
            case 2:
                System.out.printf("- = %d \n", num1-num2);
                break;
            case 3:
                System.out.printf("* = %d \n", num1*num2);
                break;
            case 4:
                System.out.printf("/ = %.2f", (double) num1/num2);
        }





            }

    }
