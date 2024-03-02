/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.website.hotelchandrawali.entities;

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
@Table(name = "user")
public class User {
    
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    
    @Column(name = "user_name")
    private String userName;
    
    @Column(name = "user_address")
    private String userAddress;
    
    @Column(name = "user_email")
    private String userEmail;
    
    @Column(name = "user_phone_number")
    private long userPhoneNumber;
    
    @Column(name = "user_password")
    private String userPassword;
        
    @Column(name = "user_type")
    private String userType;
    
    
    public User() {
    }

    public User(String userName, String userAddress, String userEmail, long userPhoneNumber, String userPassword, String userType) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
        this.userPassword = userPassword;
        this.userType = userType;
    }

    
    
    
    
    
    
    
}
