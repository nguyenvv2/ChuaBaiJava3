/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chuabai.service;

import chuabai.model.SinhVien;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public interface SinhVienService {

    public Boolean them(SinhVien sinhVien);

    public Boolean xoa(int index);

    public ArrayList<SinhVien> timKiem(String tenSinhVien);

    public Boolean update(int index ,SinhVien sinhVien);

    public ArrayList<SinhVien> getList();
}
