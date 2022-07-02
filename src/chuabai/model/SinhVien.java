/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuabai.model;

/**
 *
 * @author nguyenvv
 */
public class SinhVien {

    private String tenSv;

    private Double diem;

    private Boolean gioiTinh;

    private String tenLop;

    public SinhVien() {
    }

    public SinhVien(String tenSv, Double diem, Boolean gioiTinh, String tenLop) {
        this.tenSv = tenSv;
        this.diem = diem;
        this.gioiTinh = gioiTinh;
        this.tenLop = tenLop;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String hienThiGioiTinh() {
        if (gioiTinh) {
            return "Nam";
        } else {
            return "Nữ";
        }
    }

    public String xepLoai() {
        if (diem >= 5) {
            return "Tốt";
        } else {
            return "Yếu";
        }
    }

}
