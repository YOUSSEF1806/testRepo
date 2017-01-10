/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.facturation2.control;

import com.hibernate.facturation2.model.Client;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author youyou
 */
public class ClientDao {
    private SessionFactory sf;

    public ClientDao(SessionFactory sf) {
        this.sf = sf;
    }

    public void create(Client c) {
       Session session = sf.openSession();
       session.beginTransaction();
       
       session.save(c);
       session.getTransaction().commit();
       session.close();
    }
    
    public void delete(Client c) {
       Session session = sf.openSession();
       session.beginTransaction();
       
       session.delete(c);
       session.getTransaction().commit();
       session.close();
    }
    
    public Client findClientById(int id) {
       Client p;
       Session session = sf.openSession();
       session.beginTransaction();
       
       p = (Client) session.get(Client.class, id);
       session.getTransaction().commit();
       session.close();
       
       return p;
    }
    
    public List<Client> findAllClients() {
        List<Client> listC;
        Session session = sf.openSession();
       session.beginTransaction();
       
       Query q = session.createQuery("from Client");
       listC = q.list();
       
       session.getTransaction().commit();
       session.close();
       
       return listC;
    }
    
    public List<Client> findClientsByCritere(String critere) {
        List<Client> listC;
        Session session = sf.openSession();
       session.beginTransaction();
       
       Query q = session.createQuery(critere);
       listC = q.list();
       
       session.getTransaction().commit();
       session.close();
       
       return listC;
    }
}
