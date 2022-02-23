/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class sanpham {

    private String masp;
    private String tensp;
    private int dongia;
    private ngay date;
    private int soluong;

    public sanpham() {
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void nhapsp() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap ma sp");
//        this.setMasp(sc.nextLine());
        System.out.println("nhap ten sp");
        this.setTensp(sc.nextLine());
        System.out.println("nhap don gia");
        this.setDongia(Integer.parseInt(sc.nextLine()));
        System.out.println("nhap so luong");
        this.setSoluong(Integer.parseInt(sc.nextLine()));
        System.out.println("nhap ngay san xuat");
        date = new ngay();
        System.out.println("nhap ngay");
        date.setNgay(Integer.parseInt(sc.nextLine()));
        System.out.println("nhap thang");
        date.setThang(Integer.parseInt(sc.nextLine()));
        System.out.println("nhap nam");
        date.setNam(Integer.parseInt(sc.nextLine()));

    }

    public void insp() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "sanpham{" + "masp=" + masp + ", tensp=" + tensp + ", dongia=" + dongia + ", ngay sx=" + date.getNgay() + "thang" + date.getThang() + "nam " + date.getNam() + ", soluong=" + soluong + '}';
    }

}
