package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TruyenDuLieuSangView {

    @GetMapping("/")
    public String hienThiThongTin(Model model) {
        // Thêm dữ liệu vào Model
        model.addAttribute("maSoSinhVien", "64130985");
        model.addAttribute("hoTen", "Nguyễn Ngọc Khánh");
        model.addAttribute("namSinh", 2004);
        model.addAttribute("gioiTinh", "Nam");

        return "TruyenDuLieuSangView";
    }
}