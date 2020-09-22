import java.util.Scanner;
public class sumAvg {
    public static void main(String[] args) {
        int n, sum = 0;
        float average;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter no.of elements:");
        n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i <= n; i++) {
            a[i] = scan.nextInt();
            sum = sum + a[i];
        }
        System.out.println("sum:" + sum);
        average = (float) sum / n;
        System.out.println("average:" + average);
    }
}





        }

    }

}
