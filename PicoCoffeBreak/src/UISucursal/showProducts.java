/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UISucursal;

import PicoCoffeBreak.Producto;
import PicoCoffeBreak.Usuario;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oscar
 */
public class showProducts extends javax.swing.JFrame {

    public Producto prod = new Producto();
    public DefaultTableModel model = new DefaultTableModel();
    public ArrayList<Producto> lista = new ArrayList<>();

    public showProducts() {
        initComponents();
        fillTable();
    }

    private void obtainAllProducts() {

        Connection connection = null;
        Driver driver = new org.apache.derby.jdbc.ClientDriver();
        String URLDerby = "jdbc:derby://localhost:1527/Sucursal1";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URLDerby, "Sucursal1", "Sucursal1");
            String consulta = "SELECT * FROM Producto";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(consulta);
            while (resultSet.next()) {
                prod = new Producto();
                prod.setNro(resultSet.getInt("Nro"));
                prod.setNombre(resultSet.getString("Nombre"));
                prod.setPrecio(resultSet.getInt("Precio"));
                lista.add(prod);
            }
            resultSet.close();
            resultSet = null;
            statement.close();
            statement = null;
            connection.close();
            connection = null;
        } catch (SQLException ex) {
        }
    }

    private void fillTable() {
        obtainAllProducts();
        model.setColumnIdentifiers(new String[]{"Nro", "Nombre", "Precio"});
        for (Producto prodActual : lista) {
            model.addRow(new String[]{prodActual.getNro().toString(), prodActual.getNombre(), prodActual.getPrecio().toString()});
            System.out.println(prodActual.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Productos");

        jTable1.setModel(model);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(169, 169, 169)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .add(25, 25, 25)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 381, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(165, 165, 165)
                        .add(jButton1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 251, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        mainViewSucursal mvs = new mainViewSucursal();
        mvs.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(showProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showProducts().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
