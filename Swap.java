import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("\nThe numbers before swapping are a=" + a + " and b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The numbers after swapping a=" + a + " and b=" + b);
    }
}