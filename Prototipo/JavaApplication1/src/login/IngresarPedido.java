/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package login;

/**
 *
 * @author santi
 */
public class IngresarPedido extends javax.swing.JPanel {

    /**
     * Creates new form IngresarPedido
     */
    public IngresarPedido() {
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

        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Text_USER4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Text_USER5 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel20 = new javax.swing.JLabel();
        Text_USER7 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Registrar Pedido");

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel11.setText("Nombre producto:");

        Text_USER4.setForeground(new java.awt.Color(204, 204, 204));
        Text_USER4.setText("Full name");
        Text_USER4.setBorder(null);
        Text_USER4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Text_USER4MousePressed(evt);
            }
        });
        Text_USER4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_USER4ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel18.setText("Cédula cliente:");

        Text_USER5.setForeground(new java.awt.Color(204, 204, 204));
        Text_USER5.setText("Number");
        Text_USER5.setBorder(null);
        Text_USER5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Text_USER5MousePressed(evt);
            }
        });
        Text_USER5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_USER5ActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setToolTipText("");

        jLabel19.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Registrar");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(10, 10, 10))
        );

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jToggleButton1.setText("Agregar producto");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel20.setText("Dirección");

        Text_USER7.setForeground(new java.awt.Color(204, 204, 204));
        Text_USER7.setText("Address");
        Text_USER7.setBorder(null);
        Text_USER7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Text_USER7MousePressed(evt);
            }
        });
        Text_USER7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_USER7ActionPerformed(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Text_USER7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jToggleButton1))
                                        .addComponent(jLabel18)
                                        .addComponent(jSeparator6)
                                        .addComponent(Text_USER4)
                                        .addComponent(Text_USER5)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel10)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_USER4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_USER5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_USER7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Text_USER4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text_USER4MousePressed
        if (Text_USER.getText().equals("Username")){
            Text_USER.setText("");
            Text_USER.setForeground(Color.black);
        }
        if (String.valueOf(CONTRASEÑA.getPassword()).isEmpty()    ){
            CONTRASEÑA.setText("*********");
            CONTRASEÑA.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Text_USER4MousePressed

    private void Text_USER4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_USER4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_USER4ActionPerformed

    private void Text_USER5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text_USER5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_USER5MousePressed

    private void Text_USER5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_USER5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_USER5ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        if (options.getSelectedItem().equals("Administrador")){
            if ((Text_USER.getText().equals(Admin_user))&&(String.valueOf(CONTRASEÑA.getPassword()).equals(admin_contra)) ){
                Admin admi= new Admin();
                ShowPanel(admi);
            }else{

                if ((Text_USER.getText().equals("Username"))&&(String.valueOf(CONTRASEÑA.getPassword()).equals("*********")) ){
                    javax.swing.JOptionPane.showMessageDialog(this,"Porfavor llene los datos");
                }else{
                    javax.swing.JOptionPane.showMessageDialog(this,"El usuario o contraseña utilizados no se encuentran registrados");
                }
            }
        }
        if (options.getSelectedItem().equals("Vendedora")){
            if ((Text_USER.getText().equals(vend_user))&&(String.valueOf(CONTRASEÑA.getPassword()).equals(vend_contra)) ){
                Vend vend= new Vend();
                ShowPanel(vend);

            }else{

                if ((Text_USER.getText().equals("Username"))&&(String.valueOf(CONTRASEÑA.getPassword()).equals("*********")) ){
                    javax.swing.JOptionPane.showMessageDialog(this,"Porfavor llene los datos");
                }else{
                    javax.swing.JOptionPane.showMessageDialog(this,"El usuario o contraseña utilizados no se encuentran registrados");
                }
            }
        }
        if (options.getSelectedItem().equals("Bodeguero")){
            if ((Text_USER.getText().equals(bode_user))&&(String.valueOf(CONTRASEÑA.getPassword()).equals(bode_contra)) ){
                Bode bode= new Bode();
                ShowPanel(bode);

            }else{

                if ((Text_USER.getText().equals("Username"))&&(String.valueOf(CONTRASEÑA.getPassword()).equals("*********")) ){
                    javax.swing.JOptionPane.showMessageDialog(this,"Porfavor llene los datos");
                }else{
                    javax.swing.JOptionPane.showMessageDialog(this,"El usuario o contraseña utilizados no se encuentran registrados");
                }
            }
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void Text_USER7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text_USER7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_USER7MousePressed

    private void Text_USER7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_USER7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_USER7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text_USER;
    private javax.swing.JTextField Text_USER1;
    private javax.swing.JTextField Text_USER2;
    private javax.swing.JTextField Text_USER3;
    private javax.swing.JTextField Text_USER4;
    private javax.swing.JTextField Text_USER5;
    private javax.swing.JTextField Text_USER7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
