package com.example.kiemtra.controller;

import com.example.kiemtra.model.GioHang;
import com.example.kiemtra.model.KhachHang;
import com.example.kiemtra.service.GioHangService;
import com.example.kiemtra.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GioHangController {
    @Autowired
    public GioHangService gioHangService;
    public List<GioHang> gioHangList;
    @Autowired
    public KhachHangService khachHangService;
    public List<KhachHang> khachHangList;

    @GetMapping("/gio-hang/hien-thi")
    public String hienThi(Model model){
        gioHangList=gioHangService.getAll();
        model.addAttribute("gioHangList",gioHangList);
        khachHangList=khachHangService.getAll();
        model.addAttribute("khachHangList",khachHangList);
        return "index";
    }
    @PostMapping("/gio-hang/add")
    public String add(Model model, @RequestParam("NguoiSoHuu") Integer maKhachHang, GioHang gioHang){
        KhachHang khachHang = khachHangService.findById(maKhachHang);
        gioHang.setKhachHang(khachHang);
        gioHangService.add(gioHang);
        return "redirect:/gio-hang/hien-thi";
    }
    @GetMapping("/gio-hang/delete/{maGioHang}")
    public String delete(Model model, @PathVariable("maGioHang") String maGioHang){
        gioHangService.delete(maGioHang);
        return "redirect:/gio-hang/hien-thi";
    }
    @GetMapping("/gio-hang/detail/{maGioHang}")
    public String detail(Model model, @PathVariable("maGioHang") String maGioHang, GioHang gioHang){
        GioHang gh = gioHangService.detail(maGioHang);
        model.addAttribute("gh",gh);
        gioHangList=gioHangService.getAll();
        model.addAttribute("gioHangList",gioHangList);
        khachHangList=khachHangService.getAll();
        model.addAttribute("khachHangList",khachHangList);
        return "index";
    }
    @GetMapping("/gio-hang/viewUpdate/{maGioHang}")
    public String viewUpdate(Model model, @PathVariable("maGioHang") String maGioHang, GioHang gioHang){
        GioHang gh = gioHangService.detail(maGioHang);
        model.addAttribute("gh",gh);
        gioHangList=gioHangService.getAll();
        model.addAttribute("gioHangList",gioHangList);
        khachHangList=khachHangService.getAll();
        model.addAttribute("khachHangList",khachHangList);
        return "viewUpdate-GioHang";
    }
    @PostMapping("/gio-hang/update")
    public String update(Model model, @RequestParam("NguoiSoHuu") Integer maKhachHang, GioHang gioHang){
        KhachHang khachHang = khachHangService.findById(maKhachHang);
        gioHang.setKhachHang(khachHang);
        gioHangService.add(gioHang);
        return "redirect:/gio-hang/hien-thi";
    }




}
