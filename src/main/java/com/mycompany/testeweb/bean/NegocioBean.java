/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeweb.bean;

import com.mycompany.testeweb.ejb.NegocioEJBBean;
import com.mycompany.testeweb.ejb.NegocioLocal;
import com.mycompany.testeweb.entity.Negocio;
import java.io.Serializable;
import java.util.List;
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
public class NegocioBean implements Serializable {

    
    @EJB
    private NegocioLocal ne = new NegocioEJBBean();

    private Negocio negocio = new Negocio();
    
    private List<Negocio> negocios;
    
    @PostConstruct
    public void NegocioBean(){
        negocio.setTipoNegocio("Compra");
        negocios = ne.buscarTodosNegocios();
    }
    

    public Negocio getNegocio() {
        return negocio;
    }
    
    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }

    public List<Negocio> getNegocios() {
        return negocios;
    }

    public void setNegocios(List<Negocio> negocios) {
        this.negocios = negocios;
    }

    
    
    public void salvar() throws Exception {
        try {

            System.out.println("negocip::" + negocio);
            negocio = ne.salvar(negocio);

            negocio = new Negocio();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
