/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.facturation2.control;

import com.hibernate.facturation2.model.Facture;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author youyou
 */
public class FactureDao {
    private SessionFactory sf;

    public FactureDao(SessionFactory sf) {
        this.sf = sf;
    }

    public void create(Facture f) {
       Session session = sf.openSession();
       session.beginTransaction();
       
       session.save(f);
       session.getTransaction().commit();
       session.close();
    }
    
    public void delete(Facture f) {
       Session session = sf.openSession();
       session.beginTransaction();
       
       session.delete(f);
       session.getTransaction().commit();
       session.close();
    }
    
    public Facture findFactureById(int id) {
       Facture f;
       Session session = sf.openSession();
       session.beginTransaction();
       
       f = (Facture) session.get(Facture.class, id);
       session.getTransaction().commit();
       session.close();
       
       return f;
    }
    
    public List<Facture> findAllFactures() {
        List<Facture> listF;
        Session session = sf.openSession();
       session.beginTransaction();
       
       Query q = session.createQuery("from Facture");
       listF = q.list();
       
       session.getTransaction().commit();
       session.close();
       
       return listF;
    }
    
    public List<Facture> findFacturesByCritere(String critere) {
        List<Facture> listF;
        Session session = sf.openSession();
       session.beginTransaction();
       
       Query q = session.createQuery(critere);
       listF = q.list();
       
       session.getTransaction().commit();
       session.close();
       
       return listF;
    }
}
