package com.example.kiemtra.service;


import com.example.kiemtra.model.GioHang;

import java.util.List;

public interface GioHangService {
    List<GioHang> getAll();
    void add(GioHang gioHang);
    void delete(String maGioHang);
    GioHang detail(String maGioHang);

}
