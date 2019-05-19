/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsfinicio.model;

import br.com.jsfinicio.dao.ConexaoHibernateUtil;
import br.com.jsfinicio.mapeamento.ClienteMapeamento;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Frank
 */
public class ClienteModel {
    
    public void inserir(ClienteMapeamento cliente){
        SessionFactory sessionFactory = ConexaoHibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(cliente);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
