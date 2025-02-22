package exam.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Provider {
    
    public static Connection getOracleConnection()
    {
        Connection con = null;
        try
        { 
        	
        	Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish connection
           con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "ep");

        }
        catch (Exception e) {
            System.out.println("Error occurred while connecting to the Oracle database:");
            e.printStackTrace();
        }
        
        return con;
    }
}
