
import javax.swing.*;
import java.util.Scanner;
public class Calculator {
    static void FaultiCalculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~Welcome to the Java calculator~~~~");
        System.out.println();
        System.out.println("Please enter your choice");
        System.out.println("1.For addition\n2.For substraction\n3.For multiplication\n4. For the division: ");
        int ch = sc.nextByte();
        switch (ch) {
            case 1 -> {
                System.out.print("Enter a number like 56 or something : ");
                float a = sc.nextFloat();
                System.out.print("Enter any number here : ");
                float b = sc.nextFloat();
                if (a == 56) {
                    System.out.print("Your result is: ");
                    System.out.println(a + b + 20);
                } else {
                    System.out.println("Your result is: ");
                    System.out.println(a + b);
                }
            }
            case 2 -> {
                System.out.print("Enter a number like 77 or something  : ");
                float c = sc.nextFloat();
                System.out.print("Enter any number here : ");
                float d = sc.nextFloat();
                if (c == 77) {
                    System.out.println("Your result is: ");
                    System.out.println(c - d - 10);
                } else {
                    System.out.println("Your result is: ");
                    System.out.println(c - d);
                }
            }
            case 3 -> {
                System.out.print("Enter a number like 34 or something : ");
                float e = sc.nextFloat();
                System.out.print("Enter any number here : ");
                float f = sc.nextFloat();
                if (e == 34) {
                    System.out.println("Your result is: ");
                    System.out.println(e * f * 25);
                } else {
                    System.out.println("Your result is: ");
                    System.out.println(e * f);
                }
            }
            case 4 -> {
                System.out.print("Enter a number like 75 or something : ");
                float g = sc.nextFloat();
                System.out.print("Enter any number here : ");
                float h = sc.nextFloat();
                if (g == 75) {
                    System.out.println("Your result is: ");
                    System.out.println(g / h + 5);
                } else {
                    System.out.println("Your result is: ");
                    System.out.println(g / h);
                }
            }
        }

    }
    public static void main(String[] args) {
        FaultiCalculator();
    }
}
