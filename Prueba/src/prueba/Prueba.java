/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SergioArispe
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection connection = null;
        Driver driver = new org.apache.derby.jdbc.ClientDriver();
        String URLDerby = "jdbc:derby://localhost:1527/Central";
        String user = "Central";
        String password = "Central";
        Statement statement = null;
        try {
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URLDerby, user, password);
            int aux = 2;
            String consulta = "INSERT INTO Producto(Nombre, Precio) VALUES ('Manzana','"+aux+"')";
            statement = connection.createStatement();
            statement.executeUpdate(consulta);
            //resutSet = statement.executeQuery(consulta);
            //Recorremos el Resultset
            //while (resutSet.next()) {
              //  ;
            //}
            statement.close();
            statement= null;
            connection.close();
            connection=null;
        } catch (SQLException ex) {
            
        }
    }
}
