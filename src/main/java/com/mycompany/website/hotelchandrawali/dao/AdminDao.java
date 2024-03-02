/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.website.hotelchandrawali.dao;

import com.mycompany.website.hotelchandrawali.entities.Admin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author dipan
 */
public class AdminDao {

    public SessionFactory factory;

    public AdminDao(SessionFactory factory) {
        this.factory = factory;
    }

     public void saveAdmin(Admin admin) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(admin);

        transaction.commit();
        session.close();
    }
}
