package main;

import patron.DatabaseConnection;

public class Main {

    public static void main(String[] args) {

        // Módulo Carrito
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.ejecutarConsulta("SELECT * FROM carrito");

        // Módulo Inventario
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.ejecutarConsulta("SELECT * FROM inventario");

        // Módulo Reportes
        DatabaseConnection db3 = DatabaseConnection.getInstance();
        db3.ejecutarConsulta("SELECT * FROM reportes");

        // Verificación
        System.out.println("Hash db1: " + db1.hashCode());
        System.out.println("Hash db2: " + db2.hashCode());
        System.out.println("Hash db3: " + db3.hashCode());
    }
}