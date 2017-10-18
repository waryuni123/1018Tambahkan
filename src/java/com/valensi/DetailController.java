/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import com.valensi.model.Produk;
import com.valensi.model.User;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/detail") // ini url nya
public class DetailController {
    @RequestMapping(value="/{id}")
    public String tampilkan(@PathVariable Integer id,HttpSession session,Model model) {
        User user = (User) session.getAttribute("User");
        Produk pro = new Produk();
        List<Produk> Pk =(List<Produk>) session.getAttribute("ListBarang");
        for(Produk p:Pk){
            if(p.getId().compareTo(id)==0){
                pro = p;
                
            }
        }
        model.addAttribute("Title", "Toko Sederhana");
        session.setAttribute("ProdukDetail", pro);
        return "detail";
    }
}
