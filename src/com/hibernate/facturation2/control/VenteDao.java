/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.facturation2.control;

import com.hibernate.facturation2.model.Vente;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author youyou
 */
public class VenteDao {
    private SessionFactory sf;

    public VenteDao(SessionFactory sf) {
        this.sf = sf;
    }

    public void create(Vente v) {
       Session session = sf.openSession();
       session.beginTransaction();
       
       session.save(v);
       session.getTransaction().commit();
       session.close();
    }
    
    public void delete(Vente v) {
       Session session = sf.openSession();
       session.beginTransaction();
       
       session.delete(v);
       session.getTransaction().commit();
       session.close();
    }
    
    public Vente findVenteById(int id) {
       Vente v;
       Session session = sf.openSession();
       session.beginTransaction();
       
       v = (Vente) session.get(Vente.class, id);
       session.getTransaction().commit();
       session.close();
       
       return v;
    }
    
    public List<Vente> findAllVentes() {
        List<Vente> listV;
        Session session = sf.openSession();
       session.beginTransaction();
       
       Query q = session.createQuery("from vente");
       listV = q.list();
       
       session.getTransaction().commit();
       session.close();
       
       return listV;
    }
    
    public List<Vente> findVentesByCritere(String critere) {
        List<Vente> listV;
        Session session = sf.openSession();
       session.beginTransaction();
       
       Query q = session.createQuery(critere);
       listV = q.list();
       
       session.getTransaction().commit();
       session.close();
       
       return listV;
    }
}
