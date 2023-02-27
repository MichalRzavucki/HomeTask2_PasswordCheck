import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userPassword = "Очень сложный пароль";
        String stopWord = "Выход";

        while (true) {
            System.out.println("Введите пароль:");
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();

            boolean passwordCheck = password.equals(userPassword);

            if ((!password.equals(stopWord)) && !passwordCheck) {
                System.out.println("Неверный пароль, введите пароль ещё раз!");
            } else if (password.equals(stopWord)) {
                System.out.println("Вы передумали логиниться :(");
                break;
            } else {
                System.out.println("Вы вошли в систему :)");
                break;
            }
        }

    }
}
