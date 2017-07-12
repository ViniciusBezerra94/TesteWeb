/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeweb.ejb;

import com.mycompany.testeweb.entity.Negocio;
import javax.ejb.Local;

/**
 *
 * @author vinicius
 */
@Local
public interface NegocioLocal {
    public Negocio salvar(Negocio n) throws Exception;
    public Negocio consultarPorId(Long id);
    public void remover(Long id);
    
}
