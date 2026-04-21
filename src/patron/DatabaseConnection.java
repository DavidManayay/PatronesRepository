package patron;

public class DatabaseConnection {

    private static volatile DatabaseConnection instancia;
    private String url;

    private DatabaseConnection() {
        url = "jdbc:mysql://localhost:3306/miBD";
    }

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

    public void ejecutarConsulta(String sql) {
        System.out.println("SQL: " + sql +
                " | ID Instancia: " + this.hashCode());
    }
}