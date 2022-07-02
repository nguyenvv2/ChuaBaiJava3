/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuabai.service.impl;

import chuabai.model.SinhVien;
import chuabai.service.SinhVienService;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public class SinhVienServiceImpl implements SinhVienService {

    private ArrayList<SinhVien> listSinhViens;

    public SinhVienServiceImpl() {
        listSinhViens = new ArrayList<>();
        SinhVien sv1 = new SinhVien("Nguyen Van A", 8.5, Boolean.TRUE, "CNTT");
        listSinhViens.add(sv1);
    }

    @Override
    public Boolean them(SinhVien sinhVien) {
        listSinhViens.add(sinhVien);
        return true;
    }

    @Override
    public Boolean xoa(int index) {
        listSinhViens.remove(index);
        return true;
    }

    @Override
    public ArrayList<SinhVien> timKiem(String tenSinhVien) {
        ArrayList<SinhVien> listOutPut = new ArrayList<>();
        for (SinhVien phieuMuon : listSinhViens) {
            if (phieuMuon.getTenSv().contains(tenSinhVien)) {
                listOutPut.add(phieuMuon);
            }
        }
        return listOutPut;
    }

    @Override
    public Boolean update(int index, SinhVien sinhVien) {
        SinhVien sv = listSinhViens.get(index);

        sv.setDiem(sinhVien.getDiem());
        sv.setGioiTinh(sinhVien.getGioiTinh());
        sv.setTenSv(sinhVien.getTenSv());
        sv.setTenLop(sinhVien.getTenLop());
        return true;

    }

    @Override
    public ArrayList<SinhVien> getList() {

        return listSinhViens;
    }

}
