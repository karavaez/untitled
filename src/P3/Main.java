package P3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет! Это калькулятор!");
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введи первое число:");
            int num1 = in.nextInt();
            System.out.print("Введи второе число:");
            int num2 = in.nextInt();
            while (true) {
                System.out.print("Введи цифру соответствующую действию: \n 1 = + \n 2 = - \n 3 = * \n 4 = / \n");
                int num3 = in.nextInt();
                switch (num3) {
                    case 1:
                        System.out.printf("+ = %d \n", num1 + num2);
                        break;
                    case 2:
                        System.out.printf("- = %d \n", num1 - num2);
                        break;
                    case 3:
                        System.out.printf("* = %d \n", num1 * num2);
                        break;
                    case 4:
                        System.out.printf("/ = %.2f \n", (double) num1 / num2);
                        break;
                    default:
                        System.out.println("Введенная цифра не соответствует заданным  1,2,3,4");
                }
                if (num3 == 1) break;
                if (num3 == 2) break;
                if (num3 == 3) break;
                if (num3 == 4) break;
            }
        }





            }

    }
