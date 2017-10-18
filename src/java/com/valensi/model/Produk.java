/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.model;

/**
 *
 * @author user
 */
public class Produk {
    
    private Integer id;
    private String namaproduk;
    private Double harga;
    private String ketPro;

    public Produk(Integer id, String namaproduk, Double harga, String ketPro) {
        this.id = id;
        this.namaproduk = namaproduk;
        this.harga = harga;
        this.ketPro = ketPro;
    }

    public Produk() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaproduk() {
        return namaproduk;
    }

    public void setNamaproduk(String namaproduk) {
        this.namaproduk = namaproduk;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getKetPro() {
        return ketPro;
    }

    public void setKetPro(String ketPro) {
        this.ketPro = ketPro;
    }
    
    
}
