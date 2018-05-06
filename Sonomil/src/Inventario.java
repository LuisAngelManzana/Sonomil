
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manzana
 */
public class Inventario extends javax.swing.JFrame {

    public TableRowSorter<TableModel> modeloOrdenado;
    Equipo mEquipo =new Equipo();
    BaseDeDatos mBaseDeDatos = new BaseDeDatos();
    DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form Inventario
     */
    public Inventario() {
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
        jTable1 = new javax.swing.JTable();
        BtnSalir = new javax.swing.JButton();
        BImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BImprimir.setText("Imprimir");
        BImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(BtnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BImprimir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(BImprimir))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.hide();
        Menu mMenu = new Menu();
        mMenu.show();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BImprimirActionPerformed

        Conector cn = new Conector("root","root","Sonomil","localhost:8888");
        String path = "/Users/admin/Sonomil/Sonomil/src/reporte_Inventario.jasper";
        JasperReport jr = null;
        
        try {
            jr =(JasperReport) JRLoader.loadObjectFromLocation(path);
            JasperPrint jpInv = JasperFillManager.fillReport(jr, null, cn.getConexion());
            JasperViewer jv = new JasperViewer(jpInv);
            jv.setVisible(true);
            jv.setTitle(path);
        } catch (JRException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BImprimirActionPerformed

    public void setFilas(){
        Equipo mEquipo;
        mBaseDeDatos.conectar();
        ArrayList mEquipoArray = mBaseDeDatos.consultarEquipo();
        String [] Datos;
        
        modelo.addColumn("ID Equipo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        modelo.addColumn("No Existencia");
        modelo.addColumn("Tipo");
        modelo.addColumn("Precio");

    for (Object mEquipoArrays : mEquipoArray) {
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

    this.jTable1.setModel(modelo);
    this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
    this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
    this.jTable1.getColumnModel().getColumn(2).setPreferredWidth(500);
    this.jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
    this.jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
    this.jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);

    if (this.jTable1.getRowCount() > 0) {
    //this.jTabla.RowFilter.regexFilter("^a", 0);
    this.jTable1.setRowSelectionInterval(0, 0);}
        
        
        
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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BImprimir;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
