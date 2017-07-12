/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeweb.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.mycompany.testeweb.dao.NegocioDAO;
import com.mycompany.testeweb.entity.Negocio;



/**
 *
 * @author vinicius
 */
@Stateless
public class NegocioEJBBean implements NegocioLocal {
    
    @PersistenceContext(unitName = "NegocioPU")
    private EntityManager em;

    @Override
    public Negocio salvar(Negocio n) throws Exception {
        try{
            NegocioDAO dao = new NegocioDAO(em);
            return dao.salvar(n);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Negocio consultarPorId(Long id) {
        NegocioDAO dao = new NegocioDAO(em);
        return dao.consultarPorId(Negocio.class, id);
    }

    @Override
    public void remover(Long id) {
        NegocioDAO dao = new NegocioDAO(em);
        dao.remover(Negocio.class, id);
    }
    
    
    
    
}
