package Common;

import java.util.Scanner;

public class Library {
    private Scanner sc;

    public Library() {
        sc = new Scanner(System.in);
    }

    public int getInt(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }

    public double getDouble(String prompt) {
        double val;
        while (true) {
            System.out.print(prompt);
            try {
                String input = sc.nextLine();
                val = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return val;
    }
}