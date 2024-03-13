package com.example.kiemtra.service.impl;


import com.example.kiemtra.model.GioHang;
import com.example.kiemtra.repository.GioHangRepository;
import com.example.kiemtra.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GioHangServiceImpl implements GioHangService {
    @Autowired
    GioHangRepository gioHangRepository;

    @Override
    public List<GioHang> getAll() {
        return gioHangRepository.findAll();
    }

    @Override
    public void add(GioHang gioHang) {
        gioHangRepository.save(gioHang);
    }

    @Override
    public void delete(String maGioHang) {
        gioHangRepository.deleteById(maGioHang);
    }

    @Override
    public GioHang detail(String maGioHang) {
        return gioHangRepository.findById(maGioHang).get();
    }
}
