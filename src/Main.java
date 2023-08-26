import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while(true) {
            number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 1:
                    String userName = scanner.nextLine();
                    String password = scanner.nextLine();
                    String dob = scanner.nextLine();
                    String gender = scanner.nextLine();
                    String qualification = scanner.nextLine();
                    System.out.println("vignesh");
            }
        }

    }
}
   /* Placement Portal:
        1. New user registration
        2. user login
        3. New company registration
        4. company login
        5. company -> vacancy-> y/n ; required skills

        6. user applies to the company
        7. accept/reject user
        8. stop*/