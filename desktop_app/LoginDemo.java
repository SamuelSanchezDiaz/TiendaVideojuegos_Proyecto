public class LoginDemo {
    public static void main(String[] args) {
        String user = "admin";
        String password = "1234";

        String inputUser = "admin";
        String inputPassword = "1234";

        if (user.equals(inputUser) && password.equals(inputPassword)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}