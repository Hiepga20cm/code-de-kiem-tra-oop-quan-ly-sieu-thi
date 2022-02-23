package javaapplication11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication11 {

    public static void main(String[] args) {
        ArrayList<khachhang> kh = new ArrayList<>();
        ArrayList<sanpham> sp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("nhap lua chon");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("nhap nhieu sp neu trung ma sp thi nhap lai");
                    sanpham spham = new sanpham();
                    System.out.println("nhap ma sp");
                    spham.setMasp(sc.nextLine());
                    int t = 0;
                    for (int i = 0; i < sp.size(); i++) {
                        if (spham.getMasp().equals(sp.get(i).getMasp())) {
                            //sp.get(i).setMasp(spham.getMasp()+sp.get(i).getMasp());
                            System.out.println("nhap so luong");
                            spham.setSoluong(Integer.parseInt(sc.nextLine()));
                            sp.get(i).setSoluong(sp.get(i).getSoluong() + spham.getSoluong());
                            t = 1;
                        }

                    }
                    if (t == 0) {
                        spham.nhapsp();
                        sp.add(spham);
                    }
                    break;
                case 2:
                    System.out.println("them lhach hang bat ky");
                    khachhang khang = new khachhang();
                    khang.themkh();
                    kh.add(khang);
                    break;
                case 3:
                    int chon2;
                    System.out.println("nam sinh hay ma ?");
                    chon2 = Integer.parseInt(sc.nextLine());
                    switch (chon2) {
                        case 1:
                            System.out.println("nhap ten khach hang can thay doi");
                            String ten;
                            ten = sc.nextLine();
                            for (int i = 0; i < kh.size(); i++) {
                                if (ten.equals(kh.get(i).getTenkh())) {
                                    System.out.println("nhap lai ten moi");
                                    kh.get(i).setTenkh(sc.nextLine());
                                }
                            }
                            break;
                        case 2:
                            System.out.println("nhap ma khach hang can thay doi");
                            String ma;
                            ma = sc.nextLine();
                            for (int i = 0; i < kh.size(); i++) {
                                if (ma.equals(kh.get(i).getMakh())) {
                                    System.out.println("nhap lai ma moi");
                                    kh.get(i).setMakh(sc.nextLine());
                                }
                            }
                            break;

                    }
                    break;
                case 4:
                    System.out.println("in ra san pham hien co");
                    for (int i = 0; i < sp.size(); i++) {
                        sp.get(i).insp();
                    }
                    break;
                case 5:
                    System.out.println("cho phep khach hang mua sp va tinh tien");

                    System.out.println("nhap ma sp ma khach hang muon mua");
                    String masp;
                    int hoadon = 0,
                     check = 1;
                    int soluong;
                    masp = sc.nextLine();

                    for (int i = 0; i < sp.size(); i++) {
                        if (masp.equals(sp.get(i).getMasp())) {
                            check = 0;
                            System.out.println("nhap so luong muon mua nho hon hoac bang " + sp.get(i).getSoluong());
                            soluong = Integer.parseInt(sc.nextLine());
                            if (soluong <= sp.get(i).getSoluong()) {
                                hoadon += (soluong * sp.get(i).getDongia());
                                sp.get(i).setSoluong(sp.get(i).getSoluong() - soluong);
                            } else {
                                System.out.println("khong du hang");
                                break;
                            }
                        }
                    }
                    if (check == 1) {
                        System.out.println("ma sp khong dung");
                        break;
                    }
                    System.out.println("nhap ma khach hang");
                    String makh;
                    makh = sc.nextLine();
                    for (int i = 0; i < kh.size(); i++) {
                        if (makh.equals(kh.get(i).getMakh())) {
                            kh.get(i).setHoadon(hoadon);
                        } else {

                            khachhang khangmoi = new khachhang();
                            khangmoi.themkh();
                            kh.add(khangmoi);
                        }
                    }
                    break;
                case 6:
                    System.out.println("sap xap theo thu tu tang dan cua so tien ma khach hang mua theo thu tu tang dan");
                    int h[] = new int[20];
                    int temp;
                    for (int i = 0; i < kh.size(); i++) {
                        h[i] = kh.get(i).getHoadon();
                    }
                    // sap xep 
                    for (int i = 0; i < kh.size() - 1; i++) {
                        for (int j = 1; j < kh.size(); j++) {
                            if (h[i] < h[j]) {
                                temp = h[i];
                                h[i] = h[j];
                                h[j] = temp;
                            }
                        }
                    }

                    for (int i = 0; i < kh.size(); i++) {
                        for (int j = 0; j < kh.size(); j++) {
                            if (h[i] == kh.get(j).getHoadon()) {
                                System.out.println("khach hang so " + i);
                                System.out.println("ten khach hang :" + kh.get(j).getTenkh());
                            }
                        }
                    }
                    break;

            }
        } while (chon != 0);

    }

}
