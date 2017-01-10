/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.facturation2.control;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author youyou
 */
public class DaoControl {
    static SessionFactory sf;

    public DaoControl() {
    }
    public static SessionFactory sfCreation() {
        Configuration config = new Configuration().configure("hibernate.cfg.xml");
        ServiceRegistry registry =  new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        SessionFactory sf = config.buildSessionFactory(registry);
        
        return sf;
    }
}
