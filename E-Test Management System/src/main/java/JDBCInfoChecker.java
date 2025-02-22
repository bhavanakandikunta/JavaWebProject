public class JDBCInfoChecker {
    public static void main(String[] args) {
        try {
            // Attempt to load the JDBC driver class dynamically
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // If the above line executes without throwing an exception, the driver is available
            System.out.println("ojdbc driver is available in the classpath.");
        } catch (ClassNotFoundException e) {
            // If the driver class is not found, catch the exception and print a message
            System.out.println("ojdbc driver is not available in the classpath.");
            e.printStackTrace();
        }
    }
}
