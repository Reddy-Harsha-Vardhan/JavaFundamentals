import java.util.Scanner;
public class LapTop {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int x=0;
            for(int i=1;i<=10;i++) {
                x = a * i;
                System.out.println( a+" *" + i + "=" +x);
            }
        }
    }
}
