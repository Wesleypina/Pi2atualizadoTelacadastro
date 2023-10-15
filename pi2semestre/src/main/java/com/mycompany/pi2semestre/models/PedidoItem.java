/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pi2semestre.models;

/**
 *
 * @author DomiU
 */
public class PedidoItem {
    
    private int id;
    private int idProduto;
    private int idVenda;
    private int quantidade;
    public static int pedidoItens;

    public PedidoItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
    
    

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static int getPedidoItens() {
        return pedidoItens;
    }

    public static void setPedidoItens(int pedidoItens) {
        PedidoItem.pedidoItens = pedidoItens;
    }
    
    
    
    
}
