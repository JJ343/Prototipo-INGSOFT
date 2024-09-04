/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import login.Main.Usuario;


/**
 *
 * @author JUAN JOSE
 */
public class Login extends javax.swing.JFrame {
    public int Xmouse, Ymouse;
    public int xd;
    List<Main.Usuario> usuarios = new ArrayList<>();
    
    
    public Login() {
        initComponents();
        
        LOG.setSize(800,500);
        LOG.setLocation(500,500);
        BaseDeDatos.agregarUsuario(new Usuario("admin","123","Administrador"));
        BaseDeDatos.agregarUsuario(new Usuario("vend","123","Vendedora"));
        BaseDeDatos.agregarUsuario(new Usuario("bode","123","Bodeguero"));
        Botoncerrarsesion.setEnabled(false);
        Botoncerrarsesion.setVisible(false);
        
   
    }
    


       
        
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LOG = new javax.swing.JPanel();
        Barrita = new javax.swing.JPanel();
        Botonexit = new javax.swing.JPanel();
        Boton_cerrado = new javax.swing.JLabel();
        Botoncerrarsesion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Pantalla = new javax.swing.JPanel();
        Nombre2 = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JLabel();
        Text_USER = new javax.swing.JTextField();
        options = new javax.swing.JComboBox<>();
        Nombre_2 = new javax.swing.JLabel();
        Nombre3 = new javax.swing.JLabel();
        Usuario1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        CONTRASEÑA = new javax.swing.JPasswordField();
        Contraseña = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(225, 225));
        setMinimumSize(new java.awt.Dimension(880, 506));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(880, 506));

        LOG.setBackground(new java.awt.Color(255, 255, 255));
        LOG.setForeground(new java.awt.Color(242, 242, 242));
        LOG.setMaximumSize(new java.awt.Dimension(880, 506));
        LOG.setMinimumSize(new java.awt.Dimension(880, 506));
        LOG.setPreferredSize(new java.awt.Dimension(880, 506));
        LOG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barrita.setBackground(new java.awt.Color(204, 204, 204));
        Barrita.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarritaMouseDragged(evt);
            }
        });
        Barrita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarritaMousePressed(evt);
            }
        });

        Botonexit.setBackground(new java.awt.Color(204, 204, 204));

        Boton_cerrado.setBackground(new java.awt.Color(204, 204, 204));
        Boton_cerrado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_cerrado.setForeground(new java.awt.Color(0, 0, 0));
        Boton_cerrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton_cerrado.setText("X");
        Boton_cerrado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_cerrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_cerradoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Boton_cerradoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton_cerradoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton_cerradoMousePressed(evt);
            }
        });

        Botoncerrarsesion.setBackground(new java.awt.Color(204, 204, 204));
        Botoncerrarsesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botoncerrarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotoncerrarsesionMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CERRAR SESION");

        javax.swing.GroupLayout BotoncerrarsesionLayout = new javax.swing.GroupLayout(Botoncerrarsesion);
        Botoncerrarsesion.setLayout(BotoncerrarsesionLayout);
        BotoncerrarsesionLayout.setHorizontalGroup(
            BotoncerrarsesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotoncerrarsesionLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(15, 15, 15))
        );
        BotoncerrarsesionLayout.setVerticalGroup(
            BotoncerrarsesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoncerrarsesionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BotonexitLayout = new javax.swing.GroupLayout(Botonexit);
        Botonexit.setLayout(BotonexitLayout);
        BotonexitLayout.setHorizontalGroup(
            BotonexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonexitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton_cerrado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Botoncerrarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BotonexitLayout.setVerticalGroup(
            BotonexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Boton_cerrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BotonexitLayout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(Botoncerrarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout BarritaLayout = new javax.swing.GroupLayout(Barrita);
        Barrita.setLayout(BarritaLayout);
        BarritaLayout.setHorizontalGroup(
            BarritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarritaLayout.createSequentialGroup()
                .addComponent(Botonexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 693, Short.MAX_VALUE))
        );
        BarritaLayout.setVerticalGroup(
            BarritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarritaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Botonexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LOG.add(Barrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 880, 70));

        Pantalla.setBackground(new java.awt.Color(255, 255, 255));
        Pantalla.setForeground(new java.awt.Color(255, 255, 255));
        Pantalla.setMaximumSize(new java.awt.Dimension(880, 470));
        Pantalla.setMinimumSize(new java.awt.Dimension(880, 470));
        Pantalla.setPreferredSize(new java.awt.Dimension(880, 470));
        Pantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre2.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        Nombre2.setForeground(new java.awt.Color(242, 242, 242));
        Nombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre2.setText("SURTICONFITES");
        Pantalla.add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 200, 70));

        Nombre1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        Nombre1.setForeground(new java.awt.Color(242, 242, 242));
        Nombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre1.setText("MINIPRECIO");
        Pantalla.add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 150, 70));

        Text_USER.setForeground(new java.awt.Color(204, 204, 204));
        Text_USER.setText("Username");
        Text_USER.setBorder(null);
        Text_USER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Text_USERMousePressed(evt);
            }
        });
        Text_USER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_USERActionPerformed(evt);
            }
        });
        Pantalla.add(Text_USER, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 390, 40));

        options.setBackground(new java.awt.Color(255, 255, 255));
        options.setForeground(new java.awt.Color(0, 0, 0));
        options.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedora", "Bodeguero" }));
        options.setBorder(null);
        options.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });
        Pantalla.add(options, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        Nombre_2.setForeground(new java.awt.Color(245, 245, 245));
        Nombre_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2024-08-27 at 9.58.55 PM.jpeg"))); // NOI18N
        Nombre_2.setText("HOLAAAAAAAAAAAAAAAAAA");
        Pantalla.add(Nombre_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -50, 340, 610));

        Nombre3.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        Nombre3.setForeground(new java.awt.Color(0, 0, 0));
        Nombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre3.setText("INICIAR SESION");
        Pantalla.add(Nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 200, 70));

        Usuario1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Usuario1.setForeground(new java.awt.Color(0, 0, 0));
        Usuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario1.setText("USUARIO");
        Usuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Usuario1MousePressed(evt);
            }
        });
        Pantalla.add(Usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, 200, 70));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Pantalla.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 390, 50));

        CONTRASEÑA.setForeground(new java.awt.Color(204, 204, 204));
        CONTRASEÑA.setText("*********");
        CONTRASEÑA.setToolTipText("");
        CONTRASEÑA.setBorder(null);
        CONTRASEÑA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CONTRASEÑAMousePressed(evt);
            }
        });
        CONTRASEÑA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONTRASEÑAActionPerformed(evt);
            }
        });
        Pantalla.add(CONTRASEÑA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 400, 40));

        Contraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        Contraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Contraseña.setText("CONTRASEÑA");
        Pantalla.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 200, 70));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Pantalla.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 400, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTRAR");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(12, 12, 12))
        );

        Pantalla.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 120, 40));

        LOG.add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 880, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LOG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void Text_USERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_USERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_USERActionPerformed

    private void CONTRASEÑAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONTRASEÑAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CONTRASEÑAActionPerformed

    private void BarritaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarritaMousePressed
        Xmouse= evt.getX();
        Ymouse =evt.getY();
                
    }//GEN-LAST:event_BarritaMousePressed

    private void BarritaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarritaMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x-Xmouse, y-Ymouse);
    }//GEN-LAST:event_BarritaMouseDragged

    private void Boton_cerradoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_cerradoMousePressed
        
    }//GEN-LAST:event_Boton_cerradoMousePressed

    private void Boton_cerradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_cerradoMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Boton_cerradoMouseClicked

    private void Boton_cerradoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_cerradoMouseEntered
        Boton_cerrado.setBackground( Color.red);
    }//GEN-LAST:event_Boton_cerradoMouseEntered

    private void Boton_cerradoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_cerradoMouseExited
        Boton_cerrado.setBackground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_cerradoMouseExited

    private void Usuario1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Usuario1MousePressed
          
    }//GEN-LAST:event_Usuario1MousePressed

    private void CONTRASEÑAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONTRASEÑAMousePressed
        if (Text_USER.getText().isEmpty()){
            Text_USER.setText("Username");
            Text_USER.setForeground(Color.gray);
        }
        
        
        if (String.valueOf(CONTRASEÑA.getPassword()).equals("*********")    ){
            CONTRASEÑA.setText("");// TODO add your handling code here:
            CONTRASEÑA.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_CONTRASEÑAMousePressed

    private void Text_USERMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text_USERMousePressed
        if (Text_USER.getText().equals("Username")){
            Text_USER.setText("");
            Text_USER.setForeground(Color.black);
        }
        if (String.valueOf(CONTRASEÑA.getPassword()).isEmpty()    ){
            CONTRASEÑA.setText("*********");
            CONTRASEÑA.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Text_USERMousePressed

    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionsActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String  user = Text_USER.getText();
        
        for (Usuario usuario :BaseDeDatos.usuarios ){
             if ((Text_USER.getText().equals("Username"))&&(String.valueOf(CONTRASEÑA.getPassword()).equals("*********")) ){
                        javax.swing.JOptionPane.showMessageDialog(this,"Porfavor llene los datos");
                        break;
              }
              
        
              if(usuario.getNombreUsuario().equals(user) && usuario.getCargo().equals(options.getSelectedItem()) && usuario.getContraseña().equals(String.valueOf(CONTRASEÑA.getPassword()))){
                 if (usuario.getCargo().equals("Administrador")){
                      Admin admi= new Admin();
                      Barrita.setBackground(new Color(102,102,102)) ;
                      Botonexit.setBackground(new Color(102,102,102)) ;
                      Botoncerrarsesion.setBackground(new Color(102,102,102));
                      Botoncerrarsesion.setEnabled(true);
                      Botoncerrarsesion.setVisible(true);
                      Main.ShowPanel(admi , Pantalla , 880, 480);
                        
                      break;
                 }else{
                     if (usuario.getCargo().equals("Vendedora")){
                        
                         Vend vend= new Vend();
                         Barrita.setBackground(new Color( 0,153,51)) ;
                         Botonexit.setBackground(new Color( 0,153,51)) ;
                         Botoncerrarsesion.setBackground(new Color(0,153,51));
                         Botoncerrarsesion.setEnabled(true);
                         Botoncerrarsesion.setVisible(true);
                         Main.ShowPanel(vend, Pantalla, 880, 480);
                         break;
                     }else{
                         
                        Bode bode= new Bode();
                        Barrita.setBackground(new Color( 255,153,51)) ;
                        Botonexit.setBackground(new Color( 255,153,51)) ;
                        Botoncerrarsesion.setBackground(new Color(255,153,51));
                        Botoncerrarsesion.setEnabled(true);
                        Botoncerrarsesion.setVisible(true);
                        Main.ShowPanel(bode, Pantalla, 880, 480);
                        break;
                     }
                 }
              
              }
        }
        javax.swing.JOptionPane.showMessageDialog(this,"El usuario o contraseña utilizados no se encuentran registrados");  
    }//GEN-LAST:event_jLabel1MouseClicked

    private void BotoncerrarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotoncerrarsesionMouseClicked
    Barrita.setBackground(new Color( 204,204,204)) ;
    Botonexit.setBackground(new Color( 204,204,204)) ;
    Botoncerrarsesion.setEnabled(false);
    Botoncerrarsesion.setVisible(false);
    Text_USER.setForeground(Color.gray);
    CONTRASEÑA.setForeground(Color.gray);
    
    Text_USER.setText("Username");
    CONTRASEÑA.setText("*********");
    Pantalla.removeAll();
    Pantalla.setLayout(null); // Desactiva el layout manager
    Pantalla.add(jSeparator1);
    Pantalla.add(CONTRASEÑA);
    Pantalla.add(Contraseña);
    Pantalla.add(Nombre1);
    Pantalla.add(Nombre2);
    Pantalla.add(Nombre3);
    Pantalla.add(Nombre_2);
    Pantalla.add(Text_USER);
    Pantalla.add(Usuario1);
    Pantalla.add(options);
    Pantalla.add(jPanel1,jLabel1);
    Pantalla.add(jSeparator2);
    // Actualizar el panel
    Pantalla.revalidate();
    Pantalla.repaint();
    
        
    }//GEN-LAST:event_BotoncerrarsesionMouseClicked
    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
       
        
        
      
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barrita;
    private javax.swing.JLabel Boton_cerrado;
    private javax.swing.JPanel Botoncerrarsesion;
    private javax.swing.JPanel Botonexit;
    private javax.swing.JPasswordField CONTRASEÑA;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JPanel LOG;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Nombre3;
    private javax.swing.JLabel Nombre_2;
    private javax.swing.JPanel Pantalla;
    private javax.swing.JTextField Text_USER;
    private javax.swing.JLabel Usuario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> options;
    // End of variables declaration//GEN-END:variables
}
