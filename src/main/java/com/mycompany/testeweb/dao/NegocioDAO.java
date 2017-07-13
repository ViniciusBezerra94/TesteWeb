/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeweb.dao;

import javax.persistence.EntityManager;
import com.mycompany.testeweb.entity.Negocio;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author vinicius
 */


public class NegocioDAO extends GenericoDAO<Negocio>{
             
             
    private EntityManager etm;
    
    public NegocioDAO(EntityManager em) {
        super(em);
        etm = em;
    }
    
        public List<Negocio> buscarTodosNegocios(){
        Query q = etm.createNamedQuery("negocio.buscarTodosNegocios");
        return q.getResultList();
    }
    
                                                                                                                                                
}
