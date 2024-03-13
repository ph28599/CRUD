package com.example.kiemtra.service.impl;

import com.example.kiemtra.model.KhachHang;
import com.example.kiemtra.repository.KhachHangRepository;
import com.example.kiemtra.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    KhachHangRepository khachHangRepository;

    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public void add(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang findById(Integer maKhachHang) {
        return khachHangRepository.findById(maKhachHang).get();
    }

    @Override
    public void delete(Integer maKhachHang) {
        khachHangRepository.deleteById(maKhachHang);
    }
}
