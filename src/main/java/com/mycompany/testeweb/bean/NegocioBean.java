/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeweb.bean;

import com.mycompany.testeweb.ejb.NegocioEJBBean;
import com.mycompany.testeweb.entity.Negocio;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author vinicius
 */
@ManagedBean
@ViewScoped
@Stateless
public class NegocioBean implements Serializable {

    //@EJB
    //private NegocioEJBBean ne = new NegocioEJBBean();

    private Negocio negocio = new Negocio();
    
    @PostConstruct
    public void NegocioBean(){
        negocio.setTipoNegocio("Compra");
    }
    

    public Negocio getNegocio() {
        return negocio;
    }

    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }

    public void salvar() throws Exception {
        try {

            System.out.println("negocip::" + negocio);

            negocio = new Negocio();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
