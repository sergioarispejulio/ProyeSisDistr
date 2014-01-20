/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PicoCoffeBreak;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SergioArispe
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void registrarINSERTCOMPRA(int total, int text) {
        Date fecha1 = new Date();
        Connection connection = null;
        Driver driver = new org.apache.derby.jdbc.ClientDriver();
        String URLDerby = "jdbc:derby://localhost:1527/Sucursal1";
        String user = "Sucursal1";
        String password = "Sucursal1";
        Statement statement = null;
        ResultSet resutSet = null;
        try {
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URLDerby, user, password);
            String consulta = "INSERT INTO Compra(Cancelado,Monto_Total,Usuario_Ci,Fecha) VALUES (" + true + "," + total + "," + text + ",'" + fecha1.toString() + "')";
            statement = connection.createStatement();
            statement.execute(consulta);
            statement.close();
            statement = null;
            connection.close();
            connection = null;
        } catch (SQLException ex) {
            //Logger.getLogger(AgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registrarINSERTCOMPRA_VENTA(Producto nue, int pos) {
        Date fecha1 = new Date();
        Connection connection = null;
        Driver driver = new org.apache.derby.jdbc.ClientDriver();
        String URLDerby = "jdbc:derby://localhost:1527/Sucursal1";
        String user = "Sucursal1";
        String password = "Sucursal1";
        Statement statement = null;
        ResultSet resutSet = null;
        try {
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URLDerby, user, password);
            int a = nue.getCantidad() * nue.getPrecio();
            String consulta = "INSERT INTO Compra_Cantidad(Compra_Nro,Producto_Nro,Cantidad,Total) VALUES (" + pos + "," + nue.getNro() + "," + nue.getCantidad() + "," + a + ")";
            statement = connection.createStatement();
            statement.execute(consulta);
            statement.close();
            statement = null;
            connection.close();
            connection = null;
        } catch (SQLException ex) {
            //Logger.getLogger(AgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void registrarUPDATEProducto(Producto nue) {
        int pos = 0;
        Date fecha1 = new Date();
        Connection connection = null;
        Driver driver = new org.apache.derby.jdbc.ClientDriver();
        String URLDerby = "jdbc:derby://localhost:1527/Sucursal1";
        String user = "Sucursal1";
        String password = "Sucursal1";
        Statement statement = null;
        ResultSet resutSet = null;
        try {
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URLDerby, user, password);
            String consulta = "UPDATE Producto SET Cantidad=Cantidad-" + nue.getCantidad() + " WHERE Nro = " + nue.getNro();
            statement = connection.createStatement();
            statement.execute(consulta);
            statement.close();
            statement = null;
            connection.close();
            connection = null;
        } catch (SQLException ex) {
            //Logger.getLogger(AgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int DevolverUltimaCompra() {
        int pos = 0;
        ArrayList<Compra> li = new ArrayList<Compra>();
        Date fecha1 = new Date();
        Connection connection = null;
        Driver driver = new org.apache.derby.jdbc.ClientDriver();
        String URLDerby = "jdbc:derby://localhost:1527/Sucursal1";
        String user = "Sucursal1";
        String password = "Sucursal1";
        Statement statement = null;
        ResultSet resutSet = null;
        try {
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URLDerby, user, password);
            String consulta = "Select * FROM Compra";
            statement = connection.createStatement();
            resutSet = statement.executeQuery(consulta);
            while (resutSet.next()) {
                Compra nue = new Compra();
                nue.setNro(resutSet.getInt("Nro"));
                li.add(nue);
            }
            int a = li.size();
            if (a == 0) {
                pos = 1;
            } else {
                pos = li.get(a - 1).getNro();
            }
            statement.close();
            statement = null;
            connection.close();
            connection = null;
        } catch (SQLException ex) {
            //Logger.getLogger(AgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pos;

    }
}
