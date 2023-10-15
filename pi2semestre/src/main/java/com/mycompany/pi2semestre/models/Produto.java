/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pi2semestre.models;


import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
 
/**
 *
 * @author DomiU
 */
public class Produto {
    
    public static ArrayList<Produto> listaProdutos = new ArrayList<>();
    private String nome;
    private String fabricante;
    private String descricao;
    private double preco;
    private int unidadeVendidas;
    private int quantidadeEmEstoque;
    private int codigoProduto;
    private String categoria;
    private String dataAnuncio;
    private Image imagem;
    private boolean ativo = true;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    public static int produtos = 0;

    public Produto() {
    }


    
    
    
    

    
    
    public Produto(String nome, String fabricante, String descricao, double preco, int quantidadeEmEstoque, int codigoProduto, String categoria, Image imagem) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.codigoProduto = codigoProduto;
        this.categoria = categoria;
        this.imagem = imagem;
    }
    
    
    

    
    
    public static ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public static void setListaProdutos(ArrayList<Produto> listaProdutos) {
        Produto.listaProdutos = listaProdutos;
    }

  
   
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getUnidadeVendidas() {
        return unidadeVendidas;
    }

    public void setUnidadeVendidas(int unidadeVendidas) {
        this.unidadeVendidas = unidadeVendidas;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDataAnuncio() {
        return dataAnuncio;
    }

    public void setDataAnuncio(String dataAnuncio) {
        this.dataAnuncio = dataAnuncio;
    }

    public Image getImagem() {
        return imagem;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }

    public boolean isAtivo() {
        return ativo;
    }
    
    
    
    public boolean desativar() {
        this.ativo = false;
        return true; 
    }
    
    

   
    
    
}
