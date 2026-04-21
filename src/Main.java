public class Main {
    public static void main(String[] args) {

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.ejecutarConsulta("SELECT * FROM carrito");

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.ejecutarConsulta("SELECT * FROM inventario");

        DatabaseConnection db3 = DatabaseConnection.getInstance();
        db3.ejecutarConsulta("SELECT * FROM reportes");

        // Verificación
        System.out.println("Hash db1: " + db1.hashCode());
        System.out.println("Hash db2: " + db2.hashCode());
        System.out.println("Hash db3: " + db3.hashCode());
    }
}