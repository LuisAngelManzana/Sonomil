
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manzana
 */
public class Baja extends javax.swing.JFrame {

    public TableRowSorter<TableModel> modeloOrdenado;
    DefaultTableModel modelo = new DefaultTableModel();
    Equipo mEquipo = new Equipo();
    BaseDeDatos mBaseDeDatos = new BaseDeDatos();
    public Baja() {
        initComponents();
        setFilas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        BDBaja = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        IdBaja = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NombreBaja = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ExistenciaBaja = new javax.swing.JTextField();
        EliminarBaja = new javax.swing.JButton();
        ModificarBaja = new javax.swing.JButton();
        SalirBaja = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BDBaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        BDBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BDBajaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BDBaja);

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Existencia");

        EliminarBaja.setText("Eliminar");
        EliminarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBajaActionPerformed(evt);
            }
        });

        ModificarBaja.setText("Modificar");
        ModificarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBajaActionPerformed(evt);
            }
        });

        SalirBaja.setText("Salir");
        SalirBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBajaActionPerformed(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IdBaja))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombreBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExistenciaBaja))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(EliminarBaja)
                        .addGap(31, 31, 31)
                        .addComponent(ModificarBaja))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(SalirBaja)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(IdBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NombreBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ExistenciaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EliminarBaja)
                            .addComponent(ModificarBaja))
                        .addGap(18, 18, 18)
                        .addComponent(SalirBaja)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBajaActionPerformed
        this.hide();
        Menu mMenu = new Menu();
        mMenu.show();
    }//GEN-LAST:event_SalirBajaActionPerformed

    private void EliminarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBajaActionPerformed
        mEquipo.setId_Equipo(this.IdBaja.getText());
        if (mBaseDeDatos.conectar()) {
            if (mBaseDeDatos.eliminarEquipo(mEquipo)) {
                JOptionPane.showMessageDialog(rootPane, "Equipo Eliminado con Exito");
            }
        }
        
    }//GEN-LAST:event_EliminarBajaActionPerformed

    private void ModificarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBajaActionPerformed
        Equipo nEquipo = new Equipo();
        
        mEquipo.setId_Equipo(this.IdBaja.getText());
        nEquipo.setNombreE(this.NombreBaja.getText());
        nEquipo.setNumExist(Integer.parseInt(this.ExistenciaBaja.getText()));
        nEquipo.setPrecio(Integer.parseInt(this.txtPrecio.getText()));
        if (mBaseDeDatos.conectar()) {
            if (mBaseDeDatos.modificarEquipo(mEquipo, nEquipo)) {
                JOptionPane.showMessageDialog(rootPane, "Equipo Modificado con Exito");
                modelo.setColumnCount(0);
                modelo.setRowCount(0);
                setFilas();
            } else{
                JOptionPane.showMessageDialog(rootPane, "Error al Modificar");
            }
        }

    }//GEN-LAST:event_ModificarBajaActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void BDBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BDBajaMouseClicked
        int rec = this.BDBaja.getSelectedRow();
        this.IdBaja.setText(BDBaja.getValueAt(rec, 0).toString());
        this.NombreBaja.setText(BDBaja.getValueAt(rec, 1).toString());
        this.ExistenciaBaja.setText(BDBaja.getValueAt(rec, 3).toString());
        this.txtPrecio.setText(BDBaja.getValueAt(rec, 5).toString());
    }//GEN-LAST:event_BDBajaMouseClicked

    public void setFilas(){
        Equipo mEquipo;
        mBaseDeDatos.conectar();
        ArrayList mArrayList = new ArrayList();
        mArrayList = mBaseDeDatos.consultarEquipo();
        String [] Datos;
        
        modelo.addColumn("ID Equipo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        modelo.addColumn("No Existencia");
        modelo.addColumn("Tipo");
        modelo.addColumn("Precio");

    for (Object mEquipoArrays : mArrayList) {
    Datos = new String[6];
    mEquipo = (Equipo)mEquipoArrays;
    Datos[0] = mEquipo.getId_Equipo();
    Datos[1] = mEquipo.getNombreE();
    Datos[2] = mEquipo.getDescripcion();
    Datos[3] = Integer.toString(mEquipo.getNumExist());
    Datos[4] = mEquipo.getTipo();
    Datos[5] = Integer.toString(mEquipo.getPrecio());
  
    modelo.addRow(Datos);
    modeloOrdenado = new TableRowSorter<TableModel>(modelo);
    //tabla.setRowSorter(modeloOrdenado);
		modeloOrdenado.setRowFilter(RowFilter.regexFilter("^a", 0));
    }

    this.BDBaja.setModel(modelo);
    this.BDBaja.getColumnModel().getColumn(0).setPreferredWidth(80);
    this.BDBaja.getColumnModel().getColumn(1).setPreferredWidth(120);
    this.BDBaja.getColumnModel().getColumn(2).setPreferredWidth(400);
    this.BDBaja.getColumnModel().getColumn(3).setPreferredWidth(100);
    this.BDBaja.getColumnModel().getColumn(4).setPreferredWidth(100);
    this.BDBaja.getColumnModel().getColumn(5).setPreferredWidth(100);

    if (this.BDBaja.getRowCount() > 0) {
    //this.jTabla.RowFilter.regexFilter("^a", 0);
    this.BDBaja.setRowSelectionInterval(0, 0);}
        
        
        
    }
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
            java.util.logging.Logger.getLogger(Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Baja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BDBaja;
    private javax.swing.JButton EliminarBaja;
    private javax.swing.JTextField ExistenciaBaja;
    private javax.swing.JTextField IdBaja;
    private javax.swing.JButton ModificarBaja;
    private javax.swing.JTextField NombreBaja;
    private javax.swing.JButton SalirBaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
