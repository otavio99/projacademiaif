/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsfinicio.controller;

import br.com.jsfinicio.mapeamento.CarroMapeamento;
import br.com.jsfinicio.model.CarroModel;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Frank
 */
@ManagedBean
public class ClienteController {
    
    private CarroMapeamento carroMapeamento = new CarroMapeamento();
    private CarroModel carroModel = new CarroModel();
    
    public void salvar(){
        this.carroModel.inserir(carroMapeamento);
    }

    public CarroMapeamento getCarroMapeamento() {
        return carroMapeamento;
    }

    public void setCarroMapeamento(CarroMapeamento carroMapeamento) {
        this.carroMapeamento = carroMapeamento;
    }
    
    
}
