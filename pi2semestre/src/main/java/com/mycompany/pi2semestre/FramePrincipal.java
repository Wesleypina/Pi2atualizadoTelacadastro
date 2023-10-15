/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pi2semestre;

import com.mycompany.pi2semestre.models.Produto;
import com.mycompany.pi2semestre.models.Usuario;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author DomiU
 */
public class FramePrincipal extends javax.swing.JFrame {
    
    public static JFrame framePincipal;
    public static JCheckBox cbProdutos1, cbUsuarios1;

    /**
     * Creates new form NewJFrame
     */
    public FramePrincipal() {
        initComponents();
        cbProdutos1 = cbProdutos;
        cbUsuarios1 = cbUsuarios;
        framePincipal = this;
        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout(null);
        this.setResizable(false);
        jPanelListagemProduto1.setPreferredSize(new Dimension(jPanelListagemProduto1.getWidth(), 1000));
        jPanelCategorias1.setBounds(0, 88, jPanelCategorias1.getWidth(), jPanelCategorias1.getHeight());
                jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
     //  this.setLayout(null);
      // jPanel2.setBounds(0, 104, jPanel2.getWidth(), jPanel2.getHeight());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newJPanel2 = new com.mycompany.pi2semestre.NewJPanel();
        jTextFieldRedondo2 = new com.mycompany.pi2semestre.JTextFieldRedondo();
        jPanelCategorias1 = new com.mycompany.pi2semestre.JPanelCategorias();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelListagemProduto1 = new com.mycompany.pi2semestre.JPanelListagemProduto();
        jComboBox1 = new javax.swing.JComboBox<>();
        cbProdutos = new javax.swing.JCheckBox();
        cbUsuarios = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));

        jTextFieldRedondo2.setBorder(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon _search normal 1_.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelListagemProduto1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 30, 20));
        jScrollPane1.setViewportView(jPanelListagemProduto1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preço crescente", "Preço decrescente", "Não ordenar" }));

        cbProdutos.setSelected(true);
        cbProdutos.setText("Produtos");
        cbProdutos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbProdutosStateChanged(evt);
            }
        });
        cbProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutosActionPerformed(evt);
            }
        });

        cbUsuarios.setText("Usuários");
        cbUsuarios.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbUsuariosStateChanged(evt);
            }
        });
        cbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(newJPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCategorias1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cbProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbUsuarios)
                .addGap(49, 49, 49)
                .addComponent(jTextFieldRedondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCategorias1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbProdutos)
                            .addComponent(cbUsuarios))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jTextFieldRedondo2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutosActionPerformed
        // TODO add your handling code here:
        JPanelListagemProduto.jPanelListagemProduto.revalidate();
    }//GEN-LAST:event_cbProdutosActionPerformed

    private void cbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsuariosActionPerformed
        // TODO add your handling code here:
                JPanelListagemProduto.jPanelListagemProduto.revalidate();

    }//GEN-LAST:event_cbUsuariosActionPerformed

    private void cbProdutosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbProdutosStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProdutosStateChanged

    private void cbUsuariosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbUsuariosStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUsuariosStateChanged

    @Override
    public void revalidate() {
        
        
        
        
        
        
        super.revalidate();
        
        
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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbProdutos;
    private javax.swing.JCheckBox cbUsuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.mycompany.pi2semestre.JPanelCategorias jPanelCategorias1;
    private com.mycompany.pi2semestre.JPanelListagemProduto jPanelListagemProduto1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.mycompany.pi2semestre.JTextFieldRedondo jTextFieldRedondo2;
    private com.mycompany.pi2semestre.NewJPanel newJPanel2;
    // End of variables declaration//GEN-END:variables

    
}
