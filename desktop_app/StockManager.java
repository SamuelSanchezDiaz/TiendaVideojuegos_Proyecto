public class StockManager {
    public static void main(String[] args) {
        int stock = 10;
        int entrada = 5;
        int salida = 15;

        // Entrada
        stock += entrada;
        System.out.println("Stock tras entrada: " + stock);

        // Salida
        if (stock >= salida) {
            stock -= salida;
            System.out.println("Stock tras venta: " + stock);
        } else {
            System.out.println("Error: No hay suficiente stock.");
        }

        // Comprobar si está agotado
        if (stock == 0) {
            System.out.println("Producto marcado como no disponible.");
        } else {
            System.out.println("Stock disponible.");
        }
    }
}
