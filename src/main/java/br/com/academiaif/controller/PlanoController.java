/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsfinicio.controller;

import br.com.jsfinicio.mapeamento.PlanoMapeamento;
import br.com.jsfinicio.model.PlanoModel;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Frank
 */
@ManagedBean
public class PlanoController {
    
    private PlanoMapeamento planoMapeamento = new PlanoMapeamento();
    private PlanoModel planoModel = new PlanoModel();
    
    public void salvar(){
        this.PlanoModel.inserir(planoMapeamento);
    }

    public PlanoMapeamento getPlanoMapeamento() {
        return planoMapeamento;
    }

    public void setPlanoMapeamento(PlanoMapeamento planoMapeamento) {
        this.planoMapeamento = planoMapeamento;
    }
    
    
}
