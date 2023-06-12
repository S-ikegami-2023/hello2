import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int secretNumber = 42; // プログラマが設定した数
        int maxAttempts = 5; // ユーザが入力できる回数
        int attempts = 0; // ユーザの試行回数

        System.out.println("数当てゲームを開始します！");
        System.out.println("2桁の正の整数を予想して入力してください。");

        Scanner scanner = new Scanner(System.in);

        while (attempts < maxAttempts) {
            System.out.print("予想した数を入力してください: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("当たり！おめでとうございます！");
                break;
            } else {
                if (guess > secretNumber) {
                    System.out.println("入力した数は設定された数より大きいです。");
                } else {
                    System.out.println("入力した数は設定された数より小さいです。");
                }

                int difference = Math.abs(guess - secretNumber);
                if (difference >= 20) {
                    System.out.println("20以上の差があります。");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("ゲームオーバー！正解は " + secretNumber + " でした。");
            }
        }

        scanner.close();
    }
}