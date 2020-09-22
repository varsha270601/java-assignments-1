import java.util.Scanner;
public class sample2 {
    public static void main(String[] args) {
        int i, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("give a number:");
        int number = sc.nextInt();
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + number + " is:" + fact);
    }
}
