/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.facturation2.control;

import com.hibernate.facturation2.model.Produit;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author youyou
 */
public class ProduitDao {
    private SessionFactory sf;

    public ProduitDao(SessionFactory sf) {
        this.sf = sf;
    }

    public void create(Produit p) {
       Session session = sf.openSession();
       session.beginTransaction();
       
       session.save(p);
       session.getTransaction().commit();
       session.close();
    }
    
    public void delete(Produit p) {
       Session session = sf.openSession();
       session.beginTransaction();
       
       session.delete(p);
       session.getTransaction().commit();
       session.close();
    }
    
    public Produit findProduitById(int id) {
       Produit p;
       Session session = sf.openSession();
       session.beginTransaction();
       
       p = (Produit) session.get(Produit.class, id);
       session.getTransaction().commit();
       session.close();
       
       return p;
    }
    
    public List<Produit> findAllProduits() {
        List<Produit> listP;
        Session session = sf.openSession();
       session.beginTransaction();
       
       Query q = session.createQuery("from Produit");
       listP = q.list();
       
       session.getTransaction().commit();
       session.close();
       
       return listP;
    }
    
    public List<Produit> findProduitsByCritere(String critere) {
        List<Produit> listP;
        Session session = sf.openSession();
       session.beginTransaction();
       
       Query q = session.createQuery(critere);
       listP = q.list();
       
       session.getTransaction().commit();
       session.close();
       
       return listP;
    }
}
