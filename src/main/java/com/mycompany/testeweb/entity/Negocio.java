/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeweb.entity;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author vinicius
 */
//Classe que representa a tabela do banco de dados negocio

@NamedQueries({
    @NamedQuery(name = "negocio.buscarTodosNegocios" , query = "select n from Negocio n")
})




@Entity
@SequenceGenerator(name = "NEG_SEQ", sequenceName = "NEG_SEQ", initialValue = 1, allocationSize = 1)
public class Negocio implements Serializable,EntidadeBase {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "NEG_SEQ")
    private Long id;
    private Long codMercadoria;
    private String tipoMercadoria;
    private String nomeMercadoria;
    private int quantidade;
    private double preco;
    private String tipoNegocio;

    public Long getCodMercadoria() {
        return codMercadoria;
    }

    public void setCodMercadoria(Long codMercadoria) {
        this.codMercadoria = codMercadoria;
    }
    




    public String getTipoMercadoria() {
        return tipoMercadoria;
    }

    public void setTipoMercadoria(String tipoMercadoria) {
        this.tipoMercadoria = tipoMercadoria;
    }

    public String getNomeMercadoria() {
        return nomeMercadoria;
    }

    public void setNomeMercadoria(String nomeMercadoria) {
        this.nomeMercadoria = nomeMercadoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }

    public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    @Override
    public Long getId() {
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Negocio{" + "id=" + id + ", codMercadoria=" + codMercadoria + ", tipoMercadoria=" + tipoMercadoria + ", nomeMercadoria=" + nomeMercadoria + ", quantidade=" + quantidade + ", preco=" + preco + ", tipoNegocio=" + tipoNegocio + '}';
    }
    
    
}
