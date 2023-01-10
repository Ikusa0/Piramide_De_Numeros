import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int height = scanner.nextInt();

        System.out.println();

        for (int i = 1; i <= height; i++) {
            System.out.println(String.valueOf(i).repeat(i));
        }
    }
}
