import java.util.Scanner;

public class p10_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int n = Integer.parseInt(scan.nextLine());
 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%s ", i);
            }
            System.out.println();
        }
    }
}