import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();

        if (quantidade < 1) {
            System.out.println("Status: Em falta.");
        } else if (quantidade < 5) {
            System.out.println("Status: Alerta de estoque baixo.");
        } else {
            System.out.println("Status: Estoque Ok");
        }

        scanner.close();
    }
}