/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsfinicio.model;

import br.com.jsfinicio.dao.ConexaoHibernateUtil;
import br.com.jsfinicio.mapeamento.CargoMapeamento;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Frank
 */
public class CargoModel {
    
    public void inserir(CargoMapeamento cargo){
        SessionFactory sessionFactory = ConexaoHibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(cargo);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
