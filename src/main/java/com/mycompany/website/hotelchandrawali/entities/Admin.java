/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.website.hotelchandrawali.entities;

import com.mycompany.website.hotelchandrawali.dao.AdminDao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author dipan
 */


@Entity
@Table(name = "admin")
public class Admin{
    
    @Id
    @Column(name = "admin_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long adminId;
    
    
    @Column(name = "admin_name")
    private String adminName;
    
    @Column(name = "admin_email")
    private String adminEmail;
    
    @Column(name = "admin_phone_number")
    private String adminPhoneNumber;
    
    @Column(name = "admin_password")
    private String adminPassword;

    public Admin() {
    }

    public Admin(String adminName, String adminEmail, String adminPhoneNumber, String adminPassword) {
        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.adminPhoneNumber = adminPhoneNumber;
        this.adminPassword = adminPassword;
    }
    

    
}
