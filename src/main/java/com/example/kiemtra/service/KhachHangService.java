package com.example.kiemtra.service;


import com.example.kiemtra.model.KhachHang;

import java.util.List;

public interface KhachHangService {
    List<KhachHang> getAll();
    void add(KhachHang khachHang);
    KhachHang findById(Integer maKhachHang);
    void delete(Integer maKhachHang);


}
