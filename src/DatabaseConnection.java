public class DatabaseConnection {

    private static volatile DatabaseConnection instancia;
    private String url;

    // Constructor privado
    private DatabaseConnection() {
        url = "jdbc:mysql://localhost:3306/miBD";
    }

    // Método Singleton
    public static DatabaseConnection getInstance() {
        if (instancia == null) {
            synchronized (DatabaseConnection.class) {
                if (instancia == null) {
                    instancia = new DatabaseConnection();
                }
            }
        }
        return instancia;
    }

    // Simular consulta
    public void ejecutarConsulta(String sql) {
        System.out.println("SQL: " + sql +
                " | ID Instancia: " + this.hashCode());
    }
}