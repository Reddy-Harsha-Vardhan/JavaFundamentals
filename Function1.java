import java.util.Scanner;

public class Function1 {
    public static void main(String[] args)
    {
        System.out.println("Please enter your age: ");
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            if (age >= 21)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}