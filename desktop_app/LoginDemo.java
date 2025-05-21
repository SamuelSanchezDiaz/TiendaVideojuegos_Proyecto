import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        String userCorrecto = "admin";
        String passwordCorrecta = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce usuario: ");
        String inputUser = scanner.nextLine();

        System.out.print("Introduce contraseña: ");
        String inputPassword = scanner.nextLine();

        if (inputUser.isEmpty() || inputPassword.isEmpty()) {
            System.out.println("Error: Los campos no pueden estar vacíos.");
        } else if (!inputUser.equals(userCorrecto)) {
            System.out.println("Error: Usuario no encontrado.");
        } else if (!inputPassword.equals(passwordCorrecta)) {
            System.out.println("Error: Contraseña incorrecta.");
        } else {
            System.out.println("Acceso concedido.");
        }
    }
}
