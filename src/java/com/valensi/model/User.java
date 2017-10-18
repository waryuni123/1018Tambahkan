/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.model;

import java.util.List;

/**
 *
 * @author user
 */
public class User {
   private String userName;
   private String password;
   private List<Produk> produk;

    public User(String userName, String password, List<Produk> produk) {
        this.userName = userName;
        this.password = password;
        this.produk = produk;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Produk> getProduk() {
        return produk;
    }

    public void setProduk(List<Produk> produk) {
        this.produk = produk;
    }
   
}
