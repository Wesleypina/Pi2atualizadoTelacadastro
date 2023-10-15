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
public class Usuario {
    
    
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    private String nome;
    private String estadoCivil;
    private String genero;
    //pk
    private String cpf;
    private String dataNascimento;
    private String telefone;
    private String email;
    private Image imagem;
    private int dinheiroGasto;
    private int comprasRealizadas;
    
    
    private String logradouro;
    private int cep;
    private String bairro;
    private String cidade;
    private boolean ativo = true;
    
    private String dataRegistro;
    public static int usuarios = 1;
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Usuario() {
    }

    public Usuario(String nome, String estadoCivil, String genero, String cpf, String dataNascimento, String telefone, String email, Image imagem, int dinheiroGasto, int comprasRealizadas, String logradouro, int cep, String bairro, String cidade, String dataRegistro) {      
        this.nome = nome;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.imagem = imagem;
        this.dinheiroGasto = dinheiroGasto;
        this.comprasRealizadas = comprasRealizadas;
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.dataRegistro = dataRegistro;
    }
    
    

    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        Usuario.listaUsuarios = listaUsuarios;
    }

  

    public Usuario(String nome, String estadoCivil, String genero, String cpf, String dataNascimento, String telefone, String email, Image imagem, String logradouro, int cep, String bairro, String cidade) {
        this.nome = nome;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.imagem = imagem;
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        usuarios++;
        this.dataRegistro = formato.format(new Date());
    }
    
    public Usuario(String nome, String estadoCivil, String genero, String cpf, String dataNascimento, String telefone, String email, String logradouro, int cep, String bairro, String cidade) {
        this.nome = nome;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        usuarios++;
        this.dataRegistro = formato.format(new Date());
    }
    
    

    
    

    public Image getImagem() {
        return imagem;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }

    public int getDinheiroGasto() {
        return dinheiroGasto;
    }

    public void setDinheiroGasto(int dinheiroGasto) {
        this.dinheiroGasto = dinheiroGasto;
    }

    public int getComprasRealizadas() {
        return comprasRealizadas;
    }

    public void setComprasRealizadas(int comprasRealizadas) {
        this.comprasRealizadas = comprasRealizadas;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public boolean isAtivo() {
        return ativo;
    }
    
    

 
    public boolean desativar() {
        
        this.ativo = false;
        return true;
    }
    
    
    
   
    
    
}
