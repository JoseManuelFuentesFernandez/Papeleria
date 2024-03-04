/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iestr.jmff.t1_p1.vista;

import iestr.jmff.t1_p1.controlador.TablapapeleriaJpaController;
import iestr.jmff.t1_p1.modelo.Tablapapeleria;
import static iestr.jmff.t1_p1.vista.Menu.hb;
import static iestr.jmff.t1_p1.vista.Menu.helpset;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;

/**
 * La clase ModificarProducto representa la interfaz gráfica para modificar información
 * de productos en una base de datos. Utiliza Java Swing para la interfaz y se conecta a la
 * base de datos mediante JPA (Java Persistence API)
 *
 * @author Manuel Alejandro Márquez
 */
public class ModificarProducto extends javax.swing.JFrame {

    /**
     * Creates new form ModificarProducto
     */
    public ModificarProducto() {
        //Nombre y configuración
        setTitle("Modificar producto");
        
        //Base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
        producto = new TablapapeleriaJpaController(emf);
        productos = producto.findTablapapeleriaEntities();
        
        //JavaHelp
        hb.enableHelpKey(this.getContentPane(), "ModificarProducto", helpset);
        initComponents();
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        txf1 = new javax.swing.JTextField();
        txf2 = new javax.swing.JTextField();
        txf3 = new javax.swing.JTextField();
        txf4 = new javax.swing.JTextField();
        btn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Modify.png"))); // NOI18N
        btn1.setText("Modifica Producto");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl1.setText("Código:");

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn2.setText("Reset");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl2.setText("Producto:");

        lbl3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl3.setText("Familia:");

        lbl4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl4.setText("Precio:");

        lbl5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl5.setForeground(new java.awt.Color(153, 153, 153));
        lbl5.setText("Ingresa el código del producto a modificar");

        txf2.setEditable(false);

        txf3.setEditable(false);

        txf4.setEditable(false);
        txf4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N
        btn3.setText("Buscar");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1)
                            .addComponent(lbl2)
                            .addComponent(lbl3)
                            .addComponent(lbl4))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txf1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn2)
                        .addGap(10, 10, 10)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(txf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(txf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(txf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(txf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Maneja el evento de clic en el botón de modificar producto.
     * Realiza validaciones de campos y actualiza la información del producto
     * en la base de datos.
     *
     * @param evt Evento de acción generado por el botón.
     */
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        //Control de campos vacíos
        if(txf2.getText().equals("") || txf3.getText().equals("") || txf4.getText().isBlank()){
            Menu.error("Completa los campos");
            return;
        }
        
        //Control de Double en el precio
        if(!Menu.esDouble(txf4.getText())){
            Menu.error("El precio no es un valor válido.  Ejemplos válidos: 1000.00 / 1000");
            return;
        }
        
        for(Tablapapeleria p : productos){
            if(p.getCodigo().equals(txf1.getText())){
                try {
                    p.setProducto(txf2.getText());
                    p.setFamilia(txf3.getText());
                    p.setPrecio(Double.valueOf(txf4.getText()));

                    Menu.exito("El producto se ha modificado con éxito");
                    txf1.setText("");
                    txf2.setText("");
                    txf3.setText("");
                    txf4.setText("");

                    txf1.setEditable(true);
                    txf2.setEditable(false);
                    txf3.setEditable(false);
                    txf4.setEditable(false);
                   
                    producto.edit(p);
                    return;
                } catch (Exception ex) {
                    Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btn1ActionPerformed
    /**
     * Maneja el evento de clic en el botón de resetear campos.
     * Limpia los campos de entrada y deshabilita la edición.
     *
     * @param evt Evento de acción generado por el botón.
     */
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        txf1.setText("");
        txf2.setText("");
        txf3.setText("");
        txf4.setText("");

        txf1.setEditable(true);
        txf2.setEditable(false);
        txf3.setEditable(false);
        txf4.setEditable(false);
    }//GEN-LAST:event_btn2ActionPerformed
    /**
     * Maneja el evento de clic en el botón de buscar producto.
     * Realiza la búsqueda de un producto por código y muestra su información.
     *
     * @param evt Evento de acción generado por el botón.
     */
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if(txf1.getText().equals("")){
            Menu.error("Introduce un código");
            return;
        }

        //Control de si ya existe ese código
        if(Menu.codigoLibre(txf1.getText())){
            Menu.error("Ese código no existe");
            return;
        }

        
        for(Tablapapeleria p : productos){
            if(p.getCodigo().equals(txf1.getText())){
                txf2.setText(p.getProducto());
                txf3.setText(p.getFamilia());
                txf4.setText(p.getPrecio().toString());
               
                txf1.setEditable(false);
                txf2.setEditable(true);
                txf3.setEditable(true);
                txf4.setEditable(true);
            }
        }
        
        if(txf2.getText().equals("")){
            Menu.error("No se ha encontrado el código indicado");
        }
        
    }//GEN-LAST:event_btn3ActionPerformed
    
    /**
     * Método principal que inicia la aplicación.
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
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarProducto().setVisible(true);
            }
        });
    }

    private List<Tablapapeleria> productos;
    private TablapapeleriaJpaController producto;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JTextField txf1;
    private javax.swing.JTextField txf2;
    private javax.swing.JTextField txf3;
    private javax.swing.JTextField txf4;
    // End of variables declaration//GEN-END:variables
}
