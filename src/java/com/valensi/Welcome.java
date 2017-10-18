/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import com.valensi.model.Produk;
import com.valensi.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/welcome")
public class Welcome {
    
    List<Produk> produk= new ArrayList<>();
    User user = new User("yuni","Benar",produk);
    
    @RequestMapping
    public String tampilkan(HttpSession session,Model model) {
        model.addAttribute("Title", "Toko Sederhana");
        
        Produk produk1= new Produk(1,"Pulpen",12000.0," cobalah ");
        Produk produk2= new Produk(2,"Pensil",10000.0,"putih");
        List<Produk> pd = new ArrayList<>();
        pd.add(produk1);
        pd.add(produk2);
        model.addAttribute("pd",pd);
        session.setAttribute("ListBarang",pd);
        session.setAttribute("User", user);
        return "welcome";
    }
}
