/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorDirectorio;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author NANCY
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private ControladorDirectorio controladorDirectorio;
    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        
        controladorDirectorio= new ControladorDirectorio(txtRuta.getText());
    }

    public void Lista (List<String> directorios) {
        DefaultListModel modelo = new DefaultListModel();
        modelo.clear();
        for (String nombre : directorios) {
            modelo.addElement(nombre);
        }
        Lista.setModel(modelo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnListar = new javax.swing.JButton();
        btnListarArchivosOcultos = new javax.swing.JButton();
        btnListarDirectoriosOcultos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        btnMostarInformacion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtinformacion = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        MenuGDirectorios = new javax.swing.JMenu();
        crearMenuItem = new javax.swing.JMenuItem();
        eliminarMenuItem = new javax.swing.JMenuItem();
        renombrarMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        desktopPane.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ruta:");

        btnListar.setBackground(new java.awt.Color(0, 0, 0));
        btnListar.setForeground(new java.awt.Color(255, 255, 0));
        btnListar.setText("Listar Directorios");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnListarArchivosOcultos.setBackground(new java.awt.Color(0, 0, 0));
        btnListarArchivosOcultos.setForeground(new java.awt.Color(255, 255, 0));
        btnListarArchivosOcultos.setText("Listar Archivos Ocultos");
        btnListarArchivosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarArchivosOcultosActionPerformed(evt);
            }
        });

        btnListarDirectoriosOcultos.setBackground(new java.awt.Color(0, 0, 0));
        btnListarDirectoriosOcultos.setForeground(new java.awt.Color(255, 255, 0));
        btnListarDirectoriosOcultos.setText("Listar Directorios Ocultos");
        btnListarDirectoriosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirectoriosOcultosActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(Lista);

        btnMostarInformacion.setBackground(new java.awt.Color(0, 0, 0));
        btnMostarInformacion.setForeground(new java.awt.Color(255, 255, 0));
        btnMostarInformacion.setText("Mostrar Informacion");
        btnMostarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarInformacionActionPerformed(evt);
            }
        });

        txtinformacion.setEditable(false);
        txtinformacion.setBackground(new java.awt.Color(255, 255, 204));
        txtinformacion.setColumns(20);
        txtinformacion.setRows(5);
        jScrollPane2.setViewportView(txtinformacion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnMostarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnListarArchivosOcultos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnListarDirectoriosOcultos, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListar)
                    .addComponent(btnListarArchivosOcultos)
                    .addComponent(btnListarDirectoriosOcultos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMostarInformacion)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(10, 20, 690, 510);

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        MenuGDirectorios.setMnemonic('f');
        MenuGDirectorios.setText("Gestionar Directorios");

        crearMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        crearMenuItem.setMnemonic('o');
        crearMenuItem.setText("Crear");
        crearMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMenuItemActionPerformed(evt);
            }
        });
        MenuGDirectorios.add(crearMenuItem);

        eliminarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        eliminarMenuItem.setMnemonic('s');
        eliminarMenuItem.setText("Eliminar");
        eliminarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMenuItemActionPerformed(evt);
            }
        });
        MenuGDirectorios.add(eliminarMenuItem);

        renombrarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        renombrarMenuItem.setMnemonic('a');
        renombrarMenuItem.setText("Renombrar");
        renombrarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renombrarMenuItemActionPerformed(evt);
            }
        });
        MenuGDirectorios.add(renombrarMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        MenuGDirectorios.add(exitMenuItem);

        menuBar.add(MenuGDirectorios);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        if(txtRuta.getText().equals("")){
            JOptionPane.showMessageDialog(this, "No a ingresado una ruta no se puede listar");
        }else{
            List<String> directorios = controladorDirectorio.listarArchivos(txtRuta.getText());
            Lista(directorios);
        }
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void crearMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMenuItemActionPerformed
        String nombre = JOptionPane.showInputDialog("Escriba la direccion y el nombre del directorio que desea crar");
        controladorDirectorio.crearDirectorio(nombre);
    }//GEN-LAST:event_crearMenuItemActionPerformed

    private void btnListarArchivosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarArchivosOcultosActionPerformed
       if(txtRuta.getText().equals("")){
            JOptionPane.showMessageDialog(this, "No a ingresado una ruta no se puede listar");
        }else{
           List<String> directorios = controladorDirectorio.listarArchivosOcultos(txtRuta.getText());
           Lista(directorios);
        }
        
    }//GEN-LAST:event_btnListarArchivosOcultosActionPerformed

    private void btnListarDirectoriosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirectoriosOcultosActionPerformed
        if(txtRuta.getText().equals("")){
            JOptionPane.showMessageDialog(this, "No a ingresado una ruta no se puede listar");
        }else{
            List<String> directorios = controladorDirectorio.listarDirectoriosOcultos(txtRuta.getText());
            Lista(directorios);
        }
        
    }//GEN-LAST:event_btnListarDirectoriosOcultosActionPerformed

    private void btnMostarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostarInformacionActionPerformed
        String nombre= Lista.getSelectedValue();
        String ruta = txtRuta.getText();
        String datosDelArchivo = controladorDirectorio.mostrarInformacion(nombre, ruta);
        txtinformacion.setText(datosDelArchivo);
    }//GEN-LAST:event_btnMostarInformacionActionPerformed

    private void eliminarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuItemActionPerformed
        String nombre= Lista.getSelectedValue();
        controladorDirectorio.eliminarDirectorio(nombre);
    }//GEN-LAST:event_eliminarMenuItemActionPerformed

    private void renombrarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renombrarMenuItemActionPerformed

        String nuevo=JOptionPane.showInputDialog("Escriba el nuevo nombre:");
        String ruta=txtRuta.getText();
        String actual=Lista.getSelectedValue();
        controladorDirectorio.renombrarDirectorio(ruta,actual, nuevo);
        JOptionPane.showMessageDialog(this, "Directorio actualizado");
        List<String> directorios = controladorDirectorio.listarArchivos(ruta);
        Lista(directorios);
    }//GEN-LAST:event_renombrarMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista;
    private javax.swing.JMenu MenuGDirectorios;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnListarArchivosOcultos;
    private javax.swing.JButton btnListarDirectoriosOcultos;
    private javax.swing.JButton btnMostarInformacion;
    private javax.swing.JMenuItem crearMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem eliminarMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem renombrarMenuItem;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextArea txtinformacion;
    // End of variables declaration//GEN-END:variables

}
