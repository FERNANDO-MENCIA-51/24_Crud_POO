
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_02","root","");
        } catch (Exception e) {        
        }
    }
    public Connection getConnection(){
            return con;   
    }
}
