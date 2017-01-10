/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.facturation2.testes;

import com.hibernate.facturation2.control.DaoControl;
import com.hibernate.facturation2.model.Produit;
import com.hibernate.facturation2.view.FacturationApp2UI;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author youyou
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        FacturationApp2UI frame = new FacturationApp2UI();
        float h = frame.getHeight();
        float v = frame.getWidth();
        JOptionPane.showMessageDialog(null, "h : "+h+ "\nv : "+v);
        h = frame.getPanel().getHeight();
        v = frame.getPanel().getWidth();
        JOptionPane.showMessageDialog(null, "h : "+h+ "\nv : "+v);
    }
}
