package com.bai.themsampham.model;



public class LoaiSP {
    private String id;
    private String name;
    private String hinhanh;
    private String soSanPhamThuocLoai;

    public LoaiSP() {
    }

    public LoaiSP(String id, String name, String hinhanh, String soSanPhamThuocLoai) {
        this.id = id;
        this.name = name;
        this.hinhanh = hinhanh;
        this.soSanPhamThuocLoai = soSanPhamThuocLoai;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public String getSoSanPhamThuocLoai() {
        return soSanPhamThuocLoai;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public void setSoSanPhamThuocLoai(String soSanPhamThuocLoai) {
        this.soSanPhamThuocLoai = soSanPhamThuocLoai;
    }

    @Override
    public String toString() {
        return "LoaiSP{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hinhanh='" + hinhanh + '\'' +
                ", soSanPhamThuocLoai=" + soSanPhamThuocLoai +
                '}';
    }
}

