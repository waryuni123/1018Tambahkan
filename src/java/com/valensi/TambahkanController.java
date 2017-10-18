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
@RequestMapping("/tambah")
public class TambahkanController {
    @RequestMapping(value="/{id}")
    public String tambah(@PathVariable Integer id,HttpSession session,Model model) {
        User user = (User) session.getAttribute("User");
        List<Produk> Pdk = user.getProduk();
        Pdk.add((Produk) session.getAttribute("ProdukDetail"));
        return "tambahkan";
    }
}
