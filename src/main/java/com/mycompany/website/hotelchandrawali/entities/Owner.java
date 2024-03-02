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
import org.hibernate.annotations.DynamicInsert;

/**
 *
 * @author dipan
 */
@Entity
@Table(name = "owner")
@DynamicInsert
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private int ownerId;

    @Column(name = "owner_name",columnDefinition = "varchar(255) default 'Abhishek Singh'")
    private String ownerName;

    @Column(name = "owner_email" , columnDefinition = "varchar(255) default 'originalabhisekhsingh@gmail.com'")
    private String ownerEmail;

    @Column(name = "owner_phone_number", columnDefinition = "varchar(255) default '7845830924'")
    private String ownerPhoneNumber;
    
    @Column(name = "owner_password",columnDefinition = "varchar(255) default ''")
    private String ownerPassword;

    public Owner() {
    }
    
    
    public Owner(String ownerName, String ownerEmail, String ownerPhoneNumber) {
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public String getOwnerPassword() {
        return ownerPassword;
    }

    public void setOwnerPassword(String ownerPassword) {
        this.ownerPassword = ownerPassword;
    }
    
    

    
}
