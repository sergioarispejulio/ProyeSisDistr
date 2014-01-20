/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package central;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SergioArispe
 */
public class Ventas extends javax.swing.JFrame {

    
    ArrayList<Producto> lista = new ArrayList<Producto>();
    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
        Connection connection = null;
        Driver driver = new org.apache.derby.jdbc.ClientDriver();
        String URLDerby = "jdbc:derby://localhost:1527/Central";
        String user = "Central";
        String password = "Central";
        Statement statement = null;
        ResultSet resutSet = null;
        try {
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URLDerby, user, password);
            String consulta = "SELECT * FROM Producto";
            statement = connection.createStatement();
            resutSet = statement.executeQuery(consulta);
            while (resutSet.next()) {
                Producto nue = new Producto();
                nue.setNro(resutSet.getInt("Nro"));
                nue.setNombre(resutSet.getString("Nombre"));
                nue.setPrecio(resutSet.getInt("Precio"));
                lista.add(nue);
                jComboBox1.addItem(nue.getNombre());
            }       
            resutSet.close();
            resutSet = null;
            statement.close();
            statement= null;
            connection.close();
            connection=null;
        } catch (SQLException ex) {
            //Logger.getLogger(AgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        jRadioButton1.setEnabled(true);
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
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccionar Producto");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sucursal", "Cantidad", "Monto Pagado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Global");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Por Sucursal");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sucursal 1", "Sucursal 2", "Sucursal 3", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar Por");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButton1)
                        .addGap(117, 117, 117)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton2)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jTable1.removeAll(); 
        Producto sele = lista.get(jComboBox1.getSelectedIndex());
        List<CompraCantidad> lista;
        String titulos[] = {"Sucursal", "Cantidad", "Monto Pagado"};
        String datos[][] = {};
        DefaultTableModel algo = new DefaultTableModel(datos, titulos);
        if(jRadioButton1.isSelected()==true)
        {
            lista = Singleton.getSingleton().ObtenerCompraProducto_Sucursal1();
            //lista1 = Singleton.getSingleton().ObtenerCompra_Sucursal1();
            while(lista.isEmpty() == false)
            {
                CompraCantidad n = new CompraCantidad();
                n = lista.get(0);
                if(sele.getNro() == n.getCompraCantidadPK().getProductoNro())
                {
                    Object data[] = {"Sucursal#1",n.getCantidad(), n.getTotal()};
                    algo.addRow(data);
                }
                /*for(int i = 0; i < lista1.size(); i++)
                {
                    if(lista1.get(i).getNro() == n.getCompraCantidadPK().getCompraNro())
                    {
                        Object data[] = {"Sucursal#1", lista1.get(i).getFecha() ,n.getCantidad(), n.getTotal()};
                        algo.addRow(data);
                        break;
                    }
                }*/
                lista.remove(0);
                
            }   
            lista = Singleton.getSingleton().ObtenerCompraProducto_Sucursal2();
            //lista1 = Singleton.getSingleton().ObtenerCompra_Sucursal2();
            while(lista.isEmpty() == false)
            {
                CompraCantidad n = new CompraCantidad();
                n = lista.get(0);
                if(sele.getNro() == n.getCompraCantidadPK().getProductoNro())
                {
                    Object data[] = {"Sucursal#2",n.getCantidad(), n.getTotal()};
                    algo.addRow(data);
                }
                /*for(int i = 0; i < lista1.size(); i++)
                {
                    if(lista1.get(i).getNro() == n.getCompraCantidadPK().getCompraNro())
                    {
                        Object data[] = {"Sucursal#1", lista1.get(i).getFecha() ,n.getCantidad(), n.getTotal()};
                        algo.addRow(data);
                        break;
                    }
                }*/
                lista.remove(0);
            }  
            lista = Singleton.getSingleton().ObtenerCompraProducto_Sucursal3();
            //lista1 = Singleton.getSingleton().ObtenerCompra_Sucursal3();
            while(lista.isEmpty() == false)
            {
                CompraCantidad n = new CompraCantidad();
                n = lista.get(0);
                if(sele.getNro() == n.getCompraCantidadPK().getProductoNro())
                {
                    Object data[] = {"Sucursal#3",n.getCantidad(), n.getTotal()};
                    algo.addRow(data);
                }
                /*for(int i = 0; i < lista1.size(); i++)
                {
                    if(lista1.get(i).getNro() == n.getCompraCantidadPK().getCompraNro())
                    {
                        Object data[] = {"Sucursal#1", lista1.get(i).getFecha() ,n.getCantidad(), n.getTotal()};
                        algo.addRow(data);
                        break;
                    }
                }*/
                lista.remove(0);
            }  
            jTable1.setModel(algo);
        }
        else
        {
            switch(jComboBox2.getSelectedIndex())
            {
                case 0:
                    lista = Singleton.getSingleton().ObtenerCompraProducto_Sucursal1();
                    //lista1 = Singleton.getSingleton().ObtenerCompra_Sucursal1();
                    while(lista.isEmpty() == false)
                    {
                        CompraCantidad n = new CompraCantidad();
                        n = lista.get(0);
                        if(sele.getNro() == n.getCompraCantidadPK().getProductoNro())
                        {
                            Object data[] = {"Sucursal#1",n.getCantidad(), n.getTotal()};
                            algo.addRow(data);
                        }
                        /*for(int i = 0; i < lista1.size(); i++)
                        {
                            if(lista1.get(i).getNro() == n.getCompraCantidadPK().getCompraNro())
                            {
                                Object data[] = {"Sucursal#1", lista1.get(i).getFecha() ,n.getCantidad(), n.getTotal()};
                                algo.addRow(data);
                                break;
                            }
                        }*/
                        lista.remove(0);
                    }   
                    jTable1.setModel(algo);
                    break;
                    
               case 1:
                    lista = Singleton.getSingleton().ObtenerCompraProducto_Sucursal2();
                  
                    while(lista.isEmpty() == false)
                    {
                        CompraCantidad n = new CompraCantidad();
                        n = lista.get(0);
                        if(sele.getNro() == n.getCompraCantidadPK().getProductoNro())
                        {
                            Object data[] = {"Sucursal#2",n.getCantidad(), n.getTotal()};
                            algo.addRow(data);
                        }
                        /*for(int i = 0; i < lista1.size(); i++)
                        {
                            if(lista1.get(i).getNro() == n.getCompraCantidadPK().getCompraNro())
                            {
                                Object data[] = {"Sucursal#1", lista1.get(i).getFecha() ,n.getCantidad(), n.getTotal()};
                                algo.addRow(data);
                                break;
                            }
                        }*/
                        lista.remove(0);

                    }   
                    jTable1.setModel(algo);
                    break;
                   
                    case 2:
                    lista = Singleton.getSingleton().ObtenerCompraProducto_Sucursal3();
                    while(lista.isEmpty() == false)
                    {
                        CompraCantidad n = new CompraCantidad();
                        n = lista.get(0);
                        if(sele.getNro() == n.getCompraCantidadPK().getProductoNro())
                        {
                            Object data[] = {"Sucursal#3",n.getCantidad(), n.getTotal()};
                            algo.addRow(data);
                        }
                        /*for(int i = 0; i < lista1.size(); i++)
                        {
                            if(lista1.get(i).getNro() == n.getCompraCantidadPK().getCompraNro())
                            {
                                Object data[] = {"Sucursal#1", lista1.get(i).getFecha() ,n.getCantidad(), n.getTotal()};
                                algo.addRow(data);
                                break;
                            }
                        }*/
                        lista.remove(0);

                    }   
                    jTable1.setModel(algo);
                    break;
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jComboBox2.setVisible(false);
        jRadioButton2.setSelected(false);
        jRadioButton1.setSelected(false);
        jComboBox1.setSelectedIndex(jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jComboBox2.setVisible(true);
        jRadioButton2.setSelected(true);
        jRadioButton1.setSelected(false);
        jComboBox1.setSelectedIndex(jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jComboBox1.setSelectedIndex(jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}