package Formularios;

import Placeholder.TextPrompt;
import java.awt.event.KeyEvent;

public class FormIngreso extends javax.swing.JFrame {

    public FormIngreso() {
        initComponents();
        TextPrompt usuario = new TextPrompt("USUARIO", TxtUsuario);
        TextPrompt password = new TextPrompt("CONTRASEÑA", TxtContraseña);
        TxtUsuario.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FITexto = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FILogin = new javax.swing.JPanel();
        TxtTitulo = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        BtnIngresar = new javax.swing.JToggleButton();
        FIIcono = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        TxtContraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        FITexto.setBackground(new java.awt.Color(153, 0, 0));
        FITexto.setMaximumSize(new java.awt.Dimension(400, 400));
        FITexto.setMinimumSize(new java.awt.Dimension(400, 400));
        FITexto.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTROL DE ASISTENCIA");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/8168626_books_education_learning_knowledge_icon.png"))); // NOI18N

        javax.swing.GroupLayout FITextoLayout = new javax.swing.GroupLayout(FITexto);
        FITexto.setLayout(FITextoLayout);
        FITextoLayout.setHorizontalGroup(
            FITextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FITextoLayout.setVerticalGroup(
            FITextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FITextoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(FITexto);

        FILogin.setBackground(new java.awt.Color(255, 255, 255));
        FILogin.setMaximumSize(new java.awt.Dimension(300, 400));
        FILogin.setMinimumSize(new java.awt.Dimension(300, 400));

        TxtTitulo.setBackground(new java.awt.Color(255, 255, 255));
        TxtTitulo.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        TxtTitulo.setForeground(new java.awt.Color(153, 0, 0));
        TxtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtTitulo.setText("INGRESO AL SISTEMA");

        BtnCerrar.setBackground(new java.awt.Color(153, 0, 0));
        BtnCerrar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        BtnCerrar.setText("X");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        BtnIngresar.setBackground(new java.awt.Color(153, 0, 0));
        BtnIngresar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        BtnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/8666665_check_icon.png"))); // NOI18N
        BtnIngresar.setText("INGRESAR");

        FIIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FIIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/8666609_user_icon.png"))); // NOI18N

        TxtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        TxtUsuario.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        TxtUsuario.setForeground(new java.awt.Color(153, 0, 0));
        TxtUsuario.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtUsuarioKeyPressed(evt);
            }
        });

        TxtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        TxtContraseña.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        TxtContraseña.setForeground(new java.awt.Color(153, 0, 0));
        TxtContraseña.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TxtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtContraseñaKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/8666609_user_icon (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/8666758_unlock_lock_icon.png"))); // NOI18N

        javax.swing.GroupLayout FILoginLayout = new javax.swing.GroupLayout(FILogin);
        FILogin.setLayout(FILoginLayout);
        FILoginLayout.setHorizontalGroup(
            FILoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
            .addComponent(FIIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FILoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FILoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FILoginLayout.createSequentialGroup()
                        .addGroup(FILoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FILoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(BtnCerrar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtUsuario))))
                .addContainerGap())
        );
        FILoginLayout.setVerticalGroup(
            FILoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FILoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnCerrar)
                .addGroup(FILoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FILoginLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TxtTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(FIIcono)
                        .addGap(18, 18, 18)
                        .addGroup(FILoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FILoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(BtnIngresar)
                .addGap(33, 33, 33))
        );

        getContentPane().add(FILogin);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void TxtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            TxtContraseña.requestFocus();
        }
    }//GEN-LAST:event_TxtUsuarioKeyPressed

    private void TxtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtContraseñaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            BtnIngresar.requestFocus();
        }
    }//GEN-LAST:event_TxtContraseñaKeyPressed

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
            java.util.logging.Logger.getLogger(FormIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JToggleButton BtnIngresar;
    private javax.swing.JLabel FIIcono;
    private javax.swing.JPanel FILogin;
    private javax.swing.JPanel FITexto;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JLabel TxtTitulo;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
