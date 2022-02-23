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
public class khachhang {
 private String makh;
 private String tenkh;
 private int namsinh;
 private diachi diachi;
 private int hoadon;

    public khachhang() {
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public int getHoadon() {
        return hoadon;
    }

    public void setHoadon(int hoadon) {
        this.hoadon = hoadon;
    }
 
 
 public void themkh(){
     Scanner sc = new Scanner (System.in);
     System.out.println("nhap ma kh");
     this.setMakh(sc.nextLine());
     System.out.println("nhap tenkh");
     this.setTenkh(sc.nextLine());
     System.out.println("nhap nam sinh kh");
     this.setNamsinh(Integer.parseInt(sc.nextLine()));
     System.out.println("mjap dia chi");
     diachi = new diachi();
     System.out.println("to");
     diachi.setTo(sc.nextLine());
     System.out.println("phuong");
     diachi.setPhuong(sc.nextLine());
     System.out.println("quan");
     diachi.setQuan(sc.nextLine());
     System.out.println("thanh pho");
     diachi.setThanhpho(sc.nextLine());
 }
}
