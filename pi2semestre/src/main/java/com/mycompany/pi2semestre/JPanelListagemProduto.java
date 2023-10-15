/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.pi2semestre;

import static com.mycompany.pi2semestre.FramePrincipal.cbProdutos1;
import com.mycompany.pi2semestre.models.Produto;
import com.mycompany.pi2semestre.models.Usuario;
import java.awt.Color;
import java.awt.FlowLayout;

/**
 *
 * @author DomiU
 */
public class JPanelListagemProduto extends javax.swing.JPanel {
    
    public static JPanelListagemProduto jPanelListagemProduto;

    /**
     * Creates new form JPanelListagemProduto
     */
    public JPanelListagemProduto() {
        initComponents();
        this.setBounds(0, 0, 1270,500);
        this.setBackground(Color.WHITE);
        this.setLayout(new FlowLayout(FlowLayout.LEADING,20,15));
        jPanelListagemProduto = this;
    }

    @Override
    public void revalidate() {
        
                    this.removeAll();

        
        try {
            
        
        if (FramePrincipal.cbProdutos1.isSelected()) {
                     
            for (Produto produto : Produto.listaProdutos) {
            
                if(produto.isAtivo())  
                    this.add(new JPanelInformacoes(produto));
        }
            System.out.println("qqqqqqqq");
        }
        
        if (FramePrincipal.cbUsuarios1.isSelected()) {
            
            for (Usuario usuario : Usuario.listaUsuarios) {
                
                if(usuario.isAtivo())                   
                    this.add(new JPanelInformacoes(usuario));
        }
                        System.out.println("qqqqqqqq");

        }
        } catch (Exception e) {
                    super.revalidate();

        }
        
        super.revalidate();
                            this.repaint();

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
